package com;


import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.CategoryDao;
import com.model.Category;

public class CategoryTest
{
	
	private static CategoryDao categoryDao;
	
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext ConfigAppLnContext=new AnnotationConfigApplicationContext();
	ConfigAppLnContext.scan("com");
	ConfigAppLnContext.refresh();
	//SessionFactory sessionFactory=(SessionFactory) (ConfigAppLnContext.getBean("com.hibernateConfig.DataBaseConfig.class"));
  categoryDao=(CategoryDao)ConfigAppLnContext.getBean("categoryDao");

}

@Test
public void addCategoryTest()
{
	System.out.println("Inside Junit test");
Category category= new Category();
category.setCatId(1002);
category.setCatName("xyz");
category.setCatDesc("xyz");
System.out.println("Value set calling Dao");
assertTrue(categoryDao.addCategory(category));
}

}
