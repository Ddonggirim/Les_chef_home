package com.example.LesChef.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.parameters.P;
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
    @NotBlank(message = "아이디를 입력해주세요")
    @Email
    @Column(name = "id")
    private String id;
    @NotBlank(message = "비밀번호를 입력해주세요")
    //수정
//    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,20}$",
//            message = "비밀번호를 대문자, 소문자, 숫자, 특수문자를 포함하여 8~20자로 작성해주세요")
//    @Size(min = 1, max = 50, message = "비밀번호를 1~50자로 작성해주세요")
    @Column(name = "password", nullable = false)
    private String password;
    @NotBlank(message = "이름을 입력해주세요")
    @Size(min = 1, max = 50, message = "이름을 1~50자로 작성해주세요")
    @Column(name = "name", nullable = false)
    private String name;
    @NotBlank(message = "닉네임을 입력해주세요")
    @Pattern(regexp = "[a-zA-Z가-힣\\d]{2,10}",
            message = "닉네임을 한글, 영어, 숫자만 포함하여 2~10자로 작성해주세요")
    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;
    @NotBlank(message = "전화번호를 입력해주세요")
    @Pattern(regexp = "^(\\d{2,3})-(\\d{3,4})-(\\d{4})$",
            message = "전화번호는 **-***-****형식으로 작성해주세요")
    @Column(name = "tel")
    private String tel;
    @Column(name = "customerImg")
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


