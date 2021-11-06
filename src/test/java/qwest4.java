import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class qwest4 {
    private static WebDriver driver;
    @BeforeClass
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://translate.google.com");
        options.addArguments("--disable-extensions");
    }
    @Test
    public void test_01() {
        System.out.println(driver.getTitle());
}
    }