package StepDefs;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps extends BaseClass {
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        initializeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        loginPage = new LoginPage(driver);
    }

    @When("the user enters valid credentials")
    public void userEntersCredentials(io.cucumber.datatable.DataTable dataTable) {
        java.util.List<java.util.Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String email = data.get(0).get("Email");
        String password = data.get(0).get("Password");
        loginPage.enterCredentials(email, password);
    }

    @And("clicks on the {string} button")
    public void clicksOnSignInButton(String buttonName) {
        loginPage.clickLoginButton();
    }

    @Then("the user should be logged in successfully")
    public void userLoggedInSuccessfully() {
        // Add assertions to validate successful login (e.g., verifying user dashboard or a welcome message)
    }
}
