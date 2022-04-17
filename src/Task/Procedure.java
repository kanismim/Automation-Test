package Task;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Procedure {

	
	Random randomGenerator = new Random();
	ChromeDriver driver;
	SingupForm signup;
	AddToCart addCart;
	Checkout checkout;
	Signin signin;
	
	String url = "http://automationpractice.com/index.php";
	
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");
		
		driver = new ChromeDriver(); //creating instance
		
		driver.manage().window().maximize(); //maximizing the window
		
		driver.get(url);
	}
	
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit(); //To close all the windows
	}
	
	public void accountOpen(Profile profile) throws InterruptedException{
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		
		//email genaration
		Thread.sleep(2000);
		int randomInt = randomGenerator. nextInt(10000);
		String email1 = "username"+ randomInt +"@mailtest.com";
		profile.email= email1;
		driver.findElement(By.id("email_create")).sendKeys(email1);
		driver.findElement(By.name("SubmitCreate")).click();
		
		//signup form
		signup = new SingupForm(driver); 
		signup.waitForForm();
		signup.enterGender(profile.gender);
		signup.enterFirstName(profile.firstName);
		signup.enterLastName(profile.lastName);
		signup.enterPassword(profile.password);
		signup.enterDays(profile.days);
		signup.enterMonths(profile.months);
		signup.enterYears(profile.years);
		signup.enterCompany(profile.company);
		signup.enterAddress1(profile.address1);
		signup.enterAddress2(profile.address2);
		signup.enterCity(profile.city);
		signup.enterState(profile.state);
		signup.enterPostCode(profile.postcode);
		signup.enterMobilePhone(profile.mobile);
		signup.enterRegister();
	}
	
	public void signout() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign out")).click();
	}
	
	public void shopping() throws InterruptedException {
		addCart = new AddToCart(driver);
		addCart.selectOptionName();
		addCart.selectCasualDresses();
		addCart.viewDress();
		addCart.addDresses();
		addCart.continueShopping();
		addCart.selectTshirt();
		addCart.blueFilter();
		addCart.viewTshirt();
		addCart.selectColor();
		addCart.addTshirt();
	}
	
	public void buy() throws InterruptedException {
		checkout = new Checkout(driver);
		checkout.proceedToCheckout();
		checkout.proceedToCheckout1();
		checkout.proceedToCheckout2();
		checkout.clickAgreement();
		checkout.proceedToCheckout3();
		checkout.clickPayment();
		checkout.clickConfirm();
	}
	
	public void signin(Profile profile) {
		signin = new Signin(driver);
		signin.enterEmail(profile.email);
		signin.enterPass(profile.password);
		signin.submit();
	}
	
	public void runProcedure() throws InterruptedException {
		
		Profile profile1 = new Profile(0,"Bob","wilson","123456",7,6,20,"ABC company","House 15, Road-10","3rd floor, flat- 2A","California",5,"19990","01283283213");
		Profile profile2 = new Profile(1,"Alice","wilson","123456",7,7,23,"ABC company","House 17, Road-10","4rd floor, flat- 2A","California",6,"19870","01282345213");
		
		launchBrowser();
		accountOpen(profile1);
		signout();
		accountOpen(profile2);
		signout();
		signin(profile1);
		shopping();
		buy();
		signout();
		signin(profile2);
		shopping();
		buy();
		signout();
		closeBrowser();
	}
}
