package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation extends LibGlobal {
	public Confirmation() {
		PageFactory.initElements(driver, this);
	}	
		@FindBy(id="my_itinerary")
		private WebElement click;
		public WebElement getClick() {
			return click;
		}
		@Override
		public void scrolldown() {
			// TODO Auto-generated method stub
			super.scrolldown();
}
}