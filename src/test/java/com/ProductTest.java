
package com;

import static org.junit.Assert.*;

import javax.validation.constraints.AssertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.ProductDao;
import com.model.Product;
/*

public class ProductTest

{
	private static ProductDao productDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext ConfigAppLnContext=new AnnotationConfigApplicationContext();
		ConfigAppLnContext.scan("com.");
		ConfigAppLnContext.refresh();
		//SessionFactory sessionFactory=(Conf.getBean(requiredType, args))
		productDao=(ProductDao)ConfigAppLnContext.getBean("productDao");

	}
	@Transactional
	@Test
	public void addProductTest()
	{
		 Product product= new Product();

		 product.setCatId(1001);
		 product.setPrice(123);
		 product.setProductDesc("");
		 product.setProductId(126);
		 product.setProductName("");
		 product.setStock(45);
		 product.setSupplierId(4562);
		 
		 
		 
		 
		 assertTrue("problem in insertion",productDao.addProduct(product));
	}
	
}
*/