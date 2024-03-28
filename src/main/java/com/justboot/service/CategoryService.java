package com.justboot.service;

import java.util.List;

import com.justboot.pojo.Category;

public interface CategoryService {

	List<Category> list();

	void add(Category c);

	List<Category> search(Category c);

}
