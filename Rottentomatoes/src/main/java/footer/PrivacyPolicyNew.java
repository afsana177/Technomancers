package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class PrivacyPolicyNew extends CommonAPI {

    @FindBy(xpath = "//a[@id='footer-privacy']") WebElement newPrivacyPolicy;
    @FindBy(xpath = "//a[contains(text(),'NBC/Universal Privacy Policy')]") WebElement universalPrivacyPolicy;
    @FindBy(xpath = "//body[@class='no-touch']/div[@id='page']/div[@class='policies']/div[@class='row']/div[@class='content width-75 tablet-width-100 mobile-width-100']/div[@class='panel']/section[@id='in-english']/ul/li[2]/a[1]") WebElement warnerBrosPrivacyPolicy;
    @FindBy(xpath = "//a[contains(text(),'Personal Information We Collect and Purposes')]") WebElement personalInfo;
    @FindBy(xpath = "//a[contains(text(),'When We Share Your Information')]") WebElement shareYourInformation;
    @FindBy(xpath = "//a[contains(text(),'Legal Bases For Use of Your Information')]") WebElement useOfYourInfo;
    @FindBy(xpath = "//a[contains(text(),'Children')]") WebElement children;
    @FindBy(xpath = "//ol//a[contains(text(),'Your Rights')]") WebElement yourRights;
    @FindBy(xpath = "//ol//a[contains(text(),'Your Choices')]") WebElement yourChoice;
    @FindBy(xpath = "//a[contains(text(),'How We Protect Your Information')]") WebElement protectYourInfo;
    @FindBy(xpath = "//a[contains(text(),'International Transfers')]") WebElement internationalTransfers;
    @FindBy(xpath = "//a[contains(text(),'Updates to Our Privacy Policy')]") WebElement updatesOfPrivacyPolicy;
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]") WebElement contactUs;

    public void clickOnNewPrivacyPolicy(){ newPrivacyPolicy.click(); }
    public void clickUniversalPrivacyPolicy(){ universalPrivacyPolicy.click(); }
    public void clickOnWarnerBrosPrivacyPolicy(){ warnerBrosPrivacyPolicy.click(); }
    public void personalInformation(){ personalInfo.click(); }
    public void clickShareYourInfo(){shareYourInformation.click();}
    public void legalBasesForUseOfYourInformation(){useOfYourInfo.click();}
    public void clickChildren(){children.click();}
    public void clickOnYourRights(){yourRights.click();}
    public void clickOnYourChoice(){protectYourInfo.click();}
    public void clickOnInternationalTransfers(){internationalTransfers.click();}
    public void clickOnUpdatesOfOurPrivacyPolicy(){updatesOfPrivacyPolicy.click();}
    public void clickOnContactUs(){contactUs.click();}
}