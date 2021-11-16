package MagentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MobilePage {
    private final WebDriver driver;

    //Locator
    By Iphone_Text = By.linkText("IPHONE");
    By XPeriaPrice = By.cssSelector("#product-price-1 > span.price");
    By XperiaPage = By.id("product-collection-image-1");
    By AddToCart_Xperia = By.cssSelector("li:nth-of-type(3) > .product-info  button[title='Add to Cart']");


    // constructor
    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }

    //Keywords
    public String SortingListByName() {
        new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]")))
                .selectByVisibleText("Name");
        return driver.findElement(Iphone_Text).getText();
    }

    public String gettingPrice() {
        return driver.findElement(XPeriaPrice).getText();

    }

    public void navigateToPhoneDetails() {

        driver.findElement(XperiaPage).click();
    }

    public void navigateToXperiaCart() {

        driver.findElement(AddToCart_Xperia).click();
    }


}
