package ResultPageTest;

import BaseTest.BaseTest;
import ResultPage.ResultPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Çağatay Han on 4.09.2016.
 */
public class ResultPageTest extends BaseTest {

    ResultPage resultPage;

    @BeforeClass
    public void beforeClass() {
        resultPage = new ResultPage(driver);
        logger = Logger.getLogger(ResultPageTest.class.getName());
    }

    @Test (priority = 0)
    public void selectFirstFlightTest() {
        try {
            resultPage.selectFirstFlight();
            logger.info("selectFirstFlightTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("selectFirstFlightTest NOK");
        }
    }
}
