import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo
{
	public static void main(String[] args)
	{
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(Option);
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions action =  new Actions(driver);
		
		WebElement DoubleClkBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClkBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement DynamicClk = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		action.doubleClick(DoubleClkBtn).perform();
		action.contextClick(RightClkBtn).perform();
		action.click(DynamicClk).perform();
		
		driver.get("https://demoqa.com/droppable");
		WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropMe = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
	WebElement Book_Store = driver.findElement(By.xpath("//*[contains(text(),'Book Store Appl')]"));
	
	
		action.moveToElement(dropMe).perform();
		action.dragAndDrop(dragMe, dropMe).perform();
		action.moveToElement(Book_Store).perform();
		
		driver.get("https://demoqa.com/menu");
		WebElement MainItem2 = driver.findElement(By.xpath("//*[contains(text(),'Main Item 2')]"));
		action.moveToElement(MainItem2).perform();		
		
	}

}
