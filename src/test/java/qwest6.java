import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class qwest6 {
    private static ChromeDriver driver;
    String x = String.valueOf(11);

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Controllers/");
    }
@Test
    public void test_01(){

}
}