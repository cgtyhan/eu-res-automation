package HomePageTest;

import BaseTest.BaseTest;
import HomePage.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Çağatay Han on 2.09.2016.
 */
public class HomePageTest extends BaseTest{

    HomePage homePage;

    SoftAssert softAssert;

    @BeforeClass
    public void beforeClass() {
        homePage = new HomePage(driver);
        logger = Logger.getLogger(HomePageTest.class.getName());
    }

    @Test(priority = 0)
    public void setOriginTest() {
        try {
            homePage.setOrigin();
            logger.info("setOriginTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.info("setOriginTest NOK");
        }
    }

    @Test (priority = 1)
    public void setDestinationTest() {
        try {
            homePage.setDestination();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 2)
    public void setDepartureDateTest() {
//        try {
//            homePage.setDepartureDate();
//        }
//        catch (Throwable ex) {
//            Assert.fail();
//        }
        homePage.setDepartureDate();
    }

    @Test (priority = 3)
    public void clickFindTicketTest() {
        try {
            homePage.clickFindTicket();
        }
        catch (Throwable ex) {
            Assert.fail(ex.getMessage());
        }
    }
}
