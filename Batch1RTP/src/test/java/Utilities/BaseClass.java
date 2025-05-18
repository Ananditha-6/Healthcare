package Utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BaseClass {
	
	static String browserName;
	public static WebDriver driver;
	public static WebDriver initializeDriver() 
	{
		try 
		{
			browserName=FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		if(browserName.equalsIgnoreCase("chrome"))
		{	
			
			driver=new ChromeDriver();
			try 
			{
				driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			}catch(IOException e) 
			{
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try 
			{
				driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));;
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try 
			{
				driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			}catch(IOException e) 
			{
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		return driver;
		
	}
	public static void addExplicitWait(By locator)
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void addImplicitWait() 
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void scrollDown() 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
	}
	public static String getPageTitle() 
	{
		String title=driver.getTitle();
		return title;
	}
	public void addHardcodeWait() throws InterruptedException
	{
		Thread.sleep(30000);
	}
	
	public static void windowHandle(WebDriver driver) {
		 Set<String> windowHandles = driver.getWindowHandles();
		    Iterator<String> iterator = windowHandles.iterator();

		    String parentWindow = iterator.next();
		    String childWindow = iterator.next();  

		    // Switch to child window
		    driver.switchTo().window(childWindow);
	}
	public static void closeBrowser() {
		driver.quit();
		
	}
}
