package payskyTesting.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.testng.Tag;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import paysky.pages.*;
import paysky.browsers.BrowserFactory;

public class FlowTest {
    WebDriver driver;
    RegistrationPage registrationPage;
    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage ;
    ContactPage contactPage;


    @BeforeClass
    public void setUp() {
        driver = BrowserFactory.getDriver();
        registrationPage = new RegistrationPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        productPage = new ProductPage();
        cartPage = new CartPage();
        contactPage = new ContactPage();

    }

    @org.testng.annotations.Test(priority = 1)
    @Description("Login with valid user")
    @Link("https://talent500.com/blog/how-to-install-and-use-the-scoop-windows-package-manager/")
    @Tag("Regression")
    @Severity(SeverityLevel.CRITICAL)
    public void completeFlowTest() {
        registrationPage.RegisterWithValidUser();
        loginPage.LoginWithValidUser();
        homePage.navigateToHomePage();
        homePage.SearchForProduct();
        homePage.clickOnProduct();
        productPage.addToCart();
        productPage.NavigateToCart();
        cartPage.NavigateToCart();
        cartPage.clickOnCheckoutButton();
        loginPage.LoginWithValidUser();
        contactPage.navigateToContactPage();
        contactPage.fillContactForm();


    }
    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
