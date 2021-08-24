package org.stepdef;


import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pojo.FbPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDef {
	
	
	
	
		LibGlobal base;
		FbPojo page;
		
		@Given("User is on Adactin home page")
		public void user_is_on_Adactin_home_page() {
		    base=new LibGlobal();
		    base.getDriver();
		    base.launchUrl("https://www.facebook.com/");
		}

		@When("User should enter {string} and {string}")
		public void user_should_enter_and(String string, String string2) {
			 page=new FbPojo();
			WebElement txtUser = page.getTxtUser();
			base.enterText(txtUser, string);
			WebElement txtPass = page.getTxtPass();
			
		    base.enterText(txtPass, string2);
		}

		@When("User should click login button")
		public void user_should_click_login_button() {
			WebElement txtLogin = page.getTxtLogin();
		    base.btnClick(txtLogin);
		}



	}


