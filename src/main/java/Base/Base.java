package Base;

import Utils.Configurations;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Çağatay Han on 2.09.2016.
 */
public abstract class Base {

    protected static WebDriver driver;
    protected Configurations conf;

    public Base(WebDriver driver) {
        this.driver = driver;
        conf = Configurations.getInstance();
    }

    protected String driverGetTitle() {
        return driver.getTitle();
    }

    protected static void HighlightElement(WebElement el) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", el,
                " border: 2px solid red;");
    }

    protected void HighlightElementClick(WebElement el) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", el,
                " border: 2px solid blue;");
    }

    protected void getResponseXHR() {

        Object response = ((JavascriptExecutor) driver).executeAsyncScript(
                "var callback = arguments[arguments.length - 1];" +
                        "var xhr = new XMLHttpRequest();" +
                        "var url = 'https://www.enuygun.com/ucak-bileti/istanbul-antalya-havalimani-ista-ayt/?gidis=13.10.2016&yetiskin=1&sinif=ekonomi&trip=domestic';"+
                        "xhr.open('GET', url, true);" +

                        "xhr.setRequestHeader('Content-type', 'application/json');" +
                        "xhr.setRequestHeader('Connection', 'close');" +
                        "xhr.setRequestHeader('Referer', 'url');" +
                        "xhr.onreadystatechange = function() {" +
                        "    if(xhr.readyState == 4) {" +
                        "        callback(xhr.responseText);" +
                        "    };" +
                        "};" +
                        "xhr.send();");
        System.out.println((String)response);
    }

    protected void webDriverRefresh() {
        driver.navigate().refresh();
    }

    protected void waitForLoad(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    protected WebElement findWebElement(String html) {
        WebElement el = driver.findElement(By.cssSelector(html));
        HighlightElement(el);
        return el;
    }

    protected List<WebElement> findWebElementsList(String html) {

        List<WebElement> elements = driver.findElements(By.cssSelector(html));

        return elements;

    }

    protected HashMap findWebElementsHashMap(String html) {

        List<WebElement> elements = findWebElementsList(html);
        int divSize = elements.size();

        HashMap<Integer, WebElement> map = new HashMap<Integer, WebElement>();

        for(int i = 0; i < divSize; i++) {
            map.put(i, elements.get(i));
        }

        return map;
    }

    protected void clickWebElement(String html) {
        WebElement el = findWebElement(html);
        HighlightElementClick(el);
        el.click();
    }

    protected void clickWebElement(WebElement el) {
        el.click();
    }

    protected boolean webElementIsDisplayed(String html) {
        return findWebElement(html).isDisplayed();
    }

    protected void fillInputFieldWebElement(String htmlText, String sendKeyText) {
        fillInputFieldWebElement(findWebElement(htmlText), sendKeyText);
    }

    protected void fillInputFieldWebElement(WebElement element, String sendKeyText) {
        element.clear();
        element.sendKeys(sendKeyText);
    }

    protected String getText(String htmlText) {
        WebElement el = findWebElement(htmlText);
        return el.getText();
    }

    protected void moveElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    protected boolean checkBrokenLink(WebElement element) {
        boolean x = false;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(element.getAttribute("href"));
            HttpResponse response = client.execute(request);
            System.out.println(request);
            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("Link kırık değil");
                return x = true;
            } else {
                System.out.println("Link kırık");
                return x = false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return x;
    }

    protected void waitForReady(String html) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement el = driver.findElement(By.cssSelector(html));
        wait.until(ExpectedConditions.visibilityOf(el));
    }

    protected boolean elementIsPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        }
        catch (NoSuchElementException ex) {
            return false;
        }
    }
}
