package com.hibernateConfig;

import com.Dao.UserDao;  
import com.DaoImpl.*;
import com.model.*;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan("com")
public class DataBaseConfig 
{
	
	// user Database
@Bean(name="dataSource")
public DataSource getH2DataSource()
{
	System.out.println("Hibernate is initiated");
	DriverManagerDataSource dt=new DriverManagerDataSource();
	dt.setDriverClassName("org.h2.Driver");
	dt.setUrl("jdbc:h2:tcp://localhost/~/test");
	dt.setUsername("sa");
	dt.setPassword("");
	System.out.println("connection established.....");
return dt;
}




private Properties getHibernateProperties() 
{
	Properties properties = new Properties();
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	properties.put("hibernate.hbm2ddl.auto", "create");
	properties.put("hibernate.hbm2ddl.auto", "update");
	System.out.println("Hibernate Properties");
	return properties;

}

@Autowired
@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory()
{
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(getHibernateProperties());
		//sessionBuilder.scanPackages("com.*");
		sessionBuilder.addAnnotatedClass(Category.class);
		SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();
		System.out.println("SessionFactory Object Created");
		return sessionFactory;
		
	}
	
@Autowired	
@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
    {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		System.out.println("Transaction");
		return transactionManager;
	}
	
@Autowired
@Bean(name = "userDao")
	public UserDao getUserDao(SessionFactory sessionFactory)
{
	    return new UserDaoImpl(sessionFactory);
	}

}