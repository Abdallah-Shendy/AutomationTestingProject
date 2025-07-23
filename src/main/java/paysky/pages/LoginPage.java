package paysky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import paysky.browsers.BrowserFactory;
import paysky.utils.TestData;

import static paysky.browsers.BrowserFactory.driver;

public class LoginPage {

    public static void LoginWithValidUser() {
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys(TestData.fakeAccount);
        driver.findElement(By.id("password")).sendKeys(TestData.fakePassword);
        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[3]/input")).click();
        // Automatically redirect to contact page
        driver.get("https://practicesoftwaretesting.com/contact");
    }
}