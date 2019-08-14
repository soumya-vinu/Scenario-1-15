

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("sowbuddy.7@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("Soumya@7");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("dhamansapa18@gmail.com");
		 driver.findElement(By.xpath("//div[@id=':rx']")).sendKeys("Hi!!");
		 driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
	}

}
