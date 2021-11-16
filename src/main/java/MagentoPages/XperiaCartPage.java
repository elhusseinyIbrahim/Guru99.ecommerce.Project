package MagentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class XperiaCartPage {
    private final WebDriver driver;
    //Locator
    By Quantity_Box = By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input");
    By ErrorMessage = By.cssSelector(".error-msg span");

    // constructor
    public XperiaCartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Keywords
    public void add1000ToXperiaCart() {


    }

    public String cartErrorMessage() {
        driver.findElement(Quantity_Box).sendKeys("000");
        driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button")).click();
        return driver.findElement(ErrorMessage).getText();
    }

}
