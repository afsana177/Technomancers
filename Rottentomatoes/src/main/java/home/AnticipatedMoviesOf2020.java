package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnticipatedMoviesOf2020 extends CommonAPI {

    @FindBy(css = "body.body.no-touch div.body_main.container:nth-child(12) div.container:nth-child(7) section.home-body section.panel.panel-rt.panel-box:nth-child(6) div.panel-body.content_body div.media-body div.panel-body:nth-child(1) div:nth-child(1) div.news-article-wrap div.news-article:nth-child(3) a:nth-child(1) > div.news-article-image.js-lazyLoad") WebElement mostAnticipatingMovies;

    public void anticipatedMoviesOf2020(){
        mostAnticipatingMovies.click();
    }
}