package RegistrationMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import RegistrationPackage.RegistrationPOM;

public class RegistrationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        
        
        RegistrationPOM register = new RegistrationPOM(driver);
        
        register.enterGender();
        register.enterFirstName("Sai");
        register.enterLastName("jnanesh");
        register.enterEmail("saijnanesh3@gmail.com");
        register.enterPassword("123456", "123456");
        register.clickRegister();
	}

}
