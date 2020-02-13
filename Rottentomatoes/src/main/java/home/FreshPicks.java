package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreshPicks extends CommonAPI {

    @FindBy(xpath = "//div[@class='panel-rt cfpModule']//div[1]//a[1]//div[1]//img[1]") WebElement certifiedFreshPicks;
    @FindBy(xpath = "//div[@class='col-sm-18 freshPicks']//div[2]//a[1]//div[1]//img[1]") WebElement badBoysForLifeMv;
    @FindBy(xpath = "//div[@class='panel-rt cfpModule']//div[3]//a[1]//div[1]//img[1]") WebElement parasite;
    @FindBy(xpath = "//div[@id='main_container']//div[4]//a[1]//div[1]//img[1]") WebElement starTrek;
    @FindBy(xpath = "//div[@class='col-sm-18 freshPicks']//div[@class='cfpItem hidden-xs']//img[@class='js-lazyLoad cfp-header-img']") WebElement cheerSeason1;
    @FindBy(xpath = "//div[@class='cert-fresh']//a[@class='unstyled articleLink'][contains(text(),'View All')]") WebElement viewAll;

    public void infoAbtNewMvs(){
        certifiedFreshPicks.click();
    }
    public void infoAboutBadBoysForLife(){
        badBoysForLifeMv.click();
    }
    public void infoAboutParasite(){
        parasite.click();
    }
    public void infoAboutStarTrek(){
        starTrek.click();
    }
    public void infoAboutCheer(){
        cheerSeason1.click();
    }
    public void hitViewAllBtn(){
        viewAll.click();
    }
}