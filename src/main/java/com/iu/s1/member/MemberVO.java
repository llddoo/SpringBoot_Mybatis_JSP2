package com.iu.s1.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
//import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class MemberVO {
	
	private String username;
	@Size(min = 4)
	private String password;
	
	@NotEmpty //name은 null이 아니여야 한다는 의미
	private String name;
	@Email
	@NotEmpty
	private String email;
	private String phone;
	//0이상 200이하
	@Range(min = 0, max = 200)
	private Integer age;

}
