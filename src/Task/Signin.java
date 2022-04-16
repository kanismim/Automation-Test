package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

	ChromeDriver driver;
	
	By email = By.id("email");
	By pass = By.id("passwd");
	By submit = By.id("SubmitLogin");
	
	public Signin(ChromeDriver drive) {
		this.driver = drive;
	}
	
	public void enterEmail(String args)
	{
		driver.findElement(email).sendKeys(args);	
	}
	
	public void enterPass(String args)
	{
		driver.findElement(pass).sendKeys(args);	
	}
	
	public void submit()
	{
		driver.findElement(submit).click();	
	}
}
