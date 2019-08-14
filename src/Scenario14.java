import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario14 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
@Test
	public static void Scn14() throws InterruptedException, AWTException
	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.bluestone.com/");

		WebElement ele = driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
		a.moveToElement(ele).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();

		Thread.sleep(2000);

		driver.close();
	}
}