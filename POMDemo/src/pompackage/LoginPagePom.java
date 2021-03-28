package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePom {

		WebDriver driver;
		By email = By.name("Email");
		By password = By.id("Password");
		By signIn = By.xpath("//input[@class='button-1 login-button']");
		
		public LoginPagePom(WebDriver driver)
		{
			this.driver = driver;
		}
		
		
		public void enterEmail(String Em)
		{
			driver.findElement(email);
		}
		
		public void enterPassword(String pwd)
		{
			driver.findElement(password);		
		}
		
		public void login()
		{
			driver.findElement(signIn);
		}
		
		
	}


