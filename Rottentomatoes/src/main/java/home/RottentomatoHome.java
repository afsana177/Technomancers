package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RottentomatoHome extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//div[@class='FullscreenSearch FullscreenSearch--desktop']") WebElement goToRottenTomatoPage;
    @FindBy(css = "body.body.no-touch div.body_main.container:nth-child(12) div.container:nth-child(7) section.home-body section.panel-rt.row:nth-child(3) div.col-sm-17 div.row div.col-sm-12.leftColumn.col-full-xs:nth-child(1) div.listings:nth-child(1) > a.pull-right.showtimesLink:nth-child(1)") WebElement mvsOpeningThisWkGettickets;

    public void userGoToRottenTomatoPage(){
        goToRottenTomatoPage.click();
    }
    public void ticketsInfo(){
        mvsOpeningThisWkGettickets.click();
    }
}