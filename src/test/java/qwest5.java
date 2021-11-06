import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class qwest5 {
    private static ChromeDriver driver;
    String x = String.valueOf(11);

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\Desktop\\class9\\SeleniumMaven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Actions/");
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
//    @Test
//    public void elementScreenshotTest() {
//        takeElementScreenshot(driver.findElement(By.id("drop(event)")));
//    }
//
//    private static void takeElementScreenshot(WebElement element){
//        File screenShotFile = element.getScreenshotAs(OutputType.FILE); // take the screenshot
//        try {
//            FileUtils.copyFile(screenShotFile, new File("element-screenshot.png")); // save screenshot to disk
//        } catch (IOException e) {
//            e.printStackTrace();

        @Test
        public void belowTest() {
            driver.findElement(with(By.name("ondblclick")).below(By.id("drag1")));
            WebElement buttonElement = driver.findElement(By.id("drag1()"));
            Actions myAction = new Actions(driver);
            myAction.doubleClick(buttonElement);
            myAction.perform();
            System.out.println(driver.getTitle());
        }
    }
