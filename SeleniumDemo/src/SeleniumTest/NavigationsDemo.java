package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}

}
