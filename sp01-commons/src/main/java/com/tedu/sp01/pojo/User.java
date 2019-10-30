package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	/** 用户id */
	private Integer id;
	/** 用户名 */
	private String username;
	/** 用户密码 */
	private String password;
}