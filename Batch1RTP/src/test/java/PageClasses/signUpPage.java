package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class signUpPage {
	
	WebDriver driver;
	public signUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"nav908377783\"]/div/div[2]/nav/ul/li[3]/a")
	WebElement signup;
	
	@FindBy(xpath="//input[@id='input_1495646567135']")
	WebElement fisrtname;
	
	@FindBy(xpath="//input[@id='input_1500473664921']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input_1495646533382']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='input_1742711839224']")
	WebElement dob;
	
	@FindBy(xpath="//select[@id='input_1742711863977']")
	WebElement selectGender;
	
	@FindBy(xpath="//input[@id='input_1742711965354']")
	WebElement cityname;
	
	@FindBy(xpath="//input[@id='input_1742711986078']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='input_1742712432708']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textmessage;
	
	public void clicksSignUp() 
	{
		signup.click();
		
	}
	
	public void enterFirstname(String firstName) 
	{
		fisrtname.sendKeys(firstName);	
	}
	
	public void enterLastname(String lastName) 
	{
		lastname.sendKeys(lastName);	
	}
	
	public void enterPhone(String phonenumber) 
	{
		phone.sendKeys(phonenumber);	
	}
	
	public void enterDOB(String  dateofbirth)
	{
		dob.sendKeys(dateofbirth);
	}
	
	public void selectGender(int x)
	{
		Select oselect =new Select(selectGender);
		oselect.selectByIndex(x);
	}
	
	public void cityName(String cityName) {
		cityname.sendKeys(cityName);
	}
	
	public void userName(String username)
	{
		userName.sendKeys(username);
	}
	
	public void password(String password1) 
	{
		password.sendKeys(password1);
	}
	
	public void submitButton()
	{
		submitButton.submit();
	}
	
	public String validateMessage()
	{
		String msg=textmessage.getText();
		return msg;
	}
}
