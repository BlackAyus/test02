package com.justboot.controllertest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justboot.pojo.Category;
import com.justboot.pojo.Result;
import com.justboot.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController()
@CrossOrigin
@RequestMapping("/test")
public class CategoryController {
     
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public Result list() {
		List<Category> cate = categoryService.list();
		log.info("GET請求收到");
		return Result.success(cate);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Category c) {
		log.info("POST請求收到");
		categoryService.add(c);
		return Result.success("新增成功");
	}
	
	@GetMapping("/sear")
	public Result search(Category c) {
		if(c != null) {
			log.info("準備搜尋...", c);
			System.out.println(c.getCatName());
			System.out.println(c.getCatAlias());
		}
		List<Category> list = categoryService.search(c);
		return Result.success(list);
	}
}
