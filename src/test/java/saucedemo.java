import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class saucedemo {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void ChekField() {
        SoftAssert softAssert = new SoftAssert();

        WebElement[]  = driver.findElements(By.cssSelector("[type=]")).toArray(new WebElement[0]);

        WebElement  = [0];

        driver.findElement(By.tagName("")).sendKeys("standard_user");
        driver.findElement(By.tagName("")).sendKeys("secret_sauce");
        softAssert.assertTrue(.isDisplayed(), "Вход выполнен");
        .click();
        driver.findElement(By.tagName("")).sendKeys("locked_out_user");
        driver.findElement(By.tagName("")).sendKeys("secret_sauce");
        softAssert.assertTrue(.isDisplayed(), "Отображается сообщение об ошибке Sorry, this user has been locked out.");
        .click();
        driver.findElement(By.tagName("")).sendKeys("visual_user")
        driver.findElement(By.tagName("")).sendKeys("secret_sauce");
        softAssert.assertTrue(.isDisplayed(), "");
        .click();
        softAssert.assertAll();

    }

    @AfterMethod(alwaysRun = true)
    public void quit() {
        driver.quit();
    }
}
