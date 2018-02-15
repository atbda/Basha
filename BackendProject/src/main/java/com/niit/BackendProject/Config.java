package com.niit.BackendProject;

import java.util.Properties;

import javax.activation.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

public class Config {
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource 	DataSource=new DriverManagerDataSource();
		
		DataSource.setDriverClassName("org.h2.Driver");
		DataSource.setUrl("jdbc:h2:~/test");
		DataSource.setUsername("sa");
		DataSource.setPassword("");
		
		System.out.println("Data Source Created");
		return (javax.activation.DataSource) DataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		
		Properties hibernateProp=new Properties();
		
		hibernateProp.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		
		LocalSessionFactoryBuilder factoryBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
		factoryBuilder.addAnnotatedClass(Category.class);
		factoryBuilder.addProperties(hibernateProp);
		
		System.out.println("Creating SessionFactory Bean");
		return factoryBuilder.buildSessionFactory();
	}
	
	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO()
	{
		System.out.println("DAO Implementation");
		return new CategoryDAOIMPL();
	}
	
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("Transaction Manager");
		return new HibernateTransactionManager(sessionFactory);
	}
	

}
