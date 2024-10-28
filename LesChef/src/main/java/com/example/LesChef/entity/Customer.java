package com.example.LesChef.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Table(name= "customer")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class Customer implements UserDetails {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE) 오라클은 IDENTITY를 지원 안함
    @Column(name = "id")
    private String id;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;
    @Column(name = "tel")
    private String tel;
    @Column(name = "customerImg", nullable = false)
    private String customerImg;

    @Builder
    public Customer(String id, String password, String name, String nickname, String tel, String customerImg){
        this.id = id;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.tel = tel;
        this.customerImg = customerImg;

    }

    // List.of는 여러개를 반환, singleton은 불변set 반환
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.singleton(new SimpleGrantedAuthority("ROLE_CUSTOMER"));
//    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_CUSTOMER"));
    }

    @Override
    public String getUsername() {
        return id;
    }
    @Override
    public String getPassword() {
        return password;
    }


    // 계정 만료 여뷰
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 패스워드 만료 여부
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 계정 사용 가능 여부
    @Override
    public boolean isEnabled() {
        return true;
    }
}


