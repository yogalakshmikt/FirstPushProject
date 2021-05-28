package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
 	
	@FindBy(name="username")
	private WebElement txtusername;
 	
 	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(id="password")
 	private WebElement txtpassword;
 	
 	@FindBy(xpath="//input[@class='login_button']")
 	private WebElement btnLogin; 
		

	
 	
	}


