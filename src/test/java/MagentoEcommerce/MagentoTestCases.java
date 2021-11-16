package MagentoEcommerce;

import MagentoPages.HomePage;
import MagentoPages.MobilePage;
import MagentoPages.XperiaCartPage;
import MagentoPages.XperiaPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoTestCases {
    public WebDriver driver;
    public HomePage homePage;
    public MobilePage mobilePage;
    public XperiaPage xperiaPage;
    public XperiaCartPage xperiaCartPage;


    @Description("Validating the Magento Ecommerce page title")
    @Test
    public void CheckPageTitle() {
        Assert.assertEquals("THIS IS DEMO SITE FOR   ", homePage.getPageTitle());
    }

    @Description("Validating Phone List Sorted By Name")
    @Test
    public void CheckingListOrderAfterStringByName() {
        homePage.navigateToMobilePage();
        Assert.assertEquals("IPHONE", mobilePage.SortingListByName());

    }

    @Description("Validating the Xperia Price on Phone List and Phone Details Page")
    @Test
    public void CheckingXPeriaPrice() {
        homePage.navigateToMobilePage();
        mobilePage.navigateToPhoneDetails();
        Assert.assertEquals(mobilePage.gettingPrice(), xperiaPage.xPeriaDetailsPrice());

    }

    @Description("Validating the Xperia Price on Phone List and Phone Details Page")
    @Test
    public void adding1000XperiaToCartErrorValidation() {
        homePage.navigateToMobilePage();
        mobilePage.navigateToXperiaCart();
        Assert.assertEquals("The requested quantity for \"Sony Xperia\" is not available.", xperiaCartPage.cartErrorMessage());

    }


    @BeforeClass
    public void BrowserSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        mobilePage = new MobilePage(driver);
        xperiaPage = new XperiaPage(driver);
        xperiaCartPage = new XperiaCartPage(driver);
        homePage.navigateToMagento();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
