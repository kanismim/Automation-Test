package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class SingupForm {

	ChromeDriver driver;
	WebDriverWait wait;
	
	By gender = By.name("id_gender");
	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By password = By.id("passwd");
	By days = By.id("days");
	By months = By.id("months");
	By years = By.id("years");
	By company = By.id("company");
	By address1 = By.id("address1");
	By address2 = By.id("address2");
	By city = By.id("city");
	By state = By.id("id_state");
	By postcode = By.id("postcode");	
	By country = By.id("id_country");
	By mobile = By.id("phone_mobile");
	By alias = By.id("alias");
	By register = By.id("submitAccount");
	
	public SingupForm(ChromeDriver driver) 
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver,10000);
	}
	
	public void waitForForm()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(gender));
	}
	
	public void enterGender(int args)
	{
		driver.findElements(gender).get(args).click();
	}
	
	public void enterFirstName(String args)
	{
		driver.findElement(firstName).sendKeys(args);
	}
	
	public void enterLastName(String args)
	{
		driver.findElement(lastName).sendKeys(args);
	}
	
	public void enterPassword(String args)
	{
		driver.findElement(password).sendKeys(args);
	}
	
	public void enterDays(int args)
	{
		Select select = new Select(driver.findElement(days));
		select.selectByIndex(args);
	}
	
	public void enterMonths(int args)
	{
		Select select = new Select(driver.findElement(months));
		select.selectByIndex(args);
	}
	
	public void enterYears(int args)
	{
		Select select = new Select(driver.findElement(years));
		select.selectByIndex(args);
	}
	
	public void enterCompany(String args)
	{
		driver.findElement(company).sendKeys(args);
	}
	
	public void enterAddress1(String args)
	{
		driver.findElement(address1).sendKeys(args);
	}
	
	public void enterAddress2(String args)
	{
		driver.findElement(address2).sendKeys(args);
	}
	
	public void enterCity(String args)
	{
		driver.findElement(city).sendKeys(args);
	}
	
	public void enterState(int args)
	{
		Select select = new Select(driver.findElement(state));
		select.selectByIndex(args);
	}
	
	public void enterPostCode(String args)
	{
		driver.findElement(postcode).sendKeys(args);
	}
	
	//public void enterCoutry(String args)
	//{
	//	driver.findElement(country).sendKeys(args);
	//}
	
	public void enterMobilePhone(String args)
	{
		driver.findElement(mobile).sendKeys(args);
	}
	
	public void enterAlias(String args)
	{
		driver.findElement(alias).sendKeys(args);
	}
	
	public void enterRegister()
	{
		driver.findElement(register).click();
	}
}
