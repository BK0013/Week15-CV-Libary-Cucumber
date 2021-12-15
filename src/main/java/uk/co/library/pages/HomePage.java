package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy (id = "location")
    WebElement locationField;

    @CacheLookup
    @FindBy (id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy (id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy (id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy (id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy (id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy (id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy (id = "hp-search-btn")
    WebElement findJobsBtn;

   // @CacheLookup
    //@FindBy(xpath = "//button[@id='save']")
    //WebElement acceptCookies;

 @CacheLookup
 @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
WebElement acceptCookies;

    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;


    public void setAcceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }

/*  public void setAcceptCookies() {
      driver.switchTo().frame("gdpr-consent-notice");
       clickOnElement(acceptCookies);
   }
*/
    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobTitleField, jobTitle);
        log.info("Enter Job Title : '" + jobTitle + "' Job title field" + "<br>");
    }

    public void enterLocation(String location){
        sendTextToElement(locationField, location);
        log.info("Enter location : '" + location + "' location field" + "<br>");
    }

    public void selectDistance(String dis) throws InterruptedException {
        Thread.sleep(1000);

        selectByVisibleTextFromDropDown(distanceDropDown, dis);
        log.info("Select distance : '" + dis + "' distance field" + "<br>");
    }

    public void clickOnMoreSearchOption()throws InterruptedException{
        Thread.sleep(2000);
        clickOnElement(moreSearchOptionsLink);
        log.info("Click on 'More Search Option' Link" + "<br>");

    }

    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin, minSalary);
        log.info("Enter minimum salary : '" + salaryMin + "' Salary Min. field" + "<br>");
    }

    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax, maxSalary);
        log.info("Enter maximum salary : '" + salaryMax + "' Salary Max. field" + "<br>");
    }

    public void selectSalaryType(String salaryType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
        log.info("Select salary type : '" + salaryType + "' from dropdown" + "<br>");
    }

    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        log.info("Select distance : '" + jobType + "' distance field" + "<br>");
    }

    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
        log.info("More Search Options' link" + "<br>");
    }

}
