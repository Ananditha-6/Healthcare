package PageClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

/*public class AccountDetails {

	WebDriver driver;
	public AccountDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='t-menu__link-item'][@data-menu-item-number='7']")
	WebElement accountdetails;
	@FindBy(xpath="//select[@id='collection_comp-m8swuunx']")
	WebElement selectname;
	
	@FindBy(xpath="//button[@aria-label='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(), 'Deposit')]")
	WebElement deposit;
	
	@FindBy(xpath="//input[@id='input_comp-m8t00o79']")
	WebElement amountdeposit;
	
	@FindBy(xpath="//button[@aria-label='Deposit']")
	WebElement depositbutton;
	
	@FindBy(xpath="//div[@id='comp-m8szvumq']//p")
	WebElement balanceamt;
	
	@FindBy(xpath="//span[contains(text(), ' Withdrawl')]")
	WebElement withdraw;
	
	@FindBy(xpath="//input[@id='input_comp-m8t03jwk']")
	WebElement amtwithdraw;
	
	@FindBy(xpath="//div[@id='comp-m8t03jwx']//button")
	WebElement withdrawButton;
		
	public void clicksonAccountdetailsButton()
	{
		accountdetails.click();
	}
	
	public void selectname() throws AWTException
	{	
	Robot sw = new Robot();
	sw.keyPress(KeyEvent.VK_DOWN);
	sw.keyPress(KeyEvent.VK_ENTER);
	 sw.delay(100);
	selectname.click();
	 sw.delay(100);
	sw.keyPress(KeyEvent.VK_DOWN);
	sw.keyPress(KeyEvent.VK_DOWN);
	sw.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public void loginButton() 
	{
		loginButton.click();
	}
	
	public void depositTab() {
		deposit.click();
	}
	
	public void enterDepositAmount(String amount)
	{
		amountdeposit.sendKeys(amount);
	}
	
	public void clickonDepositButton()
	{
		depositbutton.click();
	}
	
	public String balanceUpated()
	{
		String txtbalance=balanceamt.getText();
		return txtbalance;
	}
	
	public void clickWithdrawTab()
	{
		withdraw.click();
	}
	
	public void enterWithdrawAmount(String wamount)
	{
		amtwithdraw.sendKeys(wamount);
	}
	
	public void clickWithdrawButton()
	{
		withdrawButton.click();
	}
}*/


