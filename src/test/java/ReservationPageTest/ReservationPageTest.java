package ReservationPageTest;

import BaseTest.BaseTest;
import ReservationPage.ReservationPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Çağatay Han on 4.09.2016.
 */
public class ReservationPageTest extends BaseTest {

    ReservationPage reservationPage;

    @BeforeClass
    public void beforeClass() {
        reservationPage = new ReservationPage(driver);
        logger = Logger.getLogger(ReservationPageTest.class.getName());
    }

    @Test (priority = 0)
    public void setEmailTest() {
        try {
            reservationPage.setEmail();
            logger.info("setEmailTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setEmailTest NOK");
        }
    }

    @Test (priority = 1)
    public void setNameTest() {
        try {
            reservationPage.setName();
            logger.info("setNameTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setNameTest NOK");
        }
    }

    @Test (priority = 2)
    public void setSurnameTest() {
        try {
            reservationPage.setSurname();
            logger.info("setSurnameTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setSurnameTest NOK");
        }
    }

    @Test (priority = 3)
    public void setPublicIdTest() {
        try {
            reservationPage.setPublicId();
            logger.info("setPublicIdTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setPublicIdTest NOK");
        }
    }

    @Test (priority = 4)
    public void setBirthdateDayTest() {
        try {
            reservationPage.setBirthdateDay();
            logger.info("setBirthdateDayTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setBirthdateDayTest NOK");
        }
    }

    @Test (priority = 5)
    public void setBirthdateMonthTest() {
        try {
            reservationPage.setBirthdateMonth();
            logger.info("setBirthdateMonthTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setBirthdateMonthTest NOK");
        }
    }

    @Test (priority = 6)
    public void setBirthdateYearTest() {
        try {
            reservationPage.setBirthdateYear();
            logger.info("setBirthdateYearTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setBirthdateYearTest NOK");
        }
    }

    @Test (priority = 7)
    public void setGenderTest() {
        try {
            reservationPage.setGender();
            logger.info("setGenderTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setGenderTest NOK");
        }
    }

    @Test (priority = 8)
    public void setCellPhoneTest() {
        try {
            reservationPage.setCellPhone();
            logger.info("setCellPhoneTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("setCellPhoneTest NOK");
        }
    }

    @Test (priority = 9)
    public void clickPurchaseButtonTest() {
        try {
            reservationPage.clickPurchaseButton();
            logger.info("clickPurchaseButtonTest OK");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("clickPurchaseButtonTest NOK");
        }
    }

    @Test (priority = 10)
    public void getPNRTest() {
        try {
            logger.info("getPNRTest OK, PNR: '" + reservationPage.getPnr()+ "'");
        }
        catch (Throwable ex) {
            Assert.fail();
            logger.error("getPNRTest NOK");
        }
    }
}
