import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo
{

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  
	  WebElement CustomerID = driver.findElement(By.xpath("//input[@type='text']"));
	  CustomerID.sendKeys("52390");
	  
	  WebElement SubmitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
	  SubmitBtn.click();
	  
	  System.out.println(driver.switchTo().alert().getText());
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  System.out.println(driver.switchTo().alert().getText());       
	  driver.switchTo().alert().accept();                             
	  
	  driver.get("https://demoqa.com/alerts");
	  
	  WebElement AlertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
	  AlertBtn.click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	
	  WebElement TimerAlert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	  TimerAlert.click();
	  Thread.sleep(6000);
	  driver.switchTo().alert().accept();
	  
	 WebElement ConfirmBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	 ConfirmBtn.click();
	 driver.switchTo().alert().accept();
	  
	  WebElement PromptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
	  PromptBtn.click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Utkarshaa Academy");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	  

	}

}
