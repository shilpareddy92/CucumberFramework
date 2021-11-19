package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class opentextQuestion1 {
	private static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/login");


		driver.findElement(By.id("username")).sendKeys("aaaa");
		driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("bbbb");
		driver.findElement(By.xpath("//i[text()= ' Login']")).click();
		String  actual = driver.findElement(By.xpath("//div[contains(text(), 'Your username is invalid!')]")).getText();
		actual = actual.replace("×","").trim();
		System.out.println(actual);
		String  expected = "Your username is invalid!";
		assertEquals(actual, expected);
		driver.quit();

	}

}
