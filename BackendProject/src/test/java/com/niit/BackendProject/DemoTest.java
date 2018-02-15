package com.niit.BackendProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {
	
		public static void main(String arg[])
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit");
			context.refresh();
			
			CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
			
			Category category=new Category();
			category.setCategoryName("Chimney");
			category.setCateogryDesc("Hindware Chimney-Kitchen Decor");
			
			categoryDAO.addCategory(category);
			
		}
	}


