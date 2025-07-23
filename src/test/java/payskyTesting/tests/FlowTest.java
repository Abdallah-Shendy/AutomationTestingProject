package payskyTesting.tests;

import org.openqa.selenium.WebDriver;
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


    @Test
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
}
