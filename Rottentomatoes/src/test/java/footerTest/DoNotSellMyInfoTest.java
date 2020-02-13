package footerTest;

import footer.DoNotSellMyInfo;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DoNotSellMyInfoTest extends RottentomatoHome {

    @Test
    public void doNotSellMyInfoBtn() throws InterruptedException {
        DoNotSellMyInfo dontSellInfo= PageFactory.initElements(driver,DoNotSellMyInfo.class);
        dontSellInfo.clickDoNotSellMyInfo();
        Thread.sleep(2000);
    }
}
