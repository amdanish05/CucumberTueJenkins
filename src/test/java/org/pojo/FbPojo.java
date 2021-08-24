package org.pojo;

import org.base.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends LibGlobal {
	
	
	
		public FbPojo() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="email")	
		private WebElement txtUser;
		
		@FindBy(id="pass")	
		private WebElement txtPass;
		
		@FindBy(name="login")	
		private WebElement txtLogin;

		public WebElement getTxtUser() {
			return txtUser;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getTxtLogin() {
			return txtLogin;
		}
	}

