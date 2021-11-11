package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.EnrollYouselfPage;
import pageObjects.HomePage;
import pageObjects.JavaPage;
import pageObjects.Programpage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homepage;
	private Programpage programpage;
	private JavaPage javapage;
	private EnrollYouselfPage enrollYouselfPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	}

	public Programpage getProgramPage() {
		return (programpage == null) ? programpage = new Programpage(driver) : programpage;
	}

	public JavaPage getjavapage() {
		return (javapage == null) ? javapage = new JavaPage(driver) : javapage;
	}
	
	public EnrollYouselfPage getEnrollYouselfPage() {
		return (enrollYouselfPage == null) ? enrollYouselfPage = new EnrollYouselfPage(driver) : enrollYouselfPage;
	}
	
	
	

}
