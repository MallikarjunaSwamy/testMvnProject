package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicTest {
	public WebDriver driver ;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriverwin32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");
	}
	@AfterClass
	public void cleanup() {
		driver.quit();
	}

}
