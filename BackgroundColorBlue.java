package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColorBlue {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kamle\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver dvr = new ChromeDriver();
		dvr.get("https://jqueryui.com/slider/#colorpicker");
		dvr.manage().window().maximize();
		
		WebElement iframe = dvr.findElement(By.tagName("iframe"));
		dvr.switchTo().frame(iframe);
		
		WebElement colorEle = dvr.findElement(By.xpath("//div[@id='blue']//div"));
		String colorVal = colorEle.getCssValue("background-color");
		System.out.println(colorVal);
	}

}
