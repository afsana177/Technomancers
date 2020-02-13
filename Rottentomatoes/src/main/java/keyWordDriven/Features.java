package keyWordDriven;

import base.CommonAPI;
import footer.Careers;
import home.HomePage;
import home.SearchBar;
import home.SignUp;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features  extends CommonAPI {
    SignUp signUp = PageFactory.initElements(driver, SignUp.class);
    SearchBar searchBar = PageFactory.initElements(driver, SearchBar.class);
    Careers careers=PageFactory.initElements(driver,Careers.class);

    public void searchItems(WebDriver driver1) throws InterruptedException {
        searchBar.searchMovies("Frozen");
    }

    public void signUpOnAmazon(WebDriver driver1) throws InterruptedException {
        //sigUp.createAccount("John Doe", "myautotestmail2020@gmail.com", "test2055");
        signUp.signingUp();
    }

    public void findCareer(WebDriver driver1) throws InterruptedException {
        //signIn.signIn("myautotestmail2020@gmail.com", "test2055");
        careers.clickCareers();
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch (featureName) {
            case "search":
                searchItems(driver1);
                break;
            case "signUp":
                signUpOnAmazon(driver1);
                break;
            case "careers":
                findCareer(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }

    }

    public void selectFeatures(WebDriver driver) throws IOException, InterruptedException {
        KeyWordSearchPg searchItems = new KeyWordSearchPg();
        String[] testSteps = KeyWordSearchPg.getDataFromExcelFileForFeaturesChoice();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }
}

