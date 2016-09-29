
import BaseTest.BaseTest;
import Utils.Configurations;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

import java.util.concurrent.TimeUnit;
/**
 * Created by Çağatay Han on 2.09.2016.
 */
public class RunAll extends BaseTest {

    public static final String USERNAME = "cagatayhan";
    public static final String ACCESS_KEY = "236c1eb8-1524-4af6-83eb-5c597adcdcca";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    @BeforeSuite
    public void beforeSuite() throws Throwable {
//        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//        caps.setCapability("platform", "Windows 8");
//        caps.setCapability("version", "10");
//        caps.setCapability("name", "ENUYGUN-Reservation");
//
//        driver = new RemoteWebDriver(new URL(URL), caps);

        System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driverWindowMax();
        driverOpenUrl("https://www.enuygun.com/ucak-bileti");
    }


    @AfterSuite
    public void afterSuite() {
        driverQuit();
    }
}
