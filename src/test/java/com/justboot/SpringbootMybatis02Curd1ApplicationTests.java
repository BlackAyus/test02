package com.justboot;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.justboot.mapper.EmpMapper;
import com.justboot.pojo.Emp;

@SpringBootTest
class SpringbootMybatis02Curd1ApplicationTests {
	
    @Autowired
	private EmpMapper empMapper;
//    @Test
//    public void delete() {
//    	int i = empMapper.delete(15);
//    	System.out.println(i);
//    }
    
//    @Test
//    public void testinsert() {
//    	Emp e = new Emp();
//    	e.setUsername("000123");
//    	e.setPassword("1234");
//    	e.setName("shohei");
//    	e.setImage("2.jpg");
//    	e.setGender((short)1);
//    	e.setJob((short)2);
//    	e.setEntrydate((LocalDate.of(2004, 01, 01)));
//    	e.setCreate_time(LocalDateTime.now());
//    	e.setUpdate_time(LocalDateTime.now());
//    	empMapper.insert(e);
//    	System.out.println(e.getId());
//    }
    
//    @Test
//    public void testupdate() {
//    	Emp e = new Emp();
//    	e.setUsername("2588763");
//    	e.setJob((short)1);
//    	e.setUpdate_time(LocalDateTime.now());
//    	e.setId(20);
//    	empMapper.update(e);
//    }
    
//	     @Test
//	     public void testselect() {
//	    	 Emp e = empMapper.getbyid2(12);
//	    	 System.out.println(e);	 
//	     }  
       @Test
       public void testselect() {
    	  List<Emp> e = empMapper.list(null,null,null,null);
    	  System.out.println(e); 
       }
       
//     @Test
//     public void testupdate() {
//     	Emp e = new Emp();
//     	e.setUsername("98765432");
//     	e.setJob((short)0);
//     	e.setId(20);   	
//     	empMapper.update2(e);
//     }
    
//       @Test
//       public void testdelete() {
//    	   List<Integer> as = Arrays.asList(13,18,20);
//    	   empMapper.delete2(as);	   
//       }
       
}

