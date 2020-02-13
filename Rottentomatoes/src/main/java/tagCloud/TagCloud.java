package tagCloud;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagCloud extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Awards Leaderboard')]") WebElement toGetTagCloud;
    @FindBy(xpath = "//a[@class='tag-link-67995 tag-link-position-5']") WebElement goToStreaming;


    public void clickToFindTheTagCloud(){
        toGetTagCloud.click();
    }
    public void clickOnStreamingBtn(){
        goToStreaming.click();
    }
}