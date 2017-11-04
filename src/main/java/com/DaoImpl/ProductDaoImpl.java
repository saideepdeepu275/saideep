
package com.DaoImpl;

import java.util.List;

import org.hibernate.Query;
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
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean addProduct(Product product) {
		
		 try
	      {
	    //  sessionFactory.getCurrentSession().save(product);
			 Session session=sessionFactory.getCurrentSession();
			    session.saveOrUpdate(product);
			    System.out.println("saved product");
	      return true;
	      }
	      catch(Exception e)
	      {
	    	  System.out.println(e.getMessage());
	      return false;
	      }
	}

	@Transactional
	public List<Product> retrieveProduct() {
		 Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from Product");
	        List<Product> listProducts=query.list();
	        session.close();
	        return listProducts;
	}
@Transactional
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		 try
	     {
			 Session session=sessionFactory.getCurrentSession();
			    session.delete(product);
			    return true;
	     }
	     catch(Exception e)
	     {
	     System.out.println("Exception Arised:"+e);  
	     return false;
	     }
	}

	@Transactional
	public Product getProduct(int productId) {
		// TODO Auto-generated method stubSession session=sessionFactory.openSession();
		 Session session=sessionFactory.openSession();
		 Product product=(Product)session.get(Product.class,productId);
	     session.close();
	     return product;
	}
@Transactional
	public boolean updateProduct(Product product) {
		
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
@Transactional
public Product getItem(int id) {
	// TODO Auto-generated method stub
	Product product=sessionFactory.getCurrentSession().get(Product.class,id);  
	return product;
}
@Transactional
public Product deleteProduct(int productId) {
	Product ProductToDelete = new Product();
	ProductToDelete.setProductId(productId);
	sessionFactory.getCurrentSession().delete(ProductToDelete);
	return ProductToDelete;

}

	
	
	}
	
	
	
