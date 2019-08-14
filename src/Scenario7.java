import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	@Test
	public static void Scn7() throws InterruptedException, AWTException

	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.bluestone.com/");
		WebElement item = driver.findElement(By.xpath("//li[@class=\"menuparent\"]"));		
		a.moveToElement(item).perform();
		driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();	
		driver.findElement(By.xpath("//img[@class=\"hc img-responsive center-block\"]")).click();
		driver.findElement(By.id("buy-now")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]"));
		System.out.println(ele.getText());
		driver.quit();
}
}
