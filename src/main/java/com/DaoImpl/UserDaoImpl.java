package com.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.*;
import com.model.*;


@Repository
public class UserDaoImpl implements UserDao
{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory)
	{
	
	this.sessionFactory=sessionFactory;
		
	}

	public boolean saveUser(User user)
	{
		
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(user);
		Transaction tx=session.beginTransaction();
		tx.commit();
		return true;
		
		
		
		
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeUserById(int user_id) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("deprecation")
	@Transactional
	public User get(String email) {
		// TODO Auto-generated method stub
		Criteria c=sessionFactory.getCurrentSession().createCriteria(User.class);
		c.add(Restrictions.eq("email",email));
		@SuppressWarnings("unchecked")
		List<User> lisUser=(List<User>) c.list();
		if(lisUser !=null && !lisUser.isEmpty())
		{
		return lisUser.get(0);
		}
		else
		{
			
		return null;
	}



}
}