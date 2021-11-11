package Runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/reources/functionalTests", 
glue = { "StepDefinations" },
// tags = {"@First,@Second"}
// tags = {"@First","@Second"}
// tags = {"@First","~@Second"}
// tags = {"~@First","@Second"}
// tags = {"~@First"}
// dryRun= true,
//		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//						"junit:target/cucumber-reports/Cucumber.xml",
//						"html:target/cucumber-reports"},
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
		monochrome = true

)
public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getdataprovider().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.141.59");
	    Reporter.setSystemInfo("Maven", "4.0.0");
	    Reporter.setSystemInfo("Java Version", "11.0.9");
	}

}
