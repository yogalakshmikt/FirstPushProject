package org.lang;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
//import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.formula.functions.LookupUtils.LookupValueComparer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.test.LibGlobal;

public class Login  extends LibGlobal{
	@BeforeClass
	public static void beforeclassMethod() {
		getdriver();
		launchUrl("http://adactinhotelapp.com/");
		
	}
	@AfterClass
	public static void afterclassMethod() {
		driver.close();
	}
	@Before
	public  void beforeMethod() {
		Date date =new Date(0);
		System.out.println(date);
	}
	@After
	public void afterMethod() throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("Screenshot.png"));
//		System.out.println(screenshotAs);
		Date date =new Date(0);
		System.out.println(date);

	}
	@Test
	public void tc0() throws IOException {
		WebElement UserName = driver.findElement(By.id("username"));
		enterText(UserName,getvalueFromExcel("E:\\@selenium\\maven\\Excel\\yoga.xlsx", "Sheet3", 1, 0));
		WebElement UserPass = driver.findElement(By.id("password"));
		enterText(UserPass, getvalueFromExcel("E:\\\\@selenium\\\\maven\\\\Excel\\\\yoga.xlsx", "Sheet3", 1, 1));
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	@Test 
	public void tc1() throws IOException {
		//Login login=new Login();
	    WebElement Location = driver.findElement(By.id("location"));
	    enterText(Location, getvalueFromExcel("E:\\\\@selenium\\\\maven\\\\Excel\\\\yoga.xlsx", "Sheet3", 1, 2));
		//dropdown(Location, 2);
		
	}
	@Test
	public void tc2() {
		WebElement SelectHotel = driver.findElement(By.id("hotels"));
		Select sc = new Select(SelectHotel);
		sc.selectByVisibleText("Hotel Sunshine");

	}
	
   @Test
   public void tc3() throws IOException, InterruptedException {
	WebElement RoomType = driver.findElement(By.id("room_type"));
	enterText(RoomType,getvalueFromExcel("E:\\@selenium\\maven\\Excel\\yoga.xlsx", "Sheet3", 3,4));
	WebElement NumberOfRooms = driver.findElement(By.id("room_nos"));
	enterText(NumberOfRooms,getvalueFromExcel("E:\\@selenium\\maven\\Excel\\yoga.xlsx", "Sheet3", 4,5));
	WebElement AdultsperRoom = driver.findElement(By.id("adult_room"));
	enterText(AdultsperRoom,getvalueFromExcel("E:\\@selenium\\maven\\Excel\\yoga.xlsx", "Sheet3", 3,8));
	WebElement ChildPerRoom = driver.findElement(By.id("child_room"));
	enterText(ChildPerRoom,getvalueFromExcel("E:\\@selenium\\maven\\Excel\\yoga.xlsx", "Sheet3", 3,9));
	WebElement search= driver.findElement(By.id("Submit"));
	search.click();
	
   }
   @Test
   public void tc4() {
	WebElement InDate = driver.findElement(By.id("datepick_in"));
	enterText(InDate, 20/05/2021);
	
	
	WebElement OutDate= driver.findElement(By.id("datepick_out"));
	enterText(OutDate, "30/05/2021");
	
   }


}

		
		

	
