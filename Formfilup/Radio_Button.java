package bd.com.Formfilup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Radio_Button extends OpenBrowser {
	
	@Test (priority = 0)
	public void openURL() throws InterruptedException {
		driver.get(AllertUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	

}
	
	@org.testng.annotations.Test (priority = 1)
	public void AlertCheck() throws InterruptedException {
		WebElement JsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement JsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement JsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		
		
		JsAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String resultText = result.getText();
		if (resultText.contains("You successfully clicked an alert")) {
			System.out.println("Passed:" +resultText);
		}
		
		
	 	
		JsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		String resultText2 = result.getText();
		if (resultText2.contains("You clicked: Cancel")) {
			System.out.println("Passed:" +resultText2);
		}
		
		
		JsPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Love You Alert");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String resultText3 = result.getText();
		if (resultText3.contains("You entered: Love You Alert")) {
			System.out.println("Passed:" +resultText3);
		}
		Thread.sleep(5000);
	
		
	}
}

