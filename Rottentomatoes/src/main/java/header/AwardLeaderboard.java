package header;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AwardLeaderboard extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Awards Leaderboard')]") WebElement userCanClickOnAwardLeaderboard;
    @FindBy(xpath = "//img[@class='social-tools-facebook-like fb_like']") WebElement clickFbLikeBtn;
    @FindBy(xpath = "//img[@class='social-tools-facebook-share']") WebElement clickOnShareBtn;
    @FindBy(xpath = "//img[@class='social-tools-twitter']") WebElement twitterBtn;
    @FindBy(xpath = "It might be a child of svg/pseudo/comment/iframe from different src. XPath doesn't support for them.") WebElement discussion;

    public void userClickOnAwardLeaderboard(){
        userCanClickOnAwardLeaderboard.click();
    }
    public void userClickOnLikeBtn(){
        clickFbLikeBtn.click();
    }
    public void userCanShareBtn(){
        clickOnShareBtn.click();
    }
    public void clickTwitterBtn(){
        twitterBtn.click();
    }
    public void joinTheDiscussion(){
        discussion.sendKeys("Maleficent is a good movie");
    }
}