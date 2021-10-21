package org.sampleng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends Baseclass {
	public void pom() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	public WebElement user;
	@FindBy(id = "pass")
	public WebElement pass;
	@FindBy(name = "login")
	public WebElement click;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClick() {
		return click;
	}

}
