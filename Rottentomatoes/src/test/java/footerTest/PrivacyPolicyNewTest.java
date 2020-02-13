package footerTest;

import footer.PrivacyPolicyNew;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PrivacyPolicyNewTest extends RottentomatoHome {

    @Test(priority = 1)
    public void privacyPolicyNewBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void universalPrivacyPolicyBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void warnerBroslPrivacyPolicyBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void personalInformationBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void shareYourInformationBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void useOfYourInformationBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        privacyPlcNw.legalBasesForUseOfYourInformation();
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void childrenBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        privacyPlcNw.legalBasesForUseOfYourInformation();
        privacyPlcNw.clickChildren();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void yourRightsBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        privacyPlcNw.legalBasesForUseOfYourInformation();
        privacyPlcNw.clickChildren();
        privacyPlcNw.clickOnYourRights();
        Thread.sleep(2000);
    }
    @Test(priority = 9)
    public void yourChoiceBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        privacyPlcNw.legalBasesForUseOfYourInformation();
        privacyPlcNw.clickChildren();
        privacyPlcNw.clickOnYourRights();
        privacyPlcNw.clickOnYourChoice();
        Thread.sleep(2000);
    }
    @Test(priority = 11)
    public void internationalTransfersBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw= PageFactory.initElements(driver,PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        privacyPlcNw.legalBasesForUseOfYourInformation();
        privacyPlcNw.clickChildren();
        privacyPlcNw.clickOnYourRights();
        privacyPlcNw.clickOnYourChoice();
        privacyPlcNw.clickOnInternationalTransfers();
        Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void updatesOfPrivacyPolicyBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw = PageFactory.initElements(driver, PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        privacyPlcNw.legalBasesForUseOfYourInformation();
        privacyPlcNw.clickChildren();
        privacyPlcNw.clickOnYourRights();
        privacyPlcNw.clickOnYourChoice();
        privacyPlcNw.clickOnInternationalTransfers();
        privacyPlcNw.clickOnUpdatesOfOurPrivacyPolicy();
        Thread.sleep(2000);
    }
    @Test(priority = 13)
    public void contactUsBtn() throws InterruptedException {
        PrivacyPolicyNew privacyPlcNw = PageFactory.initElements(driver, PrivacyPolicyNew.class);
        privacyPlcNw.clickOnNewPrivacyPolicy();
        privacyPlcNw.clickUniversalPrivacyPolicy();
        privacyPlcNw.clickOnWarnerBrosPrivacyPolicy();
        privacyPlcNw.personalInformation();
        privacyPlcNw.clickShareYourInfo();
        privacyPlcNw.legalBasesForUseOfYourInformation();
        privacyPlcNw.clickChildren();
        privacyPlcNw.clickOnYourRights();
        privacyPlcNw.clickOnYourChoice();
        privacyPlcNw.clickOnInternationalTransfers();
        privacyPlcNw.clickOnUpdatesOfOurPrivacyPolicy();
        privacyPlcNw.clickOnContactUs();
        Thread.sleep(2000);
    }
}