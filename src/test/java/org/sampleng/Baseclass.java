package org.sampleng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static WebDriver launchbrowser(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;

		default:
			System.out.println("Invalied");
			break;
		}
		return driver;
		}
	public static void launch(String url) {
		driver.get(url);
	}
	public static String currenturl() {
		String cUrl = driver.getCurrentUrl();
		return cUrl;
		}
	public static String getatri(WebElement att) {
		return att.getAttribute("value");
	}
	
	public static void fillthebox(WebElement e,String value) {
		e.sendKeys(value);
		}
	public static void btnclick(WebElement e) {
		e.click();
		}
	

}
