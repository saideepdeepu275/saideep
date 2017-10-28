package com.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.SupplierDao;
import com.model.Supplier;



@SuppressWarnings("deprecation")
@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao
{
	@Autowired
	SessionFactory sessionFactory;

	public SupplierDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean addSupplier(Supplier supplier) 
	{
		try
		{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(supplier);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		return false;
		}
	}

	@Transactional
	public List<Supplier> retrieveSupplier() 
	{
		Session session=sessionFactory.openSession();
		@SuppressWarnings("rawtypes")
		Query query=session.createQuery("from Supplier");
		@SuppressWarnings({ "unchecked" })
		List<Supplier> listSupplier=query.list();
		session.close();
		return listSupplier;
	}

	/*@Transactional
	public boolean deleteSupplier(Supplier Supplier) 
	{	
		try
		{
		Session session=sessionFactory.getCurrentSession();
		session.delete(Supplier);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);	
		return false;
		}
	}*/

	@Transactional
	public Supplier getSupplier(int supId) 
	{
		Session session=sessionFactory.openSession();
		Supplier Supplier=(Supplier)session.get(Supplier.class,supId);
		session.close();
		return Supplier;
	}

	@Transactional
	public boolean UpdateSupplier(Supplier Supplier) 
	{
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(Supplier);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}
@Transactional
	public boolean deleteSupplier(Supplier supplier) 
{
	 try
	    {
	    Session session=sessionFactory.getCurrentSession();
	    session.delete(supplier);
	    return true;
	    }
	    catch(Exception e)
	    {
	    System.out.println("Exception Arised:"+e);  
	    return false;
	    }
	
	}
@Transactional
	public boolean updateSupplier(Supplier supplier) {
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}	}
}