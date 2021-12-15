package uk.co.library.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearch {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().setAcceptCookies();
    }

    @When("^I enter jobTitle \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle)  {
        new HomePage().enterJobTitle(jobTitle);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) throws InterruptedException {
        new HomePage().selectDistance(distance);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I click on more search options link$")
    public void iClickOnMoreSearchOptionsLink() throws InterruptedException {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String salaryMin)  {
        new HomePage().enterMinSalary(salaryMin);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String salaryMax)  {
        new HomePage().enterMaxSalary(salaryMax);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)  {
        new HomePage().selectSalaryType(salaryType);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
        new HomePage().selectJobType(jobType);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I click on findJob button$")
    public void iClickOnFindJobButton() {

        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I should see the \"([^\"]*)\"$")
    public void iShouldSeeThe(String result)  {
        String actualMsg=new ResultPage().verifyTheResults();

        Assert.assertEquals("not correct message",result,actualMsg);


    }
}
