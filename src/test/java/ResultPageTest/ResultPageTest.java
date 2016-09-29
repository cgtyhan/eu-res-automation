package ResultPageTest;

import BaseTest.BaseTest;
import ResultPage.ResultPage;
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
    }

    @Test (priority = 0)
    public void selectFirstFlightTest() {
        try {
            resultPage.selectFirstFlight();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }
}
