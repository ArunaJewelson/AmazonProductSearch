package com.StepDefinition;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.BaseClass;
import com.POM.HomePage;
import com.POM.PhonePage;
import com.POM.AssertionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class StepDefinition extends BaseClass
	{
		
		private static Logger log = LogManager.getLogger(StepDefinition.class);
		public static WebDriver driver;
		
		BaseClass base = new BaseClass();
		HomePage homepage = null;
		PhonePage phonepage = null;
		AssertionPage phoneVerification = null;
		
	
		@Given("User is on the Amazon homepage")
		public void user_is_on_the_amazon_homepage() 
		{
			//launching Amazon and maximise 
			base.launchbrowser();
			base.launchurl("https://www.Amazon.co.uk");
			base.maximizewindows();
			log.info("Scenario_1 Start: Amazon launched");
			
		}
		
		@When("User click on AllIcon") 
		public void user_clik_on_all_icon() 
		{
			//Cookies Accept
			homepage = new HomePage();
			WebElement btnAccept = homepage.getBtnAccept();
			btnAccept = base.makeWebelementLoad(10, btnAccept);
	        base.btnClick(btnAccept);
			log.info("User Accepting cookies");
			
	        //Selecting side menu All
	        WebElement sideMenuAll = homepage.getSideMenuAll();
	        sideMenuAll = base.makeWebelementLoad(10, sideMenuAll);   
	        base.btnClick(sideMenuAll);
			log.info("User selecting all side menu");
		}
			
		@When("User navigate to Electronics and Computer > Phone and Accessories") //6
		public void user_navigate_to_electronics_and_computer_phone_and_accessories()
		{
			//Selecting electronicsAndComputerLink
			WebElement electronicsAndComputerLink = homepage.getElectronicsAndComputerLink();
			electronicsAndComputerLink = base.makeWebelementLoad(10, electronicsAndComputerLink);   
			base.btnClick(electronicsAndComputerLink);
			log.info("User navigated to electronics And ComputerLink");
				
			//Nav to phoneAndAccessories link 
			WebElement phoneAndAccessoriesLink = homepage.getPhoneAndAccessoriesLink();
			phoneAndAccessoriesLink = base.makeWebelementLoad(10, phoneAndAccessoriesLink);
			base.btnClick(phoneAndAccessoriesLink);
			log.info("User navigated from Elec & Computer to Phone and Accessories");
		}
			
		@Then("User should see the {string} page displayed") //7
		public void user_should_see_the_phone_accessories_page_displayed(String expectedText)
		{
			
			//Verifying the page has navigated to "Phones & Accessories"
			phoneVerification = new AssertionPage();
			WebElement phoneAccessoriesTitle = phoneVerification.getPhoneAccessoriesTitle();
			phoneAccessoriesTitle = base.makeWebelementLoad(10, phoneAccessoriesTitle);
		    String browserText = phoneAccessoriesTitle.getText();
		    Assert.assertEquals(expectedText, browserText);
		    log.info("Scenario_1 End: Page has been navigated to Phones & Accessories");  
		}
		
		
		@Given("User is on the phone accessories page")
		public void user_is_on_the_phone_accessories_page() 
		{
			log.info("Scenario_2 Start: Phone Accessories page is on"); 
		}
		
		@When("User click on SIM-Free under mobile phones section")
		public void user_click_on_sim_free_under_mobile_phones_section() 
		{
			//Select the SIM-Free & Unlocked Mobile Phones link 
			phonepage = new PhonePage();
			WebElement simFreeLink = phonepage.getSimFreeLink();
			simFreeLink  = base.makeWebelementLoad(10, simFreeLink);
			base.btnClick(simFreeLink);
			log.info("Selected SIM-Free & Unlocked Mobile Phones link"); 
		}
		
		@Then("User should see the page {string} displayed") //12
		public void user_should_see_the_page_sim_free_unlocked_mobile_phones_displayed(String expectedText) 
		{
			//Verifying the user landed on the 	SIM-Free & Unlocked Mobile Phones page		
			phoneVerification = new AssertionPage();
			WebElement simFreePhoneTitle = phoneVerification.getSimFreePhoneTitle();
			simFreePhoneTitle = base.makeWebelementLoad(10, simFreePhoneTitle);
		    String browserText = simFreePhoneTitle.getText();
		    Assert.assertEquals(expectedText, browserText);
		    log.info("Scenario_2 End: landed successfully on SIM-Free & Unlocked Mobile Phones page "); 
		    
		}
		
		@Given("User is on the SIM-Free & Unlocked Mobile Phones page")
		public void user_is_on_the_sim_free_unlocked_mobile_phones_page() 
		{	
			log.info("Scenario_3 Start: User is on SIM-Free & Unlocked Mobile Phones page");	
		}
		
		@When("User click on Samsung under brands section")
		public void user_click_on_samsung_under_brands_section() 
		{	
			//selecting the Samsung checkbox on side filter
			phonepage = new PhonePage();
			WebElement cboxSamsungBrand = phonepage.getCboxSamsungBrand();
			cboxSamsungBrand = base.makeWebelementLoad(10, cboxSamsungBrand);
			base.btnClick(cboxSamsungBrand);
			log.info("Samsung checkbox on side filter clicked");	
			
		}
		
		@When("User click on Camera Resolution as {string} mp and above")
		public void user_click_on_camera_resolution_as_mp_and_above(String string) 
		{
			//Selecting the Camera resolution as 20mp 
			WebElement cboxCameraResolution = phonepage.getCboxCameraResolution();
			cboxCameraResolution = base.makeWebelementLoad(10, cboxCameraResolution);
			base.scrollDown(cboxCameraResolution);
			
			if(cboxCameraResolution.isEnabled() && cboxCameraResolution.isDisplayed()) 
			{
		        base.btnClick(cboxCameraResolution);
		        log.info("Camera resolution selected ");
		    }
			else 
			{
				log.info("Element is not enabled or visible");
			}
		}
		
		@When("User click on Model Year as {string}")
		public void user_click_on_model_year_as(String string) 
		{
			
			//Selecting the model year check box
			WebElement cboxModelYear = phonepage.getCboxModelYear();
			cboxModelYear = base.makeWebelementLoad(10, cboxModelYear);
		    
		    base.scrollDown(cboxModelYear);
		    if(cboxModelYear.isEnabled() && cboxModelYear.isDisplayed()) 
			{
		        base.btnClick(cboxModelYear);
		        log.info("Model year clicked");
		    }
			else 
			{
				log.info("Element is not enabled or visible");
			}
		}
		
		@When("User should check whether the phone exists between {int} to {int}")
		public void user_should_check_whether_the_phone_exists_between(int reqMinValue, int reqMaxValue) 
		{
			
			//checking the filter options having the price range
			int brwMinValue, brwMaxValue;
			
			WebElement priceRefinementsElement = phonepage.getPriceSpan();
			priceRefinementsElement = base.makeWebelementLoad(10, priceRefinementsElement);
			base.scrollDown(priceRefinementsElement);
			
			
			WebElement priceRangeElement = base.getElementWithCssSel(priceRefinementsElement,".sf-range-slider-row");
			priceRangeElement = base.makeWebelementLoad(20, priceRangeElement);
			base.scrollDown(priceRangeElement);
			
			
			List<WebElement> labels = base.getElementListbyTagName(priceRangeElement,"label");
			String minvalue = labels.get(0).getText(); // £205
			String maxvalue = labels.get(1).getText(); // £400+
			
			brwMinValue = base.getClearCurrency(minvalue);
			brwMaxValue = base.getClearCurrency(maxvalue);
			
			log.info(minvalue + " to " + maxvalue);
			
			if(brwMinValue>=reqMinValue && brwMaxValue<=reqMaxValue)
			{
				WebElement goElement = phonepage.getGoElement();
				goElement = base.makeWebelementLoad(10, goElement);
			    base.scrollDown(goElement);
			    if(goElement.isEnabled() && goElement.isDisplayed()) 
				{
			        base.btnClick(goElement);
			        log.info("Price Element Clicked as it satisfied the price range ");
			    }
			}
			else 
			{
				log.info("The min: "+minvalue+" and max: "+maxvalue+" are not with in the given search Scenarios" );
			}
		}
		
		@Then("User should see the {string} phone listed with the match criteria as {int} to {int}")
		public void user_should_see_the_samsung_phone_listed_with_the_match_criteria(String brand, int reqMinValue, int reqMaxValue) {
			
			//Two Conditions Check 
			boolean isRightProduct = false; 
			boolean isPricewithinRange = false;
			
			//isProductSamsung 
			phoneVerification = new AssertionPage();
			WebElement samsungphone = phoneVerification.getSamsungPhoneList();
			String brwsrstring = samsungphone.getText();
			brwsrstring = brwsrstring.trim().split(" ")[0];
			boolean isSamsung = brwsrstring.equalsIgnoreCase(brand);
			
			//IsPrice within Range
			phoneVerification = new AssertionPage();
			WebElement phoneprice = phoneVerification.getPhonePrice();
			String amtitem = phoneprice.getText().trim();
			int itemPrice = base.getClearCurrency(amtitem);
			
			isPricewithinRange = reqMinValue<= itemPrice && itemPrice <= reqMaxValue ? true : false;
			
			//consolidation of conditions 
			isRightProduct  = isSamsung && isPricewithinRange ? true : false;
			
			if (isRightProduct) {	log.info("Scenario_3 End: Product has been listed between the given range");	}  
			else { 		log.info("Scenario_3 End: Product is not with in the given price range");	 }
			
			Assert.assertTrue(isRightProduct);
		}
		
		//UtlityFunctions 



	}
	
		
		