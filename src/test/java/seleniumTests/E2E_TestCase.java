package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class E2E_TestCase {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/");

		WebElement tutorials = driver.findElement(By.xpath("//span[@Class= 'navbar__tutorial-menu--text']"));
		tutorials.click();
		
		WebElement AllLanguage = driver.findElement(By.xpath("//span[text()='Programming Language']"));
		AllLanguage.click();
	
		Thread.sleep(5000);
		WebElement language = driver.findElement(By.xpath("//ul[@class='active']//child::li//a[text()='Java']"));
		language.click();
	
		
		WebElement javatitle = driver.findElement(By.xpath("//h1[text()='Java Tutorial']"));
		Thread.sleep(5000);
		System.out.println(javatitle.isDisplayed());
		
		List<WebElement> headings= driver.findElements(By.xpath("//main[@class='article-content']//h3//following-sibling::ul//Strong"));
		System.out.println(headings.size());
		
		for(WebElement heading : headings){
			if(heading.getText().equals("Data Types and Variables")) {
				heading.click();	
				Thread.sleep(5000);
				break;
			}		
		}
		
		WebElement datatypeetitle= driver.findElement(By.xpath("//h1[text()='Data Types and Variables']"));
		System.out.println(datatypeetitle.isDisplayed());
		driver.quit();
	}
}
