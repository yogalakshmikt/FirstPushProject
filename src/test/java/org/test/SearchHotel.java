package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSelectlocation() {
		return selectlocation;
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getSelectType() {
		return selectType;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getGetIndate() {
		return getIndate;
	}

	public WebElement getGetOutdate() {
		return getOutdate;
	}

	public WebElement getSelectAdult() {
		return selectAdult;
	}

	public WebElement getSelectChild() {
		return selectChild;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}
	@FindBy(name="location")
	private WebElement selectlocation;
		
	@FindBy(id="hotels")
	private WebElement selecthotel; 
	
	@FindBy(id="room_type")
	private WebElement selectType;
	
	@FindBy(name="room_nos")
	private WebElement selectRoom;
	
	@FindBy(name="datepick_in")
	private WebElement getIndate; 
	
	@FindBy(name="datepick_out")
	private WebElement getOutdate;
	
	@FindBy(name="adult_room")
	private WebElement selectAdult;
	
	@FindBy(name="child_room")
	private WebElement selectChild; 
	
	@FindBy(name="Submit")
	private WebElement btnclick;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnclk2;
	
	public WebElement getBtnclk2() {
		return btnclk2;
	}
	public WebElement getBtnclk3() {
		return btnclk3;
	}
	@FindBy(id="continue")
	private WebElement btnclk3;
		


		

	
		

	

	}
		

	



		

	
		


	

	
	
	

	
	
	
			

		
	

	
	
	


