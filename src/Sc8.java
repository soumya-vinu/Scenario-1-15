
import java.util.List;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sc8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
@Test
	public static void Scenario8 ()throws InterruptedException, AWTException

	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebDriverWait ww = new WebDriverWait(driver, 30);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		a.moveToElement(ele).perform();
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.xpath("//a[@title='Kadas']"));
		Thread.sleep(2000);
		a.moveToElement(ele1).perform();
		a.doubleClick(ele1).perform();
		List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='p-image']/a"));
		ele2.get(2).click();

		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		driver.findElement(By.xpath("//li[@data-key='06']")).click();

		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
	}
}
