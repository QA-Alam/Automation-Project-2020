package com.usa.loginpage;

import org.openqa.selenium.support.PageFactory;
import com.usa.basepage.SupperClass;

public class FindPropertyPage  extends SupperClass {

	// Page factory initialize
	public FindPropertyPage() {
		PageFactory.initElements(driver, this);

	}
}
