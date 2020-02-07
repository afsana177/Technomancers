package footerTest;

import footer.PrivacyPolicy;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PrivacyPolicyTest extends RottentomatoHome {

    @Test(priority = 1)
    public void clickOnPrivacyPolicyBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver,PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void clickOnTermsAndPoliciesBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void clickOnTermsOfUseBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        prvcPlc.clickOnTermsOfUse();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void clickOnTicketPolicyBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        prvcPlc.clickOnTermsOfUse();
        prvcPlc.clickOnTicketPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void clickOnPromoCodePolicyBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        prvcPlc.clickOnTermsOfUse();
        prvcPlc.clickOnTicketPolicy();
        prvcPlc.clickOnPromoCodePolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void clickOnGiftCardTermsBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        prvcPlc.clickOnTermsOfUse();
        prvcPlc.clickOnTicketPolicy();
        prvcPlc.clickOnPromoCodePolicy();
        prvcPlc.clickOnGiftCardTerms();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void clickOnCookiesAndTrackingBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        prvcPlc.clickOnTermsOfUse();
        prvcPlc.clickOnTicketPolicy();
        prvcPlc.clickOnPromoCodePolicy();
        prvcPlc.clickOnGiftCardTerms();
        prvcPlc.clickOnCookiesAndTracking();
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void clickOnFandangnowPolicyBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        prvcPlc.clickOnTermsOfUse();
        prvcPlc.clickOnTicketPolicy();
        prvcPlc.clickOnPromoCodePolicy();
        prvcPlc.clickOnGiftCardTerms();
        prvcPlc.clickOnCookiesAndTracking();
        prvcPlc.clickOnFandangnowPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void clickOnVip_programTermsBtn() throws InterruptedException {
        PrivacyPolicy prvcPlc = PageFactory.initElements(driver, PrivacyPolicy.class);
        prvcPlc.clickOnPrivacyPolicy();
        prvcPlc.clickOnTermsAndPolicies();
        prvcPlc.clickOnTermsOfUse();
        prvcPlc.clickOnTicketPolicy();
        prvcPlc.clickOnPromoCodePolicy();
        prvcPlc.clickOnGiftCardTerms();
        prvcPlc.clickOnCookiesAndTracking();
        prvcPlc.clickOnFandangnowPolicy();
        prvcPlc.clickOnVip_programTerms();
        Thread.sleep(2000);
    }
}