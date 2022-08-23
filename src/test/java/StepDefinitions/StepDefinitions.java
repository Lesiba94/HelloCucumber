package StepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinitions {
    @Given("Login Page is open")
    public void login_page_is_open() {
        System.out.println("Given");
    }
    @When("User enter valid username and password")
    public void user_enter_valid_username_and_password() {
        System.out.println("When");
    }
    @And("User click submit button")
    public void user_click_submit_button() {
        System.out.println("And");
    }
    @Then("Login page is successfully open")
    public void login_page_is_successfully_open() {
        System.out.println("Then");
    }
}
