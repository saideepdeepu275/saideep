package com.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.SupplierDao;
import com.model.Supplier;

public class SupplierDaoImpl implements SupplierDao
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Supplier> retrieveSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	public Supplier getSupplier(int supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}
	
	}