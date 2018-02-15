package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Repository(value="Cs")
public class CategoryImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addCategory(Category c) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(c);
session.getTransaction().commit();
session.close();
	
	}

}