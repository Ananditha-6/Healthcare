package Stepdefinition2;




import java.awt.AWTException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import PageClasses.AccountDetails;
import PageClasses.ContactUs;
import PageClasses.ForgotPassword;
import PageClasses.LoginPage;
import PageClasses.signUpPage;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition2 extends BaseClass {
	WebDriver driver;
	signUpPage signup;
	LoginPage login;
	ForgotPassword fp;
	ContactUs contact;
	//AccountDetails ac;
	
	String actualmsg="Thank you! Your data has been submitted.";

	@Before  //before hook
	public void initilizeSetup() {
	driver = BaseClass.initializeDriver();
	signup = new signUpPage(driver);
	login=new LoginPage(driver);
	fp=new ForgotPassword(driver);
	contact=new ContactUs(driver);
	//ac=new AccountDetails(driver);
	}
	
	@Given("user open the url of banking application")
	public void user_open_the_url_of_banking_application() {
	   System.out.println("application Launched");
	   System.out.println(getPageTitle());
	   String x=getPageTitle();
	   Assert.assertEquals(x,"Home");
	}
	
	//Signup Scenario
	
	
	@Given("user clicks on the signup button in webpage")
	public void user_clicks_on_the_signup_button_in_webpage() {
		signup.clicksSignUp();
	}
	

	@Given("user enters the firstname as {string}")
	public void user_enters_the_firstname_as(String firstname) {
		 signup.enterFirstname(firstname);
	}
;
	@Given("user enters the lasttname as {string}")
	public void user_enters_the_lasttname_as(String lastname) {
	    
		signup.enterLastname(lastname);
	}

	@Given("user enters the phonenumber as {string}")
	public void user_enters_the_phonenumber_as(String phone) {
	  
		signup.enterPhone(phone);
	}

	@Given("user enters the dateofbirth as {string}")
	public void user_enters_the_dateofbirth_as(String DOB) {
	    signup.enterDOB(DOB);
	}

	@Given("user selects the gender")
	public void user_selects_the_gender() {
	   signup.selectGender(2);
	}

	@Given("user enters the cityname as {string}")
	public void user_enters_the_cityname_as(String city) {
	    signup.cityName(city);
	}
	

	@Given("user enters the userid as {string}")
	public void user_enters_the_userid_as(String uid) {
	    signup.userName(uid);
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	    signup.password(password);
	}


	@When("user clicks on submit button")
		public void user_clicks_on_submit_button() {
	    signup.submitButton();
	}

	@Then("validate that user is getting proper response from site")
	public void validate_that_user_is_getting_proper_response_from_site()throws InterruptedException {
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		 String msg=signup.validateMessage();
		 Assert.assertEquals(actualmsg, msg);
	}

	@Then("also verify that the title of the page is showing correct value")
	public void also_verify_that_the_title_of_the_page_is_showing_correct_value() {
		String y=getPageTitle();
		System.out.println(y);
	}
	
	
	//Loginscenario
	

	@Given("clicks on Log in button in Webpage")
	public void clicks_on_log_in_button_in_webpage() {
		login.clickLoginButtonWebPage();
	}

	@Given("user enters username as {string}")
	public void user_enters_username_as(String username) {
		login.enterusername(username);
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
		login.password(password);
	}

	@When("user click  on Login button")
	public void user_click_on_login_button() {
		login.loginButon();
	}

	@Then("user will get a success message from the website")
	public void user_will_get_a_success_message_from_the_website() throws InterruptedException{
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
	 String msg1=login.successMessage();
	 Assert.assertEquals(actualmsg, msg1);
	}
    //
	//Forgot Password

	@Given("clicks on Forget Password button in Webpage")
	public void clicks_on_forget_password_button_in_webpage()
	{
		fp.forgotpasswordButtoninWebpage();
	}

	@Given("user enters email in Forget Password page as {string}")
	public void user_enters_email_in_forget_password_page_as(String fp_email) 
	{
		fp.enterEmail(fp_email);
	}

	@Given("user enters phone number in Forget Password page as {string}")
	public void user_enters_phone_number_in_forget_password_page_as(String fp_phone)
	{
		fp.enterPhone(fp_phone);
	}

	@When("user click  on forget password button")
	public void user_click_on_forget_password_button() 
	{
		fp.resetButton();
	}

	@Then("user will get a success message in Forget Password page")
	public void user_will_get_a_success_message_in_forget_password_page()throws InterruptedException
	{
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		 String msg2=fp.verifySuccessmessage();
		 Assert.assertEquals(actualmsg, msg2);
	}
	
	//
	//ContactUs
	
	@Given("user clicks on ContactUs button in WebPage")
	public void user_clicks_on_contact_us_button_in_web_page() 
	{
	    contact.ContactUsButtoninWebPage();
	}

	@Given("user enters name as {string}")
	public void user_enters_name_as(String contact_name)
	{
	    contact.name(contact_name);
	}

	@Given("user enters email as {string}")
	public void user_enters_email_as(String contact_email) 
	{
	    contact.email(contact_email);
	}

	@Given("user enters phone as {string}")
	public void user_enters_phone_as(String contact_phone) 
	{
	    contact.phone(contact_phone);
	}

	@Given("user enters address as {string}")
	public void user_enters_address_as(String contact_address) 
	{
	    contact.adress(contact_address);
	}

	@Given("user enters country as {string}")
	public void user_enters_country_as(String contact_country) 
	{
	    contact.country(contact_country);
	}

	@Given("user enters pincode as {string}")
	public void user_enters_pincode_as(String contact_pin)
	{
	    contact.zipcode(contact_pin);
	}

	@When("user clicks on Submit button in ContactUs page")
	public void user_clicks_on_submit_button_in_contact_us_page() 
	{
	    contact.clickSubmitButton();
	}

	@Then("user will get a success message in ContactUs page")
	public void user_will_get_a_success_message_in_contact_us_page()throws InterruptedException 
	{
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		 String msg2=contact.successMessage();
		 Assert.assertEquals(actualmsg, msg2);
	}
	
	
	//
	/*//Account Details
	@Given("user clicks on Account Details button in WebPage")
	public void user_clicks_on_account_details_button_in_web_page() throws InterruptedException {
	    ac.clicksonAccountdetailsButton();
	    windowHandle(driver);
	    addHardcodeWait();
	    System.out.println(driver.getCurrentUrl());
	}

	@Given("select and customer from the dropdown")
	public void select_and_customer_from_the_dropdown() throws AWTException {
		ac.selectname();
	    
	}

	@Given("Click on Login")
	public void click_on_login() throws InterruptedException {
		ac.loginButton();
		//addExplicitWait(By.xpath("//button[@aria-label='Login']"));
		addHardcodeWait();
	    //ac.clickOnLoginButton();
	}

	@Given("click on deposit tab")
	public void click_on_deposit_tab() {
		ac.depositTab();	
		
	}

	@Given("enter the amount to be deposited as {string}")
	public void enter_the_amount_to_be_deposited_as(String d_amount) {
	    ac.enterDepositAmount(d_amount);
	    
		
	    
	}

	@When("click on Deposit button")
	public void click_on_deposit_button() {
	    ac.clickonDepositButton();
		
	}

	@Then("balance is updated")
	public void balance_is_updated() {
	    ac.balanceUpated();
		
	}

	@Then("click on withdrawl tab")
	public void click_on_withdrawl_tab() {
	    ac.clickWithdrawTab();
		
	}

	@Then("enter amount to be withdrawn as {string}")
	public void enter_amount_to_be_withdrawn_as(String w_amount) {
	   ac.enterWithdrawAmount(w_amount);
		
	}

	@When("click on withdraw button")
	public void click_on_withdraw_button() {
	    ac.clickWithdrawButton();
		
	}

	@Then("balance will be updated")
	public void balance_will_be_updated() {
	   ac.balanceUpated();
	}
	*/
	
	@After //after hook
	public void tearDown() throws InterruptedException {
		addHardcodeWait();
		driver.close();
	}
		
}
