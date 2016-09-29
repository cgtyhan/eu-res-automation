package ReservationPage;

import Base.Base;
import org.openqa.selenium.WebDriver;

/**
 * Created by Çağatay Han on 4.09.2016.
 */
public class ReservationPage extends Base {
    public ReservationPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail() {
        fillInputFieldWebElement(conf.getEmail(), "cagatay.han@enuygun.com");
    }

    public void setName() {
        fillInputFieldWebElement(conf.getName(), "Çağatay");
    }

    public void setSurname() {
        fillInputFieldWebElement(conf.getSurname(), "Han");
    }

    public void setPublicId() {
        if(webElementIsDisplayed(conf.getPublicId())){
            fillInputFieldWebElement(conf.getPublicId(), "12020202098");
        }
    }

    public void setBirthdateDay() {
        clickWebElement(conf.getBirthdateDay());
        clickWebElement(conf.getBirthdateDayToSet());
    }

    public void setBirthdateMonth() {
        clickWebElement(conf.getBirthdateMonth());
        clickWebElement(conf.getBirthdateMonthToSet());
    }

    public void setBirthdateYear() {
        clickWebElement(conf.getBirthdateYear());
        clickWebElement(conf.getBirthdateYearToSet());
    }

    public void setGender() {
        clickWebElement(conf.getGender());
    }

    public void setCellPhone() {
        findWebElement(conf.getCellPhone()).clear();
        fillInputFieldWebElement(conf.getCellPhone(), "5302002731");
    }

    public void clickPurchaseButton() {
        clickWebElement(conf.getPurchaseButton());
        waitForLoad(5);
    }



}
