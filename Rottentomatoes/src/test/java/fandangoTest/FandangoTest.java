package fandangoTest;

import fandango.Fandango;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FandangoTest extends RottentomatoHome {

    @Test
    public void userGoToFandangoPage() {
        Fandango fndngPg = PageFactory.initElements(driver,Fandango.class);
        fndngPg.fandangoPage();
    }
    @Test
    public void nowPlayingBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver,Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void comingSoonBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver,Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void movieGenresBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver,Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void topBoxOfficeBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver,Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void atHomeBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver,Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void actionBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void dramaBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        Thread.sleep(2000);
    }
    @Test(priority = 9)
    public void comedyBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        Thread.sleep(2000);
    }
    @Test(priority = 10)
    public void kidsBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        fndngPg.clickKids();
        Thread.sleep(2000);
    }
    @Test(priority = 11)
    public void horrorBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        fndngPg.clickKids();
        fndngPg.clickHorror();
        Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void romanceBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        fndngPg.clickKids();
        fndngPg.clickHorror();
        fndngPg.clickRomance();
        Thread.sleep(2000);
    }
    @Test(priority = 13)
    public void sciFiBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        fndngPg.clickKids();
        fndngPg.clickHorror();
        fndngPg.clickRomance();
        fndngPg.clickSciFi();
        Thread.sleep(2000);
    }
    @Test(priority = 14)
    public void animatedBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        fndngPg.clickKids();
        fndngPg.clickHorror();
        fndngPg.clickRomance();
        fndngPg.clickSciFi();
        fndngPg.clickAnimated();
        Thread.sleep(2000);
    }
    @Test(priority = 15)
    public void moreBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        fndngPg.clickKids();
        fndngPg.clickHorror();
        fndngPg.clickRomance();
        fndngPg.clickSciFi();
        fndngPg.clickAnimated();
        fndngPg.clickMore();
        Thread.sleep(2000);
    }
    @Test(priority = 16)
    public void imaxBtn() throws InterruptedException {
        Fandango fndngPg = PageFactory.initElements(driver, Fandango.class);
        fndngPg.fandangoPage();
        fndngPg.clickNowPlaying();
        fndngPg.clickComingSoon();
        fndngPg.ClickMovieGenres();
        fndngPg.clickTopBoxOffice();
        fndngPg.clickAtHome();
        fndngPg.clickAction();
        fndngPg.clickDrama();
        fndngPg.clickComedy();
        fndngPg.clickKids();
        fndngPg.clickHorror();
        fndngPg.clickRomance();
        fndngPg.clickSciFi();
        fndngPg.clickAnimated();
        fndngPg.clickMore();
        fndngPg.clickImax();
        Thread.sleep(2000);
    }

}