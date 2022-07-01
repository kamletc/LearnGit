package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClick {
	static WebDriver dvr;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kamle\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
		dvr = new  ChromeDriver();
		dvr.get("https://chercher.tech/practice/dynamic-table");
		dvr.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement selen = dvr.findElement(By.xpath("//*[text()='selenium-webdriver.com']//parent :: tr//input"));
		selen.click();
		
		Thread.sleep(2000);
		
		WebElement 	Chercher = dvr.findElement(By.xpath("//*[text()='Chercher.tech']// parent :: tr//input"));
		Chercher.click();
		
	}

}
