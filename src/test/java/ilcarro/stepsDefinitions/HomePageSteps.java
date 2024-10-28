package ilcarro.stepsDefinitions;

import ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;

import static ilcarro.core.BasePage.driver;

public class HomePageSteps {

    @Given("Пользователь запускает браузер")
    public void userLaunchesBrowser(){
        new HomePage(driver).launchBrowser();
    }

    @When("Пользователь открывает домашнюю страницу ilcarro")
    public void userOpensHomePageIlcarro() {
        new HomePage(driver).openHomePage();
    }

    @Then("Проверить, что заголовок домашней страницы отображается")
    public void verifyHomePageTitlePresent() {
        Assert.assertTrue(new HomePage(driver).isHomePageTitlePresent());
    }

    @And("Пользователь закрывает браузер")
    public void userCloseBrowser() {
        new HomePage(driver).quitBrowser();
    }

    @And("Пользователь нажимает на кнопку Login")
    public void UserCLickOnLoginLink() {
        new HomePage(driver).clickOnLoginLink();
    }
}
