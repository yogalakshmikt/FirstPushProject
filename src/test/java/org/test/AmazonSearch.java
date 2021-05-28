package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) throws IOException {
		File file =new File("E:\\@selenium\\maven\\Excel\\yoga.xlsx");
		FileInputStream stream =new FileInputStream(file);
		Workbook book =new XSSFWorkbook(stream);
		Sheet createSheet = book.getSheet("Productlist");
		System.setProperty("webdriver.chrome.driver","E:\\@selenium\\maven\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
	
		List<WebElement> productNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < productNames.size(); i++) {
			WebElement webElement = productNames.get(i);
			String text = webElement.getText();
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			System.out.println(text);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		book.write(fileOutputStream);
		System.out.println("ok!!!!");
		
		
	}

}
