/*
 * Copyright 2018 peipeihh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 */
package com.pphh.oauth.core.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.pphh.oauth.core.identity.DefaultIdentity;
import com.pphh.oauth.core.identity.Identity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Please add description here.
 *
 * @author huangyinhuang
 * @date 7/2/2018
 */
public class JwtUtil {

    private static final Logger log = LoggerFactory.getLogger(JwtUtil.class);

    /**
     * 根据Identity信息，生成Json Web Token格式的令牌
     *
     * @param identity 用户信息
     * @return Json web token令牌
     */
    public static String encode(Identity identity, Timestamp expireTime, String secret, String issuer) {
        String jwtToken = null;

        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTCreator.Builder jwtBuilder = JWT.create();
            jwtBuilder.withIssuer(issuer);
            jwtBuilder.withJWTId(UUID.randomUUID().toString());

            jwtBuilder.withIssuedAt(new Date());
            jwtBuilder.withExpiresAt(expireTime);

            // add claims with common identity info
            jwtBuilder.withSubject(identity.getName());
            jwtBuilder.withClaim("user_name", identity.getName());
            jwtBuilder.withClaim("user_mail", identity.getEmail());
            jwtBuilder.withClaim("user_role", identity.getRole());
            jwtBuilder.withClaim("user_org", identity.getOrganzation());

            // add claims with additional identity info
            Map<String, String> additionalInfos = identity.getAdditionalInfomation();
            for (Map.Entry<String, String> entry : additionalInfos.entrySet()) {
                jwtBuilder.withClaim(entry.getKey(), entry.getValue());
            }

            jwtToken = jwtBuilder.sign(algorithm);

        } catch (UnsupportedEncodingException | JWTCreationException exception) {
            log.error("failed to generate the jwt token.", exception);
        }

        return jwtToken;
    }

    /**
     * 根据Json Web Token解码出用户Identity信息
     *
     * @param jwtToken
     * @return 用户信息
     */
    public static Identity decode(String jwtToken) {
        Identity identity = null;

        try {
            DecodedJWT jwt = JWT.decode(jwtToken);
            String userName = jwt.getClaim("user_name").asString();
            String userMail = jwt.getClaim("user_mail").asString();
            String userRole = jwt.getClaim("user_role").asString();
            String userOrg = jwt.getClaim("user_org").asString();
            String clientId = jwt.getClaim("client_id").asString();

            identity = new DefaultIdentity(userName);
            identity.setEmail(userMail);
            identity.setOrganzation(userOrg);
            identity.setRole(userRole);
            identity.fillAdditionalInfomation("clientId", clientId);
        } catch (Exception e) {
            log.error("failed to decode the jwt token.", e.getMessage());
        }

        return identity;
    }

}
