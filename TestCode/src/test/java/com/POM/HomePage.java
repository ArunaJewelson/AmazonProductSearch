package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class HomePage extends BaseClass
{
	
	@FindBy(id="nav-hamburger-menu")
	private WebElement sideMenuAll;	

	@FindBy(xpath ="//div[text() = 'Electronics & Computers']")
	private WebElement electronicsAndComputerLink;
	
	@FindBy(xpath ="(//a[text()='Phones & Accessories'])[2]")
	private WebElement phoneAndAccessoriesLink;
	
	@FindBy(id="sp-cc-accept")
	private WebElement btnAccept;

	public WebElement getBtnAccept() {
		return btnAccept;
	}

	public void setBtnAccept(WebElement btnAccept) {
		this.btnAccept = btnAccept;
	}
	
	public WebElement getSideMenuAll() {
		return sideMenuAll;
	}

	public void setSideMenuAll(WebElement sideMenuAll) {
		this.sideMenuAll = sideMenuAll;
	}

	public HomePage() {
        PageFactory.initElements(driver, this);
    }

	public WebElement getElectronicsAndComputerLink() {
		return electronicsAndComputerLink;
	}

	public void setElectronicsAndComputerLink(WebElement electronicsAndComputerLink) {
		this.electronicsAndComputerLink = electronicsAndComputerLink;
	}
	
	public WebElement getPhoneAndAccessoriesLink() {
		return phoneAndAccessoriesLink;
	}

	public void setPhoneAndAccessoriesLink(WebElement phoneAndAccessoriesLink) {
		this.phoneAndAccessoriesLink = phoneAndAccessoriesLink;
	}

	

}
	
