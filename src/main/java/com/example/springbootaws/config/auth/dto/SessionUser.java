package com.example.springbootaws.config.auth.dto;

import com.example.springbootaws.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * 클래스명 : SessionUser
 * 기능요약 : 소셜로그인 인증된 사용자 정보만 저장
 * 생성자 : minki
 * 생성일 : 2022. 10. 06.
 **/
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}