package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.UserController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//
//		UserController uc = new UserController();
//		uc.login();
//		UserController uc1 = new UserController();
//		uc1.login();
//
//		// 2 object uc uc1 -> 2 instance
//
//		//
//		System.out.println(uc);// hashcode
//		System.out.println(uc1);// hashcode
//		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		UserController uc1 = context.getBean("userController", UserController.class);
		UserController uc2 = context.getBean("userController", UserController.class);
		UserController uc3 = context.getBean("userController", UserController.class);
		UserController uc4 = context.getBean("userController", UserController.class);

		System.out.println(uc1);
		System.out.println(uc2);
		System.out.println(uc3);
		System.out.println(uc4);
		
	}
}
//singleton 

// spring core  6.2
// spring context 6.2
// spring bean  6.2
// spring el    6.2
