package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "password-confirmation")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement createAccountButton;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserDetails(String fName, String lName, String emailId, String pwd, String confirmPwd) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        email.sendKeys(emailId);
        password.sendKeys(pwd);
        confirmPassword.sendKeys(confirmPwd);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}
