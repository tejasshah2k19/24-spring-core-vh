package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.UserController;
import com.dao.AddressDao;
import com.dao.StudentDao;
import com.dao.UserDao;

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
		System.out.println(context);
		
		
		UserController uc1 = context.getBean("userController", UserController.class);
		UserController uc2 = context.getBean("userController", UserController.class);
		UserController uc3 = context.getBean("userController", UserController.class);
		UserController uc4 = context.getBean("userController", UserController.class);

		System.out.println(uc1);
		System.out.println(uc2);
		System.out.println(uc3);
		System.out.println(uc4);
		//

		UserDao userDao = context.getBean("userDao",UserDao.class);
		System.out.println(userDao.getUserName());// null

		// StudentDao->AddressDao ->
		// student dao is depen. on address dao
		// if address dao is init then only student dao will work;

		AddressDao addressDao = context.getBean("addressDao", AddressDao.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		System.out.println(studentDao.getFirstName());
		System.out.println(studentDao.getAge());
		System.out.println(studentDao.getAddress().getAddressLine());
		System.out.println(studentDao.getAddress().getCountry());

	}
}
//singleton 

// spring core  6.2
// spring context 6.2
// spring bean  6.2
// spring el    6.2
