package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.payload.JwtResponse;
import com.c0822g1primaryschoolbe.dto.payload.LoginRequest;
import com.c0822g1primaryschoolbe.jwt.JwtProvider;
import com.c0822g1primaryschoolbe.jwt.JwtTokenFilter;
import com.c0822g1primaryschoolbe.service.IAccountService;
import com.c0822g1primaryschoolbe.service.principle.AccountPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/public")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SecurityRestController {
    @Autowired
    private IAccountService iAccountService;

    @Autowired
    private IAccountService accountService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private JwtTokenFilter jwtTokenFilter;

    @PostMapping("/sign-in")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtProvider.createToken(authentication);
        AccountPrinciple accountPrinciple = (AccountPrinciple) authentication.getPrincipal();
        return ResponseEntity.ok(new JwtResponse(token,
                accountPrinciple.getName(),
                accountPrinciple.getAuthorities(),
                accountPrinciple.getUsername(),
                accountPrinciple.getAccountId(),
                accountPrinciple.getEmail(),
                accountPrinciple.getAvatar()));
    }
}
