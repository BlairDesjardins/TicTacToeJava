package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GamePage;

import java.util.concurrent.TimeUnit;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue = {"steps"})
public class TestRunner {

    public static WebDriver driver;
    public static GamePage gamePage;

    @BeforeClass
    public static void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/blair/Documents/Revature/chromedriver.exe");

        driver = new ChromeDriver();
        gamePage = new GamePage(driver);

        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}