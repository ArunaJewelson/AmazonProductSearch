package com.BaseClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass 
{
		public static WebDriver driver;
		
		public void launchbrowser() 
		{
			 driver= new ChromeDriver();
		}
		public void launchurl(String url) 
		{
			driver.get(url);
		}
		public void maximizewindows()
		{
			driver.manage().window().maximize();
		}
		
		public WebDriverWait CreateExpWait(int duration)
		{

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
	        return wait;
		}
		
		public WebElement makeWebelementLoad(int duration, WebElement webElement)
		{

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
	        wait.until(ExpectedConditions.elementToBeClickable(webElement));
	        return webElement;
		}
		
		public void scrollDown(WebElement element) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		public void btnClick(WebElement element) 
		{
			element.click();
		}
		
		public WebElement getElementWithCssSel(WebElement webElement, String cssSelecctor)
		{
			WebElement priceRangeElement = webElement.findElement(By.cssSelector(cssSelecctor));
			return priceRangeElement;
		}
		
		public List<WebElement> getElementListbyTagName(WebElement webElement, String labelName)
		{
			List<WebElement> labels = webElement.findElements(By.tagName(labelName));
			return labels;
		}
		public int getClearCurrency(String price)
		{
			String str = price;
			str = str.replace("£", "").replace("+", "").replace(",", ""); // remove both £ and + characters
			int num = Integer.parseInt(str);
			return num;
		}
	}


