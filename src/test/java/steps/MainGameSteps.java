package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GamePage;
import runner.TestRunner;

import java.util.concurrent.TimeUnit;

public class MainGameSteps {

    public static WebDriver driver = TestRunner.driver;
    public static GamePage gamePage = TestRunner.gamePage;

    @Given("^The user is on the log in page$")
    public void the_user_is_on_the_log_in_page() {
        driver.get("C:/Users/blair/Documents/Revature/TicTacToeFrontend/login.html");
    }

    @Given("^The user inputs their username$")
    public void the_user_inputs_their_username() {
        gamePage.sendUsername("blair");
    }

    @Given("^The user inputs their password$")
    public void the_user_inputs_their_password() {
        gamePage.sendPassword("password");
    }

    @Given("^The user presses log in$")
    public void the_user_presses_log_in() {
        gamePage.clickLogin();
    }

    @When("^The user presses new game$")
    public void the_user_presses_new_game() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("new-game-btn")));
        gamePage.clickNewGame();
    }

    @When("^The user inputs the ID of another player$")
    public void the_user_inputs_the_ID_of_another_player() {
        gamePage.sendPlayerName("4");
    }

    @When("^The user presses start game$")
    public void the_user_presses_start_game() {
        gamePage.clickStartGame();
    }

    @When("^The user presses forfeit$")
    public void the_user_presses_forfeit() {
        gamePage.clickForfeit();
    }

    @Then("^The title should say the player names$")
    public void the_title_should_say_the_player_names() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(gamePage.getPlayers(), "(X)"));
        Assert.assertEquals("blair (X) VS kavitha (O)", gamePage.getPlayers().getText());
    }

    @Then("^An alert will say you lost$")
    public void an_alert_will_say_you_lost() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("You Lost!", driver.switchTo().alert().getText());
    }

}
