package com.usa.logintest;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.usa.basepage.SupperClass;
import com.usa.loginpage.FindPropertyPage;
import com.usa.loginpage.LoginPage;


public class FindPropertyTest extends SupperClass {
	FindPropertyPage fp;
	LoginPage lp;
	final String name = "London";

	@BeforeMethod
	public void setUp() {
		initialization();
		lp = new LoginPage();
		fp = new FindPropertyPage();
		lp.login(prop.getProperty("userName"), prop.getProperty("textPassword"));
	}

	@Test
	public void findProperties() throws InterruptedException {
		fp.getEnterTheText().sendKeys(name);
		fp.getEnterTheText().sendKeys(Keys.ENTER);
		
		fp.FindTotalHouse();
		fp.FindFifthProperty();
	}

	@AfterMethod
	public void tearDown() {
		logger.info("*** As a User i can closed the browser ***");
		driver.quit();

	}
}
