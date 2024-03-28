package com.justboot.mapper;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.justboot.pojo.Category;
import com.justboot.pojo.Emp;

@Mapper
public interface EmpMapper {
	
	@Delete("delete from tb_emp where id = #{id}")
	public int delete(Integer id);
	
	@Options(useGeneratedKeys = true, keyProperty = "id")
	@Insert("insert into tb_emp(username,`password`,`name`,gender,image,job,entrydate,create_time,update_time)" + 
			" values(#{username},#{password},#{name},#{gender},#{image},#{job},#{entrydate},#{create_time},#{update_time})")
	public void insert(Emp emp);
	
//	@Update("update tb_emp set username = #{username}, job = #{job}, update_time = #{update_time} where id = #{id}")
//	public void update(Emp emp);
	
	@Select("select * from tb_emp where id = #{id}")
	public Emp getbyid(Integer id);
	
//	@Select("select * from tb_emp where `name` like concat('%',#{name},'%') and gender = #{gender} and "
//			+ "entrydate between #{begin} and #{end}")
//	public List<Emp> list(String name, short gender, LocalDate begin, LocalDate end);
	
	public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
	
	public void update2(Emp emp);

	public void delete2(List<Integer> del);

	@Select("select * from category")
	public List<Category> list2();
	@Insert("insert into category(cat_name,cat_alias,create_id,create_time,update_time)"
			+ " values(#{catName},#{catAlias},#{createId},#{createTime},#{updateTime})")
	public void add(Category c);

	public List<Category> search(Category c);
	
//	public Emp getbyid2(Integer id);

	
	

}
