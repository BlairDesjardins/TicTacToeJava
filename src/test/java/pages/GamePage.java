package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamePage {

    @FindBy(id = "Uname")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login")
    private WebElement login;

    @FindBy(id = "new-game-btn")
    private WebElement newGameBtn;

    @FindBy(id = "player-name")
    private WebElement playerName;

    @FindBy(xpath = "//*[@id=\"newGameModal\"]/div/div/div[3]/button")
    private WebElement startGame;

    @FindBy(id = "players")
    private WebElement players;

    @FindBy(id = "forfeit-btn")
    private WebElement forfeitBtn;

    public GamePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void sendUsername(String name) {
        username.sendKeys(name);
    }

    public void sendPassword(String pw) {
        password.sendKeys(pw);
    }

    public void clickLogin() {
        login.click();
    }

    public void clickNewGame() {
        newGameBtn.click();
    }

    public void sendPlayerName(String name) {
        playerName.sendKeys(name);
    }

    public void clickStartGame() {
        startGame.click();
    }

    public WebElement getPlayers() {
        return players;
    }

    public void clickForfeit() {
        forfeitBtn.click();
    }
}
