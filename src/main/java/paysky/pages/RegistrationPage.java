package paysky.pages;

import org.openqa.selenium.By;
import paysky.browsers.BrowserFactory;
import paysky.utils.TestData;

import static paysky.browsers.BrowserFactory.driver;

public class RegistrationPage {
    public void RegisterWithValidUser() {
        BrowserFactory.getDriver();
        driver.get("https://practicesoftwaretesting.com/auth/register");
        driver.findElement(By.id("first_name")).sendKeys("Abdullah");
        driver.findElement(By.id("last_name")).sendKeys("Shendy");
        driver.findElement(By.id("dob")).sendKeys("2006-11-11");
        driver.findElement(By.id("street")).sendKeys("NasrRoad");
        driver.findElement(By.id("postal_code")).sendKeys("332255");
        driver.findElement(By.id("city")).sendKeys("Cairo");
        driver.findElement(By.id("state")).sendKeys("Giza");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("phone")).sendKeys("1019658871");
        driver.findElement(By.id("email")).sendKeys(TestData.fakeAccount);
        driver.findElement(By.id("password")).sendKeys(TestData.fakePassword);
        driver.findElement(By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/button")).click();
    }
}
