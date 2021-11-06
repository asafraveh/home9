import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class qwest1 {
    private static ChromeDriver driver;
    String x = String.valueOf(11);

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void test01_size() {
        WebElement buttonElement = driver.findElement(By.id("seven"));
        System.out.println(buttonElement.getSize());

    }

    @Test
    public void test02_() {
        WebElement buttonElement = driver.findElement(By.id("six"));
        System.out.println(buttonElement.isDisplayed());
    }


    @Test
    public void test03_result() {
        WebElement buttonElement = driver.findElement(By.id("six"));
        Actions myAction = new Actions(driver);
        myAction.click(buttonElement);
        myAction.perform();
    }

    @Test
    public void test04_add() {
        WebElement buttonElement = driver.findElement(By.id("add"));
        Actions myAction = new Actions(driver);
        myAction.click(buttonElement);
        myAction.perform();

    }

    @Test
    public void test05_five() {
        WebElement buttonElement = driver.findElement(By.id("five"));
        Actions myAction = new Actions(driver);
        myAction.click(buttonElement);
        myAction.perform();
    }

    @Test
    public void test06_equal() {
        WebElement buttonElement = driver.findElement(By.id("equal"));
        Actions myAction = new Actions(driver);
        myAction.click(buttonElement);
        myAction.perform();
        System.out.println();
    }
    @Test
    public void test07_equal() {
        WebElement screen = driver.findElement(By.id("screen"));
        System.out.println(screen.getCssValue(String.valueOf(screen)));
    }
        @Test
        public void test08_assert(){
            String.valueOf(11);
            int y = 11;
            Assert.assertEquals(x,y);
        }
    }
