
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sc3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
 @Test
	public static void Scenario3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(ele);

		WebElement src = driver.findElement(By.id("draggable"));
		Actions a = new Actions(driver);

		WebElement tar = driver.findElement(By.id("droppable"));
		a.dragAndDrop(src, tar).perform();

		String colour1 = driver.findElement(By.id("droppable")).getCssValue("color");

		System.out.println(colour1);
		String colour2 = driver.findElement(By.id("droppable")).getCssValue("color");
		Assert.assertEquals(colour2, colour1);

		  Thread.sleep(2000);
		driver.close();

	}

}