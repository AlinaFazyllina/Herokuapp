import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.html.HTMLInputElement;

public class InputsTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");
    }

    @Test
    public void ChekField() {
        SoftAssert softAssert = new SoftAssert();
        
        
//для arrow_up
        Actions action = new Actions(driver);
        
        HTMLInputElement input = null;
        
        for (int i = 1; i < 11; i++) {
            input.click();
            action.sendKeys(Keys.ARROW_UP).perform();
            int number = Integer.parseInt(input.getAttribute("value"));
            Assert.assertEquals(number,i,"Ошибка!!  значения отличаются");
            System.out.println("Значение  = "+number);
        }
        //для arrow_down
        for (int i = 10; i >= 0; i--) {
            int numberDown = Integer.parseInt(input.getAttribute("value"));
            Assert.assertEquals(numberDown,i,"Ошибка!!  значения отличаются");
            action.sendKeys(Keys.ARROW_DOWN).perform();
            System.out.println("Значение  = "+numberDown);
        }

    }

    @AfterMethod(alwaysRun = true)
    public void quit() {
        driver.quit();
    }
}




