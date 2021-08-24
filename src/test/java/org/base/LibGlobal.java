package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	
		public static WebDriver driver;
			public void getDriver() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\ExcelDataDriven\\drivers\\chromedriver.exe");	
				driver=new ChromeDriver();

			}
			public void launchUrl(String url) {
			driver.get(url);
			}
			
			public void enterText(WebElement ele, String data) {
				ele.sendKeys(data);

			}
			public void btnClick(WebElement ele) {
				ele.click();
				

			}
	}

