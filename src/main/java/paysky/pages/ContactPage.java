package paysky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import paysky.utils.TestData;
import java.time.Duration;

import static paysky.browsers.BrowserFactory.driver;

public class ContactPage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public void navigateToContactPage() {
     driver.get("https://practicesoftwaretesting.com/contact");
    }
    public void fillContactForm(){
        driver.findElement(By.id("first_name")).sendKeys("Abdullah");
        driver.findElement(By.id("last_name")).sendKeys("Shendy");
        driver.findElement(By.id("email")).sendKeys(TestData.fakeAccount);
        driver.findElement(By.id("subject")).click();
        driver.findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/div/form/div/div[2]/div[1]/div/select/option[5]")).click();
        driver.findElement(By.id("message")).sendKeys("Hello Abdallah! Practicing count: this line is 50.");
        driver.findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/div/form/div/div[2]/div[4]/input")).click();


        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".alert.alert-success.mt-3")
        ));


        String expectedMessage = "Thanks for your message! We will contact you shortly.";
        String actualMessage = alert.getText();

        if (!actualMessage.contains(expectedMessage)) {
            throw new AssertionError("Success message not found!");
        }
    }

    }

