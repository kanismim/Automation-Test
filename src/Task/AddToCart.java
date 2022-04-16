package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	ChromeDriver driver;
	WebDriverWait wait;

	By optionName = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	By casualDresses = By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
	By viewDress = By.linkText("Printed Dress");
	By addToCart = By.name("Submit");
	By continueShopping = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i");
	By tshirt = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	By blue = By.xpath("//*[@id=\"ul_layered_id_attribute_group_3\"]/li[2]/label/a");
	By viewTshirt = By.linkText("Faded Short Sleeve T-shirts");
	
	
	public AddToCart(ChromeDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver,10000);
	}
	
	public void selectOptionName()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(optionName)).click();
	}
	
	public void selectCasualDresses() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(casualDresses)).click();
		driver.findElement(viewDress).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping)).click();
	}
	
	public void selectTshirt() throws InterruptedException
	{
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(tshirt)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(blue)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewTshirt)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart)).click();
	}
}
