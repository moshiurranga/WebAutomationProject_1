package bd.com.Formfilup;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hober_Dropdown extends OpenBrowser{
	
	@Test (priority = 0)
	public void openURL() throws InterruptedException {
		driver.get(DarazUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

}
	@Test (priority = 1)
	public void Hover () throws InterruptedException {
		Actions action = new Actions(driver);
		
		WebElement Automotive = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement MotorCycle = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement Helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		
		
		
		
		
		action.moveToElement(Automotive).perform();
		Thread.sleep(3000);
		action.moveToElement(MotorCycle).perform();
		Thread.sleep(3000);
		Helmet.click();
		Thread.sleep(5000);
		
		
	}
}
