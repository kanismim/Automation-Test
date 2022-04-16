package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {

	ChromeDriver driver;
	WebDriverWait wait;
	
	By checkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	By proceedToCheckout= By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	By next = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	By agree = By.cssSelector("label[for=cgv]");
	By proceed = By.xpath("//*[@id=\"form\"]/p/button");
	By payment = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
	By confirm = By.xpath("//*[@id=\"cart_navigation\"]/button");
	
	public Checkout(ChromeDriver driver) {
		
		this.driver=driver;
		this.wait = new WebDriverWait(driver,10000);
	}
	
	public void proceedToCheckout() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckout)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(next)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(agree)).click();
		driver.findElement(proceed).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(payment)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirm)).click();
		
	}
	
}
