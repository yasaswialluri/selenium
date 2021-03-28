package SeleniumTest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNoOfLinksInAWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(WebElement el : list)
		{
			System.out.println(el.getText());
		}
		 
	}

}
