import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class qwest8 {
    private static ChromeDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.themarker.com/");
    }
    @Test
    public void test01() {
          = driver.f(By.id("two"));
        driver.getPageSource();
        System.out.println(buttonElement.getSize().getHeight());
    }
}