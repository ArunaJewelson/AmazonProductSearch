package com.POM;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.BaseClass.BaseClass;
	import java.util.List;

	public class PhonePage extends BaseClass 
	{
		public PhonePage() 
		{
	        PageFactory.initElements(driver, this);
	    }
		
		@FindBy(xpath="//a[text()='SIM-Free']")
		private WebElement simFreeLink;
		
		@FindBy(xpath="//span[text()='Samsung']")
		private WebElement cboxSamsungBrand;

		//		@FindBy(xpath="(//span[text()='20 MP & above'])[1]")
		@FindBy(xpath="//span[text()='20 MP & above']")
		private WebElement cboxCameraResolution;
		
		@FindBy(xpath="//span[text()='2023']")
		private WebElement cboxModelYear;

		@FindBy(xpath="//span[text()='£195']")
		private WebElement priceRange;
		
		
		@FindBy(id="priceRefinements")
		private WebElement priceSpan;
		
		@FindBy(xpath="//input[@type='submit' and @aria-label='Go - Submit price range']")
		private WebElement goElement;
		
		
		public WebElement getGoElement() {
			return goElement;
		}

		public void setGoElement(WebElement goElement) {
			this.goElement = goElement;
		}

		public WebElement getPriceSpan() {
			return priceSpan;
		}

		public void setPriceSpan(WebElement priceSpan) {
			this.priceSpan = priceSpan;
		}


		public WebElement getSimFreeLink() {
			return simFreeLink;
		}

		public void setSimFreeLink(WebElement simFreeLink) {
			this.simFreeLink = simFreeLink;
		}

		public WebElement getCboxSamsungBrand() {
			return cboxSamsungBrand;
		}

		public void setCboxSamsungBrand(WebElement cboxSamsungBrand) {
			this.cboxSamsungBrand = cboxSamsungBrand;
		}

		public WebElement getCboxCameraResolution() {
			return cboxCameraResolution;
		}

		public void setCboxCameraResolution(WebElement cboxCameraResolution) {
			this.cboxCameraResolution = cboxCameraResolution;
		}

		public WebElement getCboxModelYear() {
			return cboxModelYear;
		}

		public void setCboxModelYear(WebElement cboxModelYear) {
			this.cboxModelYear = cboxModelYear;
		}

		public WebElement getPriceRange() {
			return priceRange;
		}

		public void setPriceRange(WebElement priceRange) {
			this.priceRange = priceRange;
		}


}
