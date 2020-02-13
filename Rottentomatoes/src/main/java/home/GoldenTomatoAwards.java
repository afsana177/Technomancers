package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoldenTomatoAwards extends CommonAPI {

    @FindBy(xpath = "//body[contains(@class,'body no-touch')]/div[contains(@class,'body_main container')]/div[@id='main_container']/section[contains(@class,'home-body')]/section[@id='newsAndFeatures']/div[contains(@class,'panel-body content_body')]/div[contains(@class,'media-body')]/div[contains(@class,'panel-body')]/div/div[contains(@class,'')]/div[2]/a[1]/div[1]") WebElement goldenTomatoAwards;

    public void clickGoldenTomatoAwards(){
        goldenTomatoAwards.click();
    }
}