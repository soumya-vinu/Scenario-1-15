import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	@Test
	public static void scn6() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the tab
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https:www.bluestone.com");
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//a[@title='Rings']"));
		a.moveToElement(e).perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//ul[@class='odd-even-bg']/descendant::ul[@class='two-col']/li/a[@title='Diamond Rings']"))
				.click();

		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='p-wrap']"));
		System.out.println("Before Sort");
		for (WebElement beforesort : ele) {

			System.err.println(beforesort.getText());

		}
		driver.findElement(By.xpath("//section[@class='block sort-by pull-right']/span")).click();

		driver.findElement(
				By.xpath("//div[@class='form-items select-view-by']/descendant::a[contains(.,'Price Low to High')]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//span[@class='p-wrap']"));
		String[] s = new String[ele1.size()];
		int j = 0;
		for (; j < s.length; j++) {

			System.out.println(s[j]);
			;

		}
		Arrays.sort(s);

		System.err.println("After Sort");
		for (WebElement aftersort : ele1) {

			System.out.println(aftersort.getText());

		}
		driver.close();

	}

}