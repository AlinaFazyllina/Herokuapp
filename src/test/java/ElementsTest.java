import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ElementsTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    @Test
    public void ChekButton() {
// 2 раза тап на кнопку
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
// 1 раз удалили
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        int quantityDeleteButtons = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        Assert.assertEquals(quantityDeleteButtons, 1, "Количество кнопок 'Delete' должно быть 1");
    }

    @AfterMethod(alwaysRun = true)
    public void quit() {
        driver.quit();
    }
}
