package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementFetch {

    public WebElement getWebElement(AppiumDriver driver, String identifierType, String intentifierValue){
        switch (identifierType){
            case "ID":
                return driver.findElement(By.id(intentifierValue));
            case "CSS":
                return driver.findElement(By.className(intentifierValue));
            case "TAGNAME":
                return driver.findElement(By.tagName(intentifierValue));
            case "XPATH":
                return driver.findElement(By.xpath(intentifierValue));
            default:
                return null;
        }
    }


    public List<WebElement> getListOfWebElements(AppiumDriver driver, String identifierType, String identifierValue){
        switch (identifierType){
            case "ID":
                return driver.findElements(By.id(identifierValue));
            case "CSS":
                return driver.findElements(By.className(identifierValue));
            case "TAGNAME":
                return driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return driver.findElements(By.xpath(identifierValue));
            default:
                return null;
        }
    }
}
