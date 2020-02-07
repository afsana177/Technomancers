package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FollowUs extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='footer-follow-us-facebook']")
    WebElement followOnFacebook;
    @FindBy(how = How.XPATH,using = "//input[@id='email']")
    WebElement giveEmailOrPhone;
    @FindBy(how = How.XPATH,using = "//input[@id='pass']")
    WebElement givePassword;
    @FindBy(xpath = "//a[@class='js-social-tools-btn social-tools__btn social-tools__btn--twitter']")
    WebElement followOnTwitter;
    @FindBy(xpath = "//a[@class='js-social-tools-btn social-tools__btn social-tools__btn--pinterest']")
    WebElement followOnPinterest;
    @FindBy(xpath = "//a[@class='js-social-tools-btn social-tools__btn social-tools__btn--stumbleupon']")
    WebElement followOnStumbleUpon;


    public void followByFacebook() {
        followOnFacebook.click();
    }
    public void signIn(String email, String password){
        giveEmailOrPhone.sendKeys(email);
        givePassword.sendKeys(password);
    }
    public void followByTwitter() {
        followOnTwitter.click();
    }
    public void followByPinterest(){
        followOnPinterest.click();
    }
    public void followByStumbleUpon(){
        followOnStumbleUpon.click();
    }
}