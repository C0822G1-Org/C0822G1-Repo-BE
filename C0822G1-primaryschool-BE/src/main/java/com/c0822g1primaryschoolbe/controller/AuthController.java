package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.request.SignInForm;
import com.c0822g1primaryschoolbe.dto.response.JwtResponse;
import com.c0822g1primaryschoolbe.jwt.JWTProvider;
import com.c0822g1primaryschoolbe.service.IAccountService;
import com.c0822g1primaryschoolbe.service.principle.AccountPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private IAccountService iAccountService;
//    @Autowired
//    private IRoleService iRoleService;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
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

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody SignInForm signInForm) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInForm.getUsername(), signInForm.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtProvider.createToken(authentication);
        AccountPrinciple accountPrinciple = (AccountPrinciple) authentication.getPrincipal();
        return ResponseEntity.ok(new JwtResponse(token,
                accountPrinciple.getName(),
                accountPrinciple.getId(), accountPrinciple.getUsername(),
                accountPrinciple.getEmail(), accountPrinciple.getAvatar(),
                accountPrinciple.getAuthorities()));

    }
}
