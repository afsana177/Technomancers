package fandango;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FandanGoFooter  extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Link to Us')]") WebElement linkToUs;
    @FindBy(xpath = "//a[contains(text(),'Fandango Rewards')]") WebElement fandangoRewards;
    @FindBy(xpath = "//a[contains(text(),'Site Index')]") WebElement siteIndex;
    @FindBy(xpath = "//a[contains(text(),'FandangoNOW')]") WebElement fandangoNow;
    @FindBy(xpath = "//a[contains(text(),'Movieclips')]") WebElement movieClips;
    @FindBy(xpath = "//a[contains(text(),'Movies.com')]") WebElement moviesCom;
    @FindBy(xpath = "//a[@class='footer-site-info__link'][contains(text(),'Flixster.com')]") WebElement flixterCom;
    @FindBy(xpath = "//a[contains(text(),'MovieTickets.com')]") WebElement movieTicketsCom;
    @FindBy(xpath = "//a[contains(text(),'Fandango Latin America')]") WebElement fandangoLatinAmerica;
    @FindBy(xpath = "//a[contains(text(),'Ingresso')]") WebElement ingresso;

    public void clickLinkToUs(){
        linkToUs.click();
    }
    public void clickOnFandangoRewards(){
        fandangoRewards.click();
    }
    public void clickSiteIndex(){
        siteIndex.click();
    }
    public void clickFandangoNow(){
        fandangoNow.click();
    }
    public void clickMovieClips(){
        movieClips.click();
    }
    public void clickMoviesCom(){
        moviesCom.click();
    }
    public void clickFlixterCom(){
        flixterCom.click();
    }
    public void clickMovieTicketsCom(){
        movieTicketsCom.click();
    }
    public void clickFandangoLatinAmerica(){
        fandangoLatinAmerica.click();
    }
    public void clickIngresso(){ ingresso.click(); }
}