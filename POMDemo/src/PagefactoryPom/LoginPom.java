package PagefactoryPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	    WebDriver driver;

	 

	    @FindBy(name="Email")
	    WebElement email;
	    
	    @FindBy(id="Password")
	    WebElement password;
	    
	    @FindBy(xpath="//input[@class='button-1 login-button']")
	    WebElement loginbtn;
	    
	    public LoginPom(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void enterEmail(String EM) {
	        email.sendKeys(EM);
	    }
	    
	    public void enterPassword(String pwd) {
	        password.sendKeys(pwd);
	    }
	    
	    public void login() {
	        loginbtn.click();
	    }
	}

