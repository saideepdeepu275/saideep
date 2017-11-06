package com.DaoImpl;


import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.OrderDao;
import com.model.Cart;
import com.model.Orders;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao{
private static Logger log = LoggerFactory.getLogger(OrderDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public OrderDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean saveOrUpdate(Orders order) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(order);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Transactional
	public Orders getOrderById(int orderId) {
		Orders order= (Orders) sessionFactory.getCurrentSession().createQuery("from Order where id = :orderId")
				.setParameter("orderId", orderId).uniqueResult();
		return order;
	}

	@Transactional
	public boolean deleteOrderById(int orderId) {
		try{
			
			Session session = sessionFactory.getCurrentSession();
			
			Object object = session.load(Orders.class, orderId);
			
			if(object!=null){
				
				session.delete(object);
				log.info("OrderDaoImpl : Order Object deleted Successfully");				
				
			}
			return true;
		}catch(Exception e){
			return false;
		}
	}
	

	@Transactional
	public List<Orders> getAllOrdersOfUser(int userId) {
		
		List<Orders> orderList =  sessionFactory.getCurrentSession().createQuery("from Orders where userId = :userId and orderStatus = 'PROCESSED'",Orders.class).setParameter("userId", userId).list();
		return orderList;
	}

}
