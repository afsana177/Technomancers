package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicy extends CommonAPI {

    @FindBy(xpath = "//a[@id='footer-privacy']")
    WebElement privacyPolicy;
    @FindBy(xpath = "//span[@class='page-nav-item']//a[contains(text(),'Terms and Policies')]")
    WebElement termsAndPolicies;
    @FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
    WebElement termsOfUse;
    @FindBy(xpath = "//a[contains(text(),'Ticket Policy')]")
    WebElement ticketPolicy;
    @FindBy(xpath = "//a[contains(text(),'Promo Code Policy')]")
    WebElement promoCodePolicy;
    @FindBy(xpath = "//a[contains(text(),'Gift Card Terms')]")
    WebElement giftCardTerms;
    @FindBy(xpath = "//a[contains(text(),'Cookies and Tracking')]")
    WebElement cookiesAndTracking;
    @FindBy(xpath = "//a[contains(text(),'FandangoNOW Policy')]")
    WebElement fandangnowPolicy;
    @FindBy(xpath = "//a[contains(text(),'VIP+ Program Terms')]")
    WebElement vip_programTerms;


    public void clickOnPrivacyPolicy(){
        privacyPolicy.click();
    }
    public void clickOnTermsAndPolicies(){
        termsAndPolicies.click();
    }
    public void clickOnTermsOfUse(){
        termsOfUse.click();
    }
    public void clickOnTicketPolicy(){
        ticketPolicy.click();
    }
    public void clickOnPromoCodePolicy(){
        promoCodePolicy.click();
    }
    public void clickOnGiftCardTerms(){
        giftCardTerms.click();
    }
    public void clickOnCookiesAndTracking(){
        cookiesAndTracking.click();
    }
    public void clickOnFandangnowPolicy(){
        fandangnowPolicy.click();
    }
    public void clickOnVip_programTerms(){
        vip_programTerms.click();
    }

}
