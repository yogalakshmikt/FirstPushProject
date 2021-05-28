package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends LibGlobal {
	public Booking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="first_name")
	private WebElement enterFrstName;
	
	public WebElement getEnterFrstName() {
		return enterFrstName;
	}

	public WebElement getEnterLastName() {
		return enterLastName;
	}

	public WebElement getEnterBilling() {
		return enterBilling;
	}

	public WebElement getEnterCardName() {
		return enterCardName;
	}

	public WebElement getEnterCardType() {
		return enterCardType;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getEnterCVV() {
		return enterCVV;
	}

	public WebElement getClick() {
		return click;
	}
	@FindBy(name="last_name")
	private WebElement enterLastName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement enterBilling;
	
	@FindBy(id="cc_num")
	private WebElement enterCardName;
	
	@FindBy(id="cc_type")
	private WebElement enterCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement selectmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement selectYear;
	
	@FindBy(id="cc_cvv")
	private WebElement enterCVV;
	
	@FindBy(id="book_now")
	private WebElement click;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement click2;

	public WebElement getClickSrch() {
		return click2;
	}
		

	}
		

	
	
		
	
		

	
		
		

	
	

