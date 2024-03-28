package com.justboot.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class Emp {

	private Integer id;
	private String username;
	private String password;
	private String name;
	private Short gender;
	private String image;
	private Short job;
	private LocalDate entrydate;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;

}
