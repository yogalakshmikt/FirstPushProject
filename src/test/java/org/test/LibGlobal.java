package org.test;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Action;
import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	private static final WebElement WebElement = null;
	public static WebDriver driver;
	protected static Object scrollDown;
     //	1.browser configuration
	public static void getdriver() {
		System.setProperty("webdriver.chrome.driver","E:\\@selenium\\maven\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	// 2.launching URL
	public static void launchUrl(String url) {
		driver.get(url);
		
	}
	// 3.enter the value to text box
	public void enterText(WebElement element,String data) {
	//	element.clear();
		element.sendKeys(data);

	}public void enterText(WebElement element,int i) {
	//	element.clear();
		element.getText();
	}

	
	
  // 4. button click
	public void btnclk(WebElement element) {
		element.click();

	}
	//5. get current URL
	public void curenturl(String url) {
		driver.getCurrentUrl();
	}
	//6. get title of URL
	public void title(String title) {
		driver.getTitle();

	}
	//7. close window
	public void closeWindow() {
		driver.close();

	}
	//8.Quit the window
	public void quitewindow() {
		driver.quit();
    }
	//9.Navigations
	public void navigate() {
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

	}
	//10. get attributes
	public void getattribute(WebElement element,String data) {
		element.getAttribute(data);
	}
	//sendkeys
	public void SendKeys(WebElement element,String data) {
	 element.sendKeys(data);	

	}
	//dragAndDrop
	public void dragAndrop(WebElement source,WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
	}
	//scrolldown
	public void scrolldown() {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);

	}
	//dropdown Select by Index
	public void dropdown(WebElement Element, int i) {
		Select sc = new Select(WebElement);
		sc.selectByIndex(0);

	}
	//dropdown Select by visibleText
	public void dropdown(WebElement element,String data) {
	Select sc=new Select(WebElement);
	sc.selectByVisibleText(data);

	}
	//dropdown Select by value
	public void dropdown1(WebElement element,String data) {
		Select sc =new Select(WebElement);
		sc.selectByValue(data);
		

	}
	//dropdown getoptions
	public void dropdown2(WebElement element,String data) {
		String text =WebElement.getText();
		System.out.println(text);
		
		}

	
	
		
	//11.alert to accept
	public void Alertaccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	//12.alert to dismiss
	public void Alertdismiss() {
		Alert alert= driver.switchTo().alert();
		alert.dismiss();

	}
	//13.drop down
	public void selectByValue(WebElement element,String data) {
		Select  sc =new Select(element);
		sc.selectByValue(data);
		
	}//14
	public void selectbyIndex(WebElement element,int value) {
		Select sc = new Select(element);
		sc.selectByIndex(value);
		
	}
	//15
	public void waitDriver() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	//Getting value from excel
    public String getvalueFromExcel(String pathName,String sheetName,int rowNo,int cellNo) throws IOException {
	File file =new File(pathName);
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(sheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	int cellType = cell.getCellType();
	String value="";
	if(cellType==1) {
		value = cell.getStringCellValue();
	}
	else if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MMM-YYYY");
	   value = dateFormat.format(dateCellValue);
	}else {
		double numericCellValue = cell.getNumericCellValue();
		long l =(long) numericCellValue;
		value=String.valueOf(l);
	}
	return value;
    }
		
}

	
	
	
	
	
	
	

