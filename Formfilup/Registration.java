package bd.com.Formfilup;

import static org.testng.Assert.assertThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Registration extends OpenBrowser{
	
	
	@Test (priority = 0)
	public void openURL() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	
	@Test (priority = 1)
	public void SignUp() throws InterruptedException{
		WebElement Name = driver.findElement(By.id("name"));
		WebElement MobileNumber = driver.findElement(By.id("phone"));
		WebElement Email = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Address = driver.findElement(By.id("address"));
		WebElement Submit = driver.findElement(By.name("submit"));
		
		
		WebElement GenderMale = driver.findElement(By.id("male"));
		WebElement Tuesday = driver.findElement(By.id("tuesday"));
		WebElement Friday = driver.findElement(By.id("friday"));
		WebElement Country = driver.findElement(By.className("custom-select"));
		
		
		
		
		
		
		
		
		
		Name.sendKeys("MOSHIUR RANGA");
		Thread.sleep(1000);
		MobileNumber.sendKeys("01571739005");
		Thread.sleep(1000);
		Email.sendKeys("rangasoc@gmail.com");
		Thread.sleep(1000);
		Password.sendKeys("ranga123");
		Thread.sleep(1000);
		Address.sendKeys("Shirish Das Lane, Laxmibazar, Dhaka");
		Submit.click();
		Thread.sleep(1000);
		
		
		GenderMale.click();
		Thread.sleep(1000);
		Tuesday.click();
		Thread.sleep(1000);
		Friday.click();
		Thread.sleep(1000);
		
		
		Country.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
		
	}
	
	
	
	
}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

