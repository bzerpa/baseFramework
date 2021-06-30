package com.myproject.testCases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import com.myproject.utilities.ConfigDictionary;
import com.myproject.utilities.Utility.Device;

public class BaseTest {

public static WebDriver driver;
public static Logger log;

//@Parameters("browser")
@BeforeClass	
public void setup(
//		String browser
		) {
	
	log= Logger.getLogger("myProject");
	PropertyConfigurator.configure("log4j.properties");
	instanceDriver("chrome");
}

@AfterClass
public void tearDown() {
	driver.quit();
}

public void instanceDriver(String browser) {
	System.setProperty("webdriver.chrome.driver", ".\\resources/drivers//chromedriver.exe");
	driver = new ChromeDriver();
//	if(browser.equals(Device.CHROME.getName())) {
//		System.setProperty("webdriver.chrome.driver", ConfigDictionary.getInstance().getConfigProperties().getChromeDriverPath());
//		driver = new ChromeDriver();
//	}
//	else if(browser.equals(Device.FIREFOX.getName())) {
//		System.setProperty("webdriver.chrome.driver", ConfigDictionary.getInstance().getConfigProperties().getFirefoxDriverPath());
//		driver = new FirefoxDriver();
//	}
//	else if(browser.equals(Device.SAFARI.getName())) {
//		System.setProperty("webdriver.chrome.driver", ConfigDictionary.getInstance().getConfigProperties().getSafariDriverPath());
//		driver = new SafariDriver();
//	}
}

}