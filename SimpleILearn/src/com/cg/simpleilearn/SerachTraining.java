package com.cg.simpleilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SerachTraining {

	WebDriver driver;
	public void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
	      driver =new ChromeDriver();
	     driver.navigate().to("https://www.simplilearn.com/");
	     driver.manage().window().maximize();
	}
	
	public void serach() throws InterruptedException {
		driver.findElement(By.id("header_srch")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='search_icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[text()='Selenium 3.0 Training']")).click();
		System.out.println("The page title is "+driver.getTitle());
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		SerachTraining obj = new SerachTraining();
		obj.launchBrowser();
		obj.serach();
		obj.closeBrowser();
	}

}
