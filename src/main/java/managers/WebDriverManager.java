package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import commonLib.DriverType;
import commonLib.EnvironmentType;

public class WebDriverManager {
	
	private WebDriver driver;
	private static DriverType drivertype;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
	
	public WebDriverManager()
	{
		drivertype = FileReaderManager.getInstance().getdataprovider().getBrowser();
		environmentType= FileReaderManager.getInstance().getdataprovider().getEnvironment();
	}
	
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
	
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}
	private WebDriver createDriver() {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}
	
	private WebDriver createLocalDriver() {
        switch (drivertype) {	    
        case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getdataprovider().getDriverPath());
        	driver = new ChromeDriver();
    		break;
        case INTERNETEXPLORER :
        	System.setProperty(IE_DRIVER_PROPERTY , FileReaderManager.getInstance().getdataprovider().getDriverPath());
        	driver = new InternetExplorerDriver();
    		break;
        }

        if(FileReaderManager.getInstance().getdataprovider().getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getdataprovider().getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}	
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
