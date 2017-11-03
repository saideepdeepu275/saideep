/*package com;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.UserDao;
import com.hibernateConfig.DataBaseConfig;
import com.model.User;
@ComponentScan("com.spring.model")


public class UserTest {

	

	private static final User user = null;
	@Autowired
	private static UserDao userDao;
	

@SuppressWarnings("resource")
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.*");
	context.register(DataBaseConfig.class);
	context.refresh();
	
	//user = (User) context.getBean("user");
	userDao = (UserDao) context.getBean("userDao");
}

@Transactional
@org.junit.Test
public void saveUser()
{
	boolean flag=userDao.saveUser(user);
	assertEquals("createUser", true, flag);

}



}
	
	
	
	

*/