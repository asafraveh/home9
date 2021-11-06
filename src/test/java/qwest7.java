import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class qwest7 {
    private static ChromeDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void test01_size() {
        WebElement buttonElement = driver.findElement(By.id("two"));
        System.out.println(buttonElement.getSize().getHeight());
    }

    @Test
    public void test02_size() {
        WebElement buttonElement = driver.findElement(By.id("six"));
        System.out.println(buttonElement.getSize().getWidth());
    }
}