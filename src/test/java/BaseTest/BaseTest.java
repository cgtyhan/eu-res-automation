package BaseTest;

import org.apache.log4j.Logger;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebDriver;

/**
 * Created by Çağatay Han on 2.09.2016.
 */
public class BaseTest {

    protected static WebDriver driver;
    protected Logger logger;

    protected void driverWindowMax() {
        driver.manage().window().maximize();
    }

    protected void driverOpenUrl(String Url) {
        driver.navigate().to(Url);
    }

    protected void waitForPageLoad(int x) {
        try {
            Thread.sleep(x * 1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }



    protected void driverQuit() {
        driver.close();
        driver.quit();
    }
}
