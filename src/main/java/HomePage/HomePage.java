package HomePage;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Created by Çağatay Han on 2.09.2016.
 */
public class HomePage extends Base{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void setOrigin() {
        waitForLoad(2);
        fillInputFieldWebElement(conf.getOrigin(), "ist");
        waitForReady(conf.getOriginResultList());
        List<WebElement> list = findWebElementsList(conf.getOriginResultList());
        clickWebElement(list.get(0));
    }

    public void setDestination() {
        fillInputFieldWebElement(conf.getDestination(), "adb");
        waitForReady(conf.getDestinationResultList());
        List<WebElement> list = findWebElementsList(conf.getDestinationResultList());
        clickWebElement(list.get(0));
    }

    public void setDepartureDate() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        int todayInteger = today.getDayOfMonth();
        int tomorrowInteger = tomorrow.getDayOfMonth();
        int endOfMonth = today.lengthOfMonth();
        String tomorrowString;

        clickWebElement(conf.getDepartureDate());

        if(todayInteger == endOfMonth) {
            tomorrowString = String.valueOf(1);
            WebElement element = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody//a[contains(text(),'" + tomorrowString + "')]"));
            element.click();
        }
        else {
            tomorrowString = String.valueOf(tomorrowInteger);
            WebElement element = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody//a[contains(text(),'" + tomorrowString + "')]"));
            element.click();
        }

        waitForLoad(1);
    }

    public void clickFindTicket() {
        clickWebElement(conf.getFindTicketButton());
    }
}
