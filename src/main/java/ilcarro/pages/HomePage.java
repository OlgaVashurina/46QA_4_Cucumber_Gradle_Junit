package ilcarro.pages;

import ilcarro.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
        driver.get("https://ilcarro.web.app");
    }

    @FindBy(xpath = "//h1[contains(text(),'Find your car now!')]")
    WebElement homePageTitle;

    public boolean isHomePageTitlePresent() {
        return isElementPresent(homePageTitle);
    }

    public void quitBrowser() {
        driver.quit();
    }

    @FindBy(xpath = "//a[.=' Log in ']")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }
}
