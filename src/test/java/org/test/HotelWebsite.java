package org.test;


import javax.naming.directory.SearchControls;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HotelWebsite extends LibGlobal  {
//	public static WebElement;

	public static void main(String[] args) throws InterruptedException {
		LibGlobal global= new LibGlobal();	
		global.getdriver();
		global.launchUrl("http://adactinhotelapp.com/");
			
		LoginPage loginPage= new LoginPage();
		SearchHotel searchHotel= new SearchHotel();
		Booking booking =new Booking();
		Confirmation confirmation =new Confirmation();
		WebElement txtusername = loginPage.getTxtusername();
		global.enterText(txtusername, "xavipik373");
		WebElement txtpassword = loginPage.getTxtpassword();
		global.enterText(txtpassword, "xavipik373");
		WebElement login = loginPage.getBtnLogin();
		global.btnclk(login);
		
		WebElement selectlocation = searchHotel.getSelectlocation();
		global.selectbyIndex(selectlocation, 5);
		global.waitDriver();
		
		WebElement selecthotel = searchHotel.getSelecthotel();
		global.selectByValue(selecthotel,"Hotel Creek");
		global.waitDriver();
		WebElement selectType = searchHotel.getSelectType();
		global.selectByValue(selectType, "Deluxe");
		global.waitDriver();
		WebElement selectRoom = searchHotel.getSelectRoom();
		global.selectbyIndex(selectRoom, 3);
		global.waitDriver();
		WebElement getIndate = searchHotel.getGetIndate();
		global.enterText(getIndate, "14/05/2021");
		global.waitDriver();
		WebElement getOutdate = searchHotel.getGetOutdate();
		global.enterText(getOutdate, "20/05/2021");
		global.waitDriver();
		WebElement selectAdult = searchHotel.getSelectAdult();
		global.selectbyIndex(selectAdult, 2);
		global.waitDriver();
		WebElement selectChild = searchHotel.getSelectChild();
		global.selectbyIndex(selectChild, 1);
		global.waitDriver();
		WebElement btnclick = searchHotel.getBtnclick();
		global.btnclk(btnclick);
		WebElement btnclk2 = searchHotel.getBtnclk2();
		global.btnclk(btnclk2);
		WebElement btnclk3 = searchHotel.getBtnclk3();
		global.btnclk(btnclk3);
	
		WebElement enterFrstName = booking.getEnterFrstName();
		global.enterText(enterFrstName,"yoga");
		global.waitDriver();
		WebElement enterLastName = booking.getEnterLastName();
		global.enterText(enterLastName,"Lakshmi");
		global.waitDriver();
		WebElement enterBilling = booking.getEnterBilling();
		global.enterText(enterBilling, "perungudi");
		global.waitDriver();
		WebElement enterCardName = booking.getEnterCardName();
		global.enterText(enterCardName, "1234567890987654");
		global.waitDriver();
		WebElement enterCardType = booking.getEnterCardType();
		global.selectByValue(enterCardType, "VISA");
		global.waitDriver();
		WebElement selectmonth = booking.getSelectmonth();
		global.selectbyIndex(selectmonth, 1);
		global.waitDriver();
		WebElement selectYear = booking.getSelectYear();
		global.selectByValue(selectYear, "2022");
		global.waitDriver();
		WebElement enterCVV = booking.getEnterCVV();
		global.enterText(enterCVV, "2345");
		global.waitDriver();
		WebElement click = booking.getClick();
		global.btnclk(click);
		
		WebElement click2 = confirmation.getClick();

			
		
	}

}
