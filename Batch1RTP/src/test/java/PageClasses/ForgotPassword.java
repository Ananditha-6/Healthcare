package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

		WebDriver driver;
		public  ForgotPassword(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath="//a[@class='t-menu__link-item'][@href='/forget-password']")
	WebElement fpButton;
	
	@FindBy(xpath="//input[@id='input_7539084004150']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input_7539084004151']")
	WebElement phoneno;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement resetButton;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textmessage;
	
	public void forgotpasswordButtoninWebpage()
	{
		fpButton.click();
	}
	public void enterEmail(String emailid) 
	{
		email.sendKeys(emailid);
	}
	
	public void enterPhone(String pno)
	{
		phoneno.sendKeys(pno);
	}
	
	public void resetButton()
	{
		resetButton.click();
	}
		
	public String verifySuccessmessage()
	{
		String msg=textmessage.getText();
		return msg;
	}
		
		
		
}
