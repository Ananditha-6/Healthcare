package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[1]/div[1]//div/div[3]/nav/ul/li[1]/a")
	WebElement loginbutton;
	
	@FindBy(xpath="//input[@id='input_1495646567135']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='input_1742715919526']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	
	WebElement textmessage;
	
	public void clickLoginButtonWebPage()
	{
		loginbutton.click();
	}
	public void enterusername(String userName)
	{
		username.sendKeys(userName);
	}
	public void password(String password1)
	{
		password.sendKeys(password1);	
	}
	public void loginButon()
	{
		login.click();
	}
	public String successMessage()
	{
		String msg=textmessage.getText();
		return msg;
	}
}
