import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.UrlPath;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class qwest2 {

    private static ChromeDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
//    }

//    @Test
//    public void test01_assert() {
//        driver.get("https://dgotlieb.github.io/WebCalculator/");
//        UrlPath(https://dgotlieb.github.io/WebCalculator/")
//        Assert.assertEquals(x, y);
//    }
    }
}