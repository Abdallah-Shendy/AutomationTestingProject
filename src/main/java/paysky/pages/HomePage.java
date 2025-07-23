package paysky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static paysky.browsers.BrowserFactory.driver;

public class HomePage {

    public static  void navigateToHomePage() {
        driver.get("https://practicesoftwaretesting.com/");
    }
    public static void SearchForProduct(){
        driver.findElement(By.id("search-query")).sendKeys("Pliers");
        driver.findElement(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[1]/form[2]/div/button[2]")).click();
    }
    public static void clickOnProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[2]/div[2]")
        ));
        product.click();
    }
}
