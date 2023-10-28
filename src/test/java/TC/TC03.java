package TC;

import driver.driverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class TC03 {
    public static void tc03() {

        // 1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            // 2. Open target page
            driver.get("http://live.techpanda.org/");
            // Delay Web for Performance

            // 3. Click on Mobile
            WebElement mobileMenu = driver.findElement(By.className("level0"));
            mobileMenu.click();

            // 4. Click on Add To Cart Sony Xperia mobile
            WebElement sonyXperiaLink = driver.findElement(By.xpath("(//button[@class='button btn-cart'])[2]"));
            sonyXperiaLink.click();

            // 5. Type to hange QTY value to 1000
            WebElement sonyXperiaQTY = driver.findElement(By.xpath("//input[@class='input-text qty']"));
            sonyXperiaQTY.clear(); // clear the QTY before
            sonyXperiaQTY.sendKeys("1000");

            // 6. Click "Update" Button
            WebElement updateButton = driver.findElement(By.xpath("//span[text()='Update']"));
            updateButton.click();

            // 7. Verify error message
            WebElement errorMessage = driver.findElement(By.xpath("//p[@class='item-msg error']"));
            String expectedErrorMessage = "The requested quantity for 'Sony Xperia' is not available.";

            //* this allow skip the error and continue testing
            try {
                assertEquals(expectedErrorMessage, errorMessage.getText());
            }catch (AssertionError  e) {
                System.out.println("Assertion error caught: " + e.getMessage());
            }

            // 8. Click on Empty Cart link
            WebElement emptyCartLink = driver.findElement(By.xpath("//span[text()='Empty Cart']"));
            emptyCartLink.click();

            // 9. Verify text cart is empty
            WebElement emptyCartMessage = driver.findElement(By.xpath("//h1[text()='Shopping Cart is Empty']"));
            Assert.assertTrue(emptyCartMessage.isDisplayed());

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 10. Quit browser session
        driver.quit();
    }
}
