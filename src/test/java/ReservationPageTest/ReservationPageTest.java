package ReservationPageTest;

import BaseTest.BaseTest;
import ReservationPage.ReservationPage;
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
    }

    @Test (priority = 0)
    public void setEmailTest() {
        try {
            reservationPage.setEmail();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 1)
    public void setNameTest() {
        try {
            reservationPage.setName();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 2)
    public void setSurnameTest() {
        try {
            reservationPage.setSurname();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 3)
    public void setPublicIdTest() {
        try {
            reservationPage.setPublicId();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 4)
    public void setBirthdateDayTest() {
        try {
            reservationPage.setBirthdateDay();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 5)
    public void setBirthdateMonthTest() {
        try {
            reservationPage.setBirthdateMonth();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 6)
    public void setBirthdateYearTest() {
        try {
            reservationPage.setBirthdateYear();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 7)
    public void setGenderTest() {
        try {
            reservationPage.setGender();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 8)
    public void setCellPhoneTest() {
        try {
            reservationPage.setCellPhone();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }

    @Test (priority = 9)
    public void clickPurchaseButtonTest() {
        try {
            reservationPage.clickPurchaseButton();
        }
        catch (Throwable ex) {
            Assert.fail();
        }
    }
}
