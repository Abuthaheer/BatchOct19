package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginObject;

public class LoginTest {

	LoginObject lg;

	public LoginTest() {
		lg = new LoginObject();
	}

	@Test
	public void verifyLogin() {
		lg.login("Abuthaheer", "Test123");
		String title = lg.getTitlte();
		Assert.assertTrue(title.contains("Search"), "Failed: Login not successfully");

	}

	@Test
	public void verifyUserName() {
		lg.setUserName("Abuthaheer");
		String value = lg.getUserName();
		Assert.assertTrue(value.equals("Abuthaheer"), "Failed: Not Entered");
		
	}

}
