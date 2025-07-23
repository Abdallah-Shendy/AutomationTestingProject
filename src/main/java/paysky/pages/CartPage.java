package paysky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static paysky.browsers.BrowserFactory.driver;

public class CartPage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)) ;

    public  void NavigateToCart() {
        driver.get("https://practicesoftwaretesting.com/checkout");
    }
    public  void clickOnCheckoutButton(){
        WebElement checkOutButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/div/button"))
        );
        checkOutButton.click();

    }

}
