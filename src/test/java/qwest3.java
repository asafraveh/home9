import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class qwest3 {
    String x="Google Translate";
    private static WebDriver driver;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);
        driver.get("https://translate.google.com");
    }

    @Test
    public void test_01() {
        System.out.println(driver.getTitle());

    }

//    @Test
//    public void test_02() {
//        driver.manage().timeouts().
//        response.setHeader("Refresh", "0; URL=https://translate.google.com");

        @Test
        public void test01_assert(){
            Assert.assertEquals(x,driver.getTitle());

        }
}