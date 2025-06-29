package com.example.oauthjwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username; // 우리 서비스내 에서의 사용자 이름
    private String name; // 사용자 본명

    private String email; // 사용자 이메일

    private String role; // 사용자 구분
}