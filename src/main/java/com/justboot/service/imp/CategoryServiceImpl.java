package com.justboot.service.imp;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justboot.mapper.EmpMapper;
import com.justboot.pojo.Category;
import com.justboot.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private EmpMapper empMapper;
	@Override
	public List<Category> list() {
		List<Category> list =  empMapper.list2();
		return list;
	}
	@Override
	public void add(Category c) {
		c.setCreateId(18);
		c.setCreateTime(LocalDateTime.now());
		c.setUpdateTime(LocalDateTime.now());
		empMapper.add(c);		
	}
	@Override
	public List<Category> search(Category c) {
		List<Category> list = empMapper.search(c);
		return list;
	}

}
