package com.niit.BackendProject;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryIMPL implements CategoryDAO 
	{

		@Autowired
		SessionFactory sessionFactory;
		
		
		@Transactional
		@Override
		public boolean addCategory(Category category) 
		{	
			sessionFactory.getCurrentSession().save(category);
			return false;
		}

	}

