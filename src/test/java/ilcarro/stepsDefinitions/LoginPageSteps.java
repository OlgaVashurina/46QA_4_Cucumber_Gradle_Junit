package ilcarro.stepsDefinitions;

import ilcarro.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static ilcarro.core.BasePage.driver;

public class LoginPageSteps {

    @And("Пользователь вводит валидные данные")
    public void userEntersValidCredentials() {
        new LoginPage(driver).enterCredentials("test_qa@gmail.com", "Password@1");
    }

    @And("Пользователь нажимает на кнопку Yalla")
    public void userClickedOnYallaButton() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("Пользователь проверяет отображение сообщения об успешном логине")
    public void userVerifiesSuccessfulLoginMessage() {
        new LoginPage(driver).verifyTextMessage("Logged in success");
    }

    @Then("Пользователь проверяет отображение сообщения об неуспешном логине")
    public void userCheckErrorMessage() {
        new LoginPage(driver).verifyTextMessage("\"Login or Password incorrect\"");
    }

    @And("Пользователь вводит валидный email и невалидный password")
    //import io.cucumber.datatable.DataTable;
    public void userEntersValidEmailInvalidPassword(DataTable table) {
        new LoginPage(driver).enterCredentials(table);
    }
}
