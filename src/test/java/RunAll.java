
import BaseTest.BaseTest;
import Utils.Configurations;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.Immutable;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.URL;

import java.util.concurrent.TimeUnit;
/**
 * Created by Çağatay Han on 2.09.2016.
 */
public class RunAll extends BaseTest {
    @BeforeSuite
    public void beforeSuite() throws Throwable {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        try {
            logger = Logger.getLogger(RunAll.class.getName());
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            String enuygunURL = "https://www.enuygun.com/ucak-bileti";
            driver = new ChromeDriver();
            driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
            driverWindowMax();
            driverOpenUrl(enuygunURL);
            logger.info("beforeSuite Success");
        }
        catch (Throwable ex) {
            logger.info("beforeSuite Fail");
        }
    }

    @AfterSuite
    public void afterSuite() {
        try {
            driverQuit();
            logger.info("afterSuite Success");
        }
        catch (Throwable ex) {
            logger.info("afterSuite Fail");
        }
    }
}
