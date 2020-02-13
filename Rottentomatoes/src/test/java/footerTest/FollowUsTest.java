package footerTest;

import footer.FollowUs;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FollowUsTest extends RottentomatoHome {

    @Test(priority = 1)
    public void userCanFollowOnFacebook() throws InterruptedException {
        FollowUs flwUs = PageFactory.initElements(driver,FollowUs.class);
        flwUs.followByFacebook();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void inputEmailOrPhone() throws InterruptedException {
        FollowUs flwUs = PageFactory.initElements(driver,FollowUs.class);
        flwUs.followByFacebook();
        flwUs.signIn("rajib177@yahoo.com", "simple177");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void inputPassword() throws InterruptedException {
        FollowUs flwUs = PageFactory.initElements(driver,FollowUs.class);
        flwUs.followByFacebook();
        flwUs.signIn("rajib177@yahoo.com", "simple177");
    }
    @Test(priority = 4)
    public void userCanFollowOnTwitter() throws InterruptedException {
        FollowUs followUs = PageFactory.initElements(driver,FollowUs.class);
        followUs.followByTwitter();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void userCanFollowOnPinterest() throws InterruptedException {
        FollowUs followUs = PageFactory.initElements(driver,FollowUs.class);
        followUs.followByPinterest();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void userCanFollowOnStumbleUpon() throws InterruptedException {
        FollowUs followUs = PageFactory.initElements(driver,FollowUs.class);
        followUs.followByStumbleUpon();
        Thread.sleep(2000);

    }

}