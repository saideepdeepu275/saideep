package com;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.CategoryDao;
import com.model.Category;



@Ignore
public class CategoryTest
{
	

	static CategoryDao categoryDao;
	
@BeforeClass
public static void initialize()
{
	@SuppressWarnings("resource")
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
category.setCatId(1142);
category.setCatName("xyz");
category.setCatDesc("xyz");
System.out.println("Value set calling Dao");

assertTrue(categoryDao.addCategory(category));
}




@Ignore
@Test
public void updateCategoryTest()
{
    Category category=new Category();
    category.setCatId(1002);
    category.setCatName("JMShirt");
    category.setCatDesc("John Miller Shirt with Best Price");
     
    assertTrue(categoryDao.updateCategory(category));
}
@Ignore
@Test
public void deleteCategoryTest()
{
    Category category=new Category();
    category.setCatId(1002);
    assertTrue(categoryDao.deleteCategory(category));
}
@Ignore
@Test
public void retrieveCategoryTest()
{
    List<Category> listCategory=categoryDao.retrieveCategory();
    assertNotNull("Problem in Retriving ",listCategory);
    this.show(listCategory);
}
 
public void show(List<Category> listCategory)
{
    for(Category category:listCategory)
    {
        System.out.println("Category ID:"+category.getCatId());
        System.out.println("Category Name:"+category.getCatName());
    }
}
 @Ignore
@Test
public void getCategoryTest()
{
    Category category=categoryDao.getCategory(101);
    assertNotNull("Problem in Getting:",category);
    System.out.println("Category ID:"+category.getCatId());
    System.out.println("Category Name:"+category.getCatName());
    System.out.println("Category Description  = "+category.getCatDesc());
}

}