package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kamle\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver dvr = new ChromeDriver();
		dvr.get("https://demo.guru99.com/test/drag_drop.html");
		dvr.manage().window().maximize();
		
		WebElement source = dvr.findElement(By.xpath("//*[text()=' BANK ']"));
		WebElement target = dvr.findElement(By.xpath("//*[@id='bank']"));
		Actions act = new Actions(dvr);
		act.dragAndDrop(source, target).perform();
		
		Thread.sleep(2000);
		
		WebElement source1 = dvr.findElement(By.xpath("//*[text()=' 5000 ']"));
		WebElement target1 = dvr.findElement(By.xpath("//*[@id='amt7']"));
		act.dragAndDrop(source1, target1).perform();
	}

}
