package com.c0822g1primaryschoolbe.jwt;

import com.c0822g1primaryschoolbe.service.principle.AccountPrinciple;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {
    private static final Logger logger = LoggerFactory.getLogger(JwtProvider.class);
    private final String jwtSecret = "tranvansy@gmail.com";
   private int jwtExpiration = 86400;
    public String createToken(Authentication authentication) {
        AccountPrinciple accountPrinciple = (AccountPrinciple) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(accountPrinciple.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + jwtExpiration*1000))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        } catch (ExpiredJwtException e) {
            logger.error("Expired JWT token -> Message: {}", e);
        } catch (UnsupportedJwtException e) {
            logger.error("Unsupported JWT token -> Message: {}", e);
        } catch (MalformedJwtException e) {
            logger.error("The token invalid format -> Message: {}", e);

        } catch (SignatureException e) {
            logger.error("Invalid JWT Signature -> Message: {}", e);

        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty -> Message: {}", e);
        }
        return false;
    }

    public String getUserNameFromToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }
}
