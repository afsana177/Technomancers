package footerTest;

import footer.AdChoices;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdChoicesTest extends RottentomatoHome {

    @Test(priority = 1)
    public void clickAdChoices() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void cookieManagementBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void contactUsBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void changesToThisNoticeBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void googleChromeBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void mozillaFirefoxBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void appleSafariBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void microsoftInternetExplorerBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        Thread.sleep(2000);
    }
    @Test(priority = 9)
    public void googlesPrivacyPolicyBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 10)
    public void googleAnalyticsOptOutBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        Thread.sleep(2000);
    }
    @Test(priority = 11)
    public void omnituresOptOutBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        adChoice.clickOnOmnituresOptOut();
        Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void facebookPrivacyPolicyBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        adChoice.clickOnOmnituresOptOut();
        adChoice.clickOnFacebookPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 13)
    public void enterEmailOrPhone() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        adChoice.clickOnOmnituresOptOut();
        adChoice.clickOnFacebookPrivacyPolicy();
        adChoice.typeEmailOrPhone();
        Thread.sleep(2000);
    }
    @Test(priority = 14)
    public void enterPassword() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        adChoice.clickOnOmnituresOptOut();
        adChoice.clickOnFacebookPrivacyPolicy();
        adChoice.typeEmailOrPhone();
        adChoice.typePassword();
        Thread.sleep(2000);
    }
    @Test(priority = 15)
    public void clickOnLogInBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        adChoice.clickOnOmnituresOptOut();
        adChoice.clickOnFacebookPrivacyPolicy();
        adChoice.typeEmailOrPhone();
        adChoice.typePassword();
        adChoice.hitLogIn();
        Thread.sleep(2000);
    }
    @Test(priority = 16)
    public void twitterPrivacyPolicyBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        adChoice.clickOnOmnituresOptOut();
        adChoice.clickOnFacebookPrivacyPolicy();
        adChoice.typeEmailOrPhone();
        adChoice.typePassword();
        adChoice.hitLogIn();
        adChoice.clickTwitterPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 17)
    public void snapchatPrivacyPolicyBtn() throws InterruptedException {
        AdChoices adChoice = PageFactory.initElements(driver,AdChoices.class);
        adChoice.clickOnAdChoices();
        adChoice.clickOnCookieManagement();
        adChoice.clickContactUs();
        adChoice.clickOnChangesToThisNotice();
        adChoice.clickOnGoogleChrome();
        adChoice.clickOnMozillaFirefox();
        adChoice.clickOnAppleSafari();
        adChoice.clickOnMicrosoftInternetExplorar();
        adChoice.clickOnGooglesPrivacyPolicy();
        adChoice.clickOnGoogleAnalyticsOptOut();
        adChoice.clickOnOmnituresOptOut();
        adChoice.clickOnFacebookPrivacyPolicy();
        adChoice.typeEmailOrPhone();
        adChoice.typePassword();
        adChoice.hitLogIn();
        adChoice.clickTwitterPrivacyPolicy();
        adChoice.clickSnapchatPrivacyPolicy();
        Thread.sleep(2000);
    }

}
