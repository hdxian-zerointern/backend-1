package com.example.jpa.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JWTUtils {

    private static final String KEY = "hdxianjapex";

    public static String getIssuer(String token) {

        String issuer = JWT.require(Algorithm.HMAC512(KEY.getBytes()))
                .build()
                .verify(token)
                .getIssuer();

        return issuer;

    }


}
