package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoNotSellMyInfo extends CommonAPI {

    @FindBy(xpath = "//a[@class='footer-legal__link'][contains(text(),'Do Not Sell My Info')]") WebElement doNotSellMyInfo;

    public void clickDoNotSellMyInfo(){
        doNotSellMyInfo.click();
    }
}