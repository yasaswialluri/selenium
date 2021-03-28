package RegistrationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPOM {
	
	 WebDriver driver;
	 
	 By gender = By.xpath("//input[@id='gender-male']");
	 By firstName = By.id("FirstName");
	 By lastName  =By.id("LastName");
	 By email = By.name("Email");
	 By password = By.xpath("//input[@id='Password']");
	  By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	  
	 By register = By.xpath("//input[@id='register-button']");
	  
	  public RegistrationPOM(WebDriver driver)
	  {
		  this.driver = driver;
	  }
	  
	  public void enterGender()
	  {
		  driver.findElement(gender).click();
	  }
	  
	  public void enterFirstName(String name1)
	  {
		  driver.findElement(firstName).sendKeys(name1);
	  }
	  
	  public void enterLastName(String name2)
	  {
		  driver.findElement(lastName).sendKeys(name2);
	  }
	  
	  
	  public void enterEmail(String em)
	  {
		  driver.findElement(email).sendKeys(em);
	  }
	  public void enterPassword(String pass, String conPass)
	  {
		  if(pass.contentEquals(conPass))
		  {
			  driver.findElement(password).sendKeys(pass);
			  driver.findElement(confirmPassword).sendKeys(conPass);
		  }
		  else
		  {
			  System.out.println("passwordMismatch"); 
		  }
		
	  }
	  
	  public void clickRegister()
	  {
		  driver.findElement(register).click();
	  }
 
}
