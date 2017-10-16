
package com.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.ProductDao;
import com.model.Category;
import com.model.Product;
@Repository("productDao")
public class ProductDaoImpl implements ProductDao 
{
	@Autowired
    SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		
		 try
	      {
	      sessionFactory.getCurrentSession().save(product);
	      return true;
	      }
	      catch(Exception e)
	      {
	      return false;
	      }
	}

	public List<Product> retrieveProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		 try
	     {
	     sessionFactory.getCurrentSession().delete(product);
	     return true;
	     }
	     catch(Exception e)
	     {
	     System.out.println("Exception Arised:"+e);  
	     return false;
	     }
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stubSession session=sessionFactory.openSession();
		 Session session=sessionFactory.openSession();
		 Product product=(Product)session.get(Product.class,productId);
	     session.close();
	     return product;
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try
	     {
	     sessionFactory.getCurrentSession().saveOrUpdate(product);
	     return true;
	     }
	     catch(Exception e)
	     {
	     System.out.println("Exception Arised:"+e);
	     return false;
	     }
	}
	}
	
	
	
