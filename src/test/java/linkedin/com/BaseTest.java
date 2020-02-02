package linkedin.com;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected  HomePage homePage;
    protected  ApplyPage applyPage;
    protected MyPage myPage;

//    @Test
//     public void testBase(){


    @BeforeClass
    public static void start() {

        System.setProperty("webdriver.chrome.driver", "/Users/vladimirpodoinitsyn/Desktop/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.linkedin.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "LinkedIn: Log In or Sign Up";
          Assert.assertEquals(expectedTitle, actualTitle);
    }

//    @AfterClass
//    public static void finish() {
//
//          driver.quit();
//    }
}
