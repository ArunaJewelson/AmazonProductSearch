package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class AssertionPage extends BaseClass 

{
	public AssertionPage() 
	{
        PageFactory.initElements(driver, this);
        
    }
	
	@FindBy(xpath="//h1[text()='Phones & Accessories']")
	private WebElement phoneAccessoriesTitle;
	
	@FindBy(xpath="(//span[text()='SIM-Free & Unlocked Mobile Phones'])[2]")
	private WebElement simFreePhoneTitle;

	@FindBy(xpath="//span[text()='Samsung SM-A546B Galaxy A54 Dual SIM 5G 8GB RAM 128GB Awesome Lime EU']")
	private WebElement samsungPhoneList;

	@FindBy(xpath="//div[@data-index='3']//span[@class='a-price-whole']")
	private WebElement phonePrice;
	
	public WebElement getPhonePrice() {
		return phonePrice;
	}

	public void setPhonePrice(WebElement phonePrice) {
		this.phonePrice = phonePrice;
	}

	public WebElement getSamsungPhoneList() {
		return samsungPhoneList;
	}

	public void setSamsungPhoneList(WebElement samsungPhoneList) {
		this.samsungPhoneList = samsungPhoneList;
	}

	public WebElement getPhoneAccessoriesTitle() {
		return phoneAccessoriesTitle;
	}

	public void setPhoneAccessoriesTitle(WebElement phoneAccessoriesTitle) {
		this.phoneAccessoriesTitle = phoneAccessoriesTitle;
	}

	public WebElement getSimFreePhoneTitle() {
		return simFreePhoneTitle;
	}

	public void setSimFreePhoneTitle(WebElement simFreePhoneTitle) {
		this.simFreePhoneTitle = simFreePhoneTitle;
	}

}
