package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.request.SignInForm;
import com.c0822g1primaryschoolbe.dto.request.SignUpForm;
import com.c0822g1primaryschoolbe.dto.response.JwtResponse;
import com.c0822g1primaryschoolbe.dto.response.ResponseMessage;
import com.c0822g1primaryschoolbe.entity.account.Account;
import com.c0822g1primaryschoolbe.entity.account.Role;
import com.c0822g1primaryschoolbe.entity.account.RoleName;
import com.c0822g1primaryschoolbe.jwt.JWTProvider;
import com.c0822g1primaryschoolbe.service.IAccountService;
import com.c0822g1primaryschoolbe.service.IRoleService;
import com.c0822g1primaryschoolbe.service.principle.AccountPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private IAccountService iAccountService;
    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTProvider jwtProvider;

    /**
     * Created by: SyTV
     * Date created: 27/02/2023
     * Function: authenticate account password
     *
     * @param signInForm
     * @return ResponseEntity.ok with jwtResponse(token,name,id,username,email,avatar,roles)
     */

    @PostMapping("/sign-in")
    public ResponseEntity<?> login(@Valid @RequestBody SignInForm signInForm) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInForm.getUsername(), signInForm.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtProvider.createToken(authentication);
        AccountPrinciple accountPrinciple = (AccountPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return ResponseEntity.ok(new JwtResponse(token,
                accountPrinciple.getName(),
                accountPrinciple.getId(), accountPrinciple.getUsername(),
                accountPrinciple.getEmail(), accountPrinciple.getAvatar(),
                accountPrinciple.getAuthorities()));

    }

    /**
     * Created by: SyTV
     * Date created: 28/02/2023
     * Function: signup account
     *
     * @param signUpForm
     * @return HttpStatus.Ok with message(Đăng ký thành công) or HttpStatus.BAD_REQUEST with message(Đăng ký thất bại)
     */

    @PostMapping("/sign-up")
    public ResponseEntity<?> register(@Valid @RequestBody SignUpForm signUpForm) {
        if (iAccountService.existsAccountByUsername(signUpForm.getUsername())) {
            return new ResponseEntity<>(new ResponseMessage("Tên đăng nhập " + signUpForm.getUsername() + " đã được sử dụng, vui lòng chọn tên khác"), HttpStatus.BAD_REQUEST);
        }
        if (iAccountService.existsAccountByEmail(signUpForm.getEmail())) {
            return new ResponseEntity<>(new ResponseMessage("Email đã tồn tại"), HttpStatus.BAD_REQUEST);
        }
        Account account = new Account(signUpForm.getUsername(), passwordEncoder.encode(signUpForm.getPassword()), signUpForm.getName(), signUpForm.getEmail());
        Set<Role> roles = new HashSet<>();
        Role roleEmployee = iRoleService.findByName(RoleName.ROLE_TEACHER).orElseThrow(() -> new RuntimeException("Role not found"));
        roles.add(roleEmployee);
        account.setRoles(roles);
        iAccountService.save(account);
        return new ResponseEntity<>(new ResponseMessage("Đăng kí thành công"), HttpStatus.OK);
    }
}
