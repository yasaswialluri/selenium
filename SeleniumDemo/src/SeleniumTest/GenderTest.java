package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenderTest {

	public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.navigate().to("http://demo.automationtesting.in/Register.html");
	        driver.manage().window().maximize();
	       
	        
	        
	        
	        driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
	        
	        
	        WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
	        Select selYear = new Select(year);
	        
	        selYear.selectByVisibleText("2015");
	        
	        WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	        Select selMonth = new Select(month);
	        List <WebElement>monthcount=selMonth.getOptions();
	        System.out.println(monthcount.size());
	       
	        for(int i=0;i<monthcount.size();i++) {
	            System.out.println(monthcount.get(i).getText());
	        }
	        
	        selMonth.selectByIndex(3);
	        
	        WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
	        Select selDay = new Select(day);
	        
	        selMonth.selectByVisibleText("25");
	}

}
