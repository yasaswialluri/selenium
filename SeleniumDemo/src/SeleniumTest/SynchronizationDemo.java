package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
		
		String expectedTitle = "OrangeHRm";
		System.out.println(expectedTitle);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("pooja");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pooja123");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			WebDriverWait myWait = new WebDriverWait(driver, 10); //explicit wait
			 myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text() , 'Logout )']")));
			 driver.findElement(By.xpath("//a[contains(text() , 'Logout )']")).click();
			 System.out.println("End");
		}
		else
			System.out.println("Something's not right!!!!");
	}

}
