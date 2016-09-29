package ResultPage;

import Base.Base;
import org.openqa.selenium.WebDriver;

/**
 * Created by Çağatay Han on 4.09.2016.
 */
public class ResultPage extends Base {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstFlight() {
        waitForReady(conf.getResultList());
        clickWebElement(conf.getFirstFlightFromResults());
        waitForLoad(2);
    }


}
