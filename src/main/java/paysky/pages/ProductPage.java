package paysky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import paysky.utils.TestData;

import java.time.Duration;

import static paysky.browsers.BrowserFactory.driver;

public class ProductPage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public  void addToCart() {

        WebElement addButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("btn-add-to-cart"))
        );
        addButton.click();

        WebElement successMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("toast-message"))
        );

        String expectedText = "Product added to shopping cart.";
        String actualText = successMsg.getText();
        if (!actualText.contains(expectedText)) {
            throw new AssertionError("Expected success message not found. Actual: " + actualText);
        }

        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.className("toast-message"))
        );
    }


    public  void NavigateToCart (){

        WebElement cartIcon = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a"))
        );
        cartIcon.click();

    }
}
