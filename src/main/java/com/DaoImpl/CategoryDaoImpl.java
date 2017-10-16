package com.DaoImpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.CategoryDao;
import com.model.Category;

@Repository("categoryDao")
public  class CategoryDaoImpl implements CategoryDao
{
@Autowired
SessionFactory sessionFactory;

@Transactional
public boolean addCategory(Category category) {
	try{
		System.out.println("Inside save category");
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		System.out.println("Category successfully saved");
	}catch(Exception e){
		return false;
	}
	return true;
}

public List<Category> retrieveCategory() {
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from Category");
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	List<Category> listCategory=((org.hibernate.Query) query).list();
	session.close();
	return listCategory;
	
}

public boolean deleteCategory(Category category) {
	
	try
	{
	Session session=sessionFactory.getCurrentSession();
	session.delete(category);
	return true;
	}
	catch(Exception e)
	{
	System.out.println("Exception Arised:"+e);	

	return false;
}
}

public Category getCategory(int catId) {
	Session session=sessionFactory.openSession();
	Category category=(Category)session.get(Category.class,catId);
	session.close();
	return category;
}

public boolean updateCategory(Category category) {
	
	try
	{
	sessionFactory.getCurrentSession().saveOrUpdate(category);
	return true;
	}
	catch(Exception e)
	{
	System.out.println("Exception Arised:"+e);
	return false;
}


}
}