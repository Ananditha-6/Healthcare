package pageClasses;

import org.openqa.selenium.By;

public class RecordPatientDetailsPage {
	
	
	
	
	public static By clickPatName()
	{		
	return	By.xpath("//a[@href='/openmrs/spa/patient/228db60f-acc0-463f-900b-c3e7b0a394dc/chart']");
	}
	
	public static By recordVitals()
	{
		return	By.xpath("//*[text()='Record vitals']");
	}
	
	public static By temprature()
	{
		return	By.xpath("//input[@name='Temperature']");
	}
	
	public static By systolic()
	{
		return	By.xpath("//input[@name='systolic']");
	}
	
	public static By diastolic()
	{
		return	By.xpath("//input[@name='diastolic']");
	}
	
	public static By heartRate()
	{
		return	By.xpath("//input[@name='Pulse']");
	}
	
	
	public static By submitDetails()
	{
		return	By.xpath("//button[@type='submit']");
	}

}
