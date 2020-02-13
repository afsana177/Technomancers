package header;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MostAnticipatedMvsOf2020 extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),\"2020's Most Anticipated Movies\")]") WebElement mostAnticipatedMovies;

    public void listOfMostAnticipatedMvsOf2020(){
        mostAnticipatedMovies.click();
    }
}