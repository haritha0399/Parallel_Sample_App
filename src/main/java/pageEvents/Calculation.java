package pageEvents;

import io.appium.java_client.AppiumDriver;
//import pageObject.CalculatorElements;
import pageObject.CalculatorElements;
import utils.ElementFetch;

public class Calculation implements CalculatorElements {
    AppiumDriver driver;

    public Calculation(AppiumDriver driver){
        this.driver = driver;
    }

    public void firstCalculation() throws InterruptedException {
        ElementFetch ef = new ElementFetch();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.digit5).click();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.plus).click();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.digit4).click();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.equal).click();
        Thread.sleep(2000);

    }

    public void secondCalculation() throws InterruptedException {
        ElementFetch ef = new ElementFetch();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.digit7).click();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.plus).click();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.digit5).click();
        Thread.sleep(2000);
        ef.getWebElement(driver, "ID", CalculatorElements.equal).click();
        Thread.sleep(2000);

    }
}
