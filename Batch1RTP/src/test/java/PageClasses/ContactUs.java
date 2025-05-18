package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {

	WebDriver driver;
	public ContactUs(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='t-menu__link-item'][@href='/contact-us']")
	WebElement contactUs;
	
	@FindBy(xpath="//input[@id='input_1496238250184']")
	WebElement contactname;
	
	@FindBy(xpath="//input[@id='input_1496238230199']")
	WebElement contactemail;
	
	@FindBy(xpath="//input[@id='input_1496238259342']")
	WebElement contactphone;
	
	@FindBy(xpath="//input[@id='input_1742714856123']")
	WebElement contactad;
	
	@FindBy(xpath="//input[@id='input_1742714886366']")
	WebElement contactcountry;
	
	@FindBy(xpath="//input[@id='input_1742714901821']")
	WebElement contactzipcode;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textmessage;
	
	public void ContactUsButtoninWebPage()
	{
		contactUs.click();
	}
	
	public void name(String name)
	{
		contactname.sendKeys(name);
	}
	
	public void email(String email)
	{
		contactemail.sendKeys(email);
	}
	
	public void phone(String phone)
	{
		contactphone.sendKeys(phone);
	}
	
	public void adress(String adress)
	{
		contactad.sendKeys(adress);
	}
	
	public void country(String country)
	{
		contactcountry.sendKeys(country);
	}
	
	public void zipcode(String pincode)
	{
		contactzipcode.sendKeys(pincode);
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	
	public String successMessage()
	{
		String msg=textmessage.getText();
		return msg;
	}
}
