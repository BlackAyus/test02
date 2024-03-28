package com.justboot.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 文章分類實體類別
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

	private Integer id;
	private String catName;
	private String catAlias;
	private Integer createId;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	public interface Update{
		
	}
	
    public interface Add{
		
	}
}
