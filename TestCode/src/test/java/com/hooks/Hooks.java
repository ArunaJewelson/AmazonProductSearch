package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass

{
	public static org.openqa.selenium.remote.RemoteWebDriver driver;
	
		
	@After
	public void afterscenario(Scenario scenario)
	{
		driver = (RemoteWebDriver) BaseClass.driver;
		boolean failed = scenario.isFailed();
		System.out.println("is Failed? "+failed);
		
		if(failed)
		{
			byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png","Amazon.png");
		}
		
	}

}
