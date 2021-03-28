package loginPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PagefactoryPom.LoginPom;
import pompackage.LoginPagePom;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();
        
//        LoginPagePom login=new LoginPagePom(driver);
  
        LoginPom login = PageFactory.initElements(driver, LoginPom.class);
        
        login.enterEmail("saijnanesh1@gmail.com");
        login.enterPassword("123456");
        login.login();
	}

}
