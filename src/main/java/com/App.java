package com;

import com.controller.UserController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		UserController uc = new UserController();
		uc.login();
		UserController uc1 = new UserController();
		uc1.login();

		// 2 object uc uc1 -> 2 instance

		//
		System.out.println(uc);// hashcode
		System.out.println(uc1);// hashcode
	}
}
//singleton 

// spring core  6.2
// spring context 6.2
// spring bean  6.2
// spring el    6.2
