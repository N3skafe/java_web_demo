package com.example.demo.model.service;


import com.example.demo.model.domain.Member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.Size;
import lombok.*;


@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data // getter, setter, toString, equals 등 자동 생성

public class AddMemberRequest {

    @NotBlank(message = "이름을 입력하십시오")
    @Size(min = 2, max = 50, message = "이름은 2자 이상 50자 이하여야 합니다.")
    private String name;

    @Email(message = "이메일 형식이 올바르지 않습니다.")
    @NotBlank(message = "이메일을 입력하십시오")
    private String email;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,20}$",
             message = "비밀번호는 8~20자이며, 영문자, 숫자, 특수문자를 포함해야 합니다.")
    private String password;

    @Pattern(regexp = "19~90", message = "나이는 19세에서 90세 사이여야 합니다.")
    private String age;

    @NotEmpty(message = "휴대폰 번호를 입력하십시오")
    private String mobile;

    @NotEmpty(message = "주소를 입력하십시오")
    private String address;

    // private String name;
    // private String email;
    // private String password;
    // private String age;
    // private String mobile;
    // private String address;
    
        public Member toEntity(){ // Member 생성자를 통해 객체 생성
            return Member.builder()
                .name(name)
                .email(email)
                .password(password)
                .age(age)
                .mobile(mobile)
                .address(address)
                .build();
    }
}
