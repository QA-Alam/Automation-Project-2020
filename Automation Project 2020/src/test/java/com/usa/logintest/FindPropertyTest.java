package com.usa.logintest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.usa.basepage.SupperClass;
import com.usa.loginpage.FindPropertyPage;
import com.usa.loginpage.LoginPage;

public class FindPropertyTest extends SupperClass {
	FindPropertyPage fp;
	LoginPage lp;

	@BeforeMethod
	public void setUp() {
		initialization();
		lp = new LoginPage();
		fp = new FindPropertyPage();
		lp.login(prop.getProperty("userName"), prop.getProperty("textPassword"));
	}

	@Test
	public void findProperties() {

	}

	@AfterMethod
	public void tearDown() {
		logger.info("*** As a User i can closed the browser ***");
		driver.quit();

	}
}
