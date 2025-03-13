package StepDefs;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.SignUpPage;

public class SignUpSteps extends BaseClass {
    SignUpPage signUpPage;

    @Given("the user is on the signup page")
    public void userIsOnSignupPage() {
        initializeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        signUpPage = new SignUpPage(driver);
    }

    @When("the user enters valid details")
    public void userEntersDetails(io.cucumber.datatable.DataTable dataTable) {
        java.util.List<java.util.Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String firstName = data.get(0).get("FirstName");
        String lastName = data.get(0).get("LastName");
        String email = data.get(0).get("Email");
        String password = data.get(0).get("Password");
        String confirmPassword = data.get(0).get("ConfirmPassword");
        signUpPage.enterUserDetails(firstName, lastName, email, password, confirmPassword);
    }

    @And("clicks on the {string} button")
    public void clicksOnCreateAccount(String buttonName) {
        signUpPage.clickCreateAccount();
    }

    @Then("the account should be created successfully")
    public void accountCreated() {
        // Add assertions for successful account creation
    }
}
