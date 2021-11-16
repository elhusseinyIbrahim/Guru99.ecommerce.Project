package MagentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XperiaPage {
    private final WebDriver driver;
    //Locator
    By detailPrice = By.cssSelector("span.price");

    // constructor
    public XperiaPage(WebDriver driver) {
        this.driver = driver;
    }

    //Keywords
    public String xPeriaDetailsPrice() {
        return driver.findElement(detailPrice).getText();
    }
}
