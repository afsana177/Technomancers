package tagCloudTest;

import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import tagCloud.TagCloud;

public class TagCloudTest  extends RottentomatoHome {

    @Test(priority = 1)
    public void clickToGoForTagCld() throws InterruptedException {
        TagCloud tgCld = PageFactory.initElements(driver,TagCloud.class);
        tgCld.clickToFindTheTagCloud();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void goAndClickString() throws InterruptedException {
        TagCloud tgCld = PageFactory.initElements(driver,TagCloud.class);
        tgCld.clickToFindTheTagCloud();
        tgCld.clickOnStreamingBtn();
        Thread.sleep(2000);
    }
}