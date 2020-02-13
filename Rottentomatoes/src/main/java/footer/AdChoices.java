package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class AdChoices extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'AdChoices')]") WebElement adChoices;
    @FindBy(xpath = "//a[contains(text(),'COOKIE MANAGEMENT')]") WebElement cookieManagement;
    @FindBy(xpath = "//a[contains(text(),'CONTACT US')]") WebElement contactUs;
    @FindBy(xpath = "//a[contains(text(),'CHANGES TO THIS NOTICE')]") WebElement changesToThisNotice;
    @FindBy(xpath = "//strong[contains(text(),'Google Chrome')]") WebElement googleChrome;
    @FindBy(xpath = "//strong[contains(text(),'Mozilla Firefox')]") WebElement mozillaFirefox;
    @FindBy(xpath = "//strong[contains(text(),' Safari')]") WebElement appleSafari;
    @FindBy(xpath = "//strong[contains(text(),'Microsoft Internet Explorer')]") WebElement microsoftInternetExplorer;
    @FindBy(xpath = "//div[@class='panel']//div[2]//table[1]//tbody[1]//tr[1]//td[1]//a[1]//strong[1]") WebElement googlesPrivacyPolicy;
    @FindBy(xpath = "//div[@class='panel']//div[2]//table[1]//tbody[1]//tr[1]//td[2]//a[1]//strong[1]") WebElement googleAnalytics;
    @FindBy(xpath = "//div[@class='panel']//div[2]//table[1]//tbody[1]//tr[2]//td[2]//a[1]//strong[1]") WebElement omnituresOptOut;
    @FindBy(xpath = "//div[4]//table[1]//tbody[1]//tr[2]//td[1]//a[1]//strong[1]") WebElement facebookPrivacyPolicy;
    @FindBy(css = "#email") WebElement inputEmailOrPhone;
    @FindBy(xpath = "//input[@id='pass']") WebElement inputPassword;
    @FindBy(xpath = "//input[@id='u_0_2']") WebElement clickLogIn;
    @FindBy(xpath = "//tr[3]//td[1]//a[1]//strong[1]") WebElement twitterPrivacyPolicy;
    @FindBy(xpath = "//tr[4]//td[1]//a[1]//strong[1]") WebElement snapchatPrivacyPolicy;

    public void clickOnAdChoices(){ adChoices.click(); }
    public void clickOnCookieManagement(){ cookieManagement.click(); }
    public void clickContactUs(){ contactUs.click(); }
    public void clickOnChangesToThisNotice(){ changesToThisNotice.click();}
    public void clickOnGoogleChrome(){ googleChrome.click();}
    public void clickOnMozillaFirefox(){ mozillaFirefox.click();}
    public void clickOnAppleSafari(){ appleSafari.click();}
    public void clickOnMicrosoftInternetExplorar(){ microsoftInternetExplorer.click();}
    public void clickOnGooglesPrivacyPolicy(){ googlesPrivacyPolicy.click();}
    public void clickOnGoogleAnalyticsOptOut(){ googleAnalytics.click();}
    public void clickOnOmnituresOptOut(){ omnituresOptOut.click();}
    public void clickOnFacebookPrivacyPolicy(){ facebookPrivacyPolicy.click();}
    public void typeEmailOrPhone(){inputEmailOrPhone.sendKeys("rajib177@yahoo.com");}
    public void typePassword(){inputPassword.sendKeys("simple177");}
    public void hitLogIn(){clickLogIn.click();}
    public void clickTwitterPrivacyPolicy(){twitterPrivacyPolicy.click();}
    public void clickSnapchatPrivacyPolicy(){snapchatPrivacyPolicy.click();}
}