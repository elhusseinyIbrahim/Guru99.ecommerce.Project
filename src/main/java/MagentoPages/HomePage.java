package MagentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    //Locator

    By Page_Text = By.cssSelector("h2");
    By MobilePage_Link = By.linkText("MOBILE");


    // constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;}
    //Keywords
    public void navigateToMagento() {
        driver.navigate().to("http://live.techpanda.org/");
    }
public String getPageTitle(){
             return driver.findElement(Page_Text).getText();
  }
  public void navigateToMobilePage(){
            driver.findElement(MobilePage_Link).click();
  }


}

