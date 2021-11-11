package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaPage {

	public JavaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='active']//child::li//a[text()='Java']")
	private WebElement language;
	// Thread.sleep(5000);

	@FindBy(xpath = "//h1[text()='Java Tutorial']")
	private WebElement javatitle;

	@FindBy(xpath = "//main[@class='article-content']//h3//following-sibling::ul//Strong")
	private List<WebElement> headings;

	@FindBy(xpath = "//h1[text()='Data Types and Variables']")
	private WebElement datatypeetitle;

	public void clickOn_language() {
		language.click();

	}

	public void Verify_javatitle() {
		javatitle.isDisplayed();

	}

	public void verifyLinks() {

		System.out.println(headings.size());

		for (WebElement heading : headings) {
			if (heading.getText().equals("Data Types and Variables")) {
				heading.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				break;
			}
		}
	}

	public void Verify_datatypeetitle() {
		datatypeetitle.isDisplayed();

	}

}
