package ilcarro.pages;

import ilcarro.core.BasePage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    public LoginPage enterCredentials(String email, String password) {
        type(emailInput, email);
        type(passwordInput, password);
        return this;
    }

    public LoginPage enterCredentials(DataTable table) {
        // Преобразуем таблицу данных в список карт, каждая карта содержит email и password
        // import io.cucumber.datatable.DataTable;
        List<Map<String, String>> dataTable = table.asMaps();

        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        // Заполняем форму
        enterCredentials(email, password);
        return this;
    }

    @FindBy(xpath = "//button[.='Y’alla!']")
    WebElement yallaButton;

    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(className = "message")
    WebElement message;

    public LoginPage verifyTextMessage(String text) {
        shouldHaveText(message, text, 5000);
        return this;
    }
}
