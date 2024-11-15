package com.example.membership.entity;

import com.example.membership.constant.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class MemberShip {

    @Id     // 제약조건 : pk 기본키
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    @Column(nullable = false)
    private String name;    // 이름       제약조건 : not null

    @Column(unique = true, nullable = false)
    private String email;   // 이메일     제약조건 : 유니크

    @Column(nullable = false)
    private String password; // 비밀번호  제약조건 : not null

    @Column(nullable = false)
    private String address;  // 주소     제약조건 : not null

    // 권한
    @Enumerated(EnumType.STRING)
    private Role role;

}
