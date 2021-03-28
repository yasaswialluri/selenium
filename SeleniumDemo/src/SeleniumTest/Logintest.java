package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("saijnanesh1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
		String expectedName = "Demowebstore";
		String actualName = driver.getTitle();
		System.out.println(actualName);
		
		if(actualName.equals(expectedName))
		{
			System.out.println("You are on correct page");
			driver.close();
		}
		else
		{
			System.out.println("you are not on correct page");
			driver.quit();
		}
		
	}

}
