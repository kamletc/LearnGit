package launchingofbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternateCheckBoxClick {
	static WebDriver dvr;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kamle\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
		
		dvr = new ChromeDriver ();
		dvr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		dvr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dvr.findElement(By.id("txtPassword")).sendKeys("admin123");
		dvr.findElement(By.id("btnLogin")).click();
		dvr.manage().window().maximize();
		dvr.findElement(By.id("menu_admin_viewAdminModule")).click();
		dvr.findElement(By.id("menu_admin_UserManagement")).click();
		List<WebElement> checkBoxes = dvr.findElements(By.xpath("//table//tr//td//input[@type='checkbox']"));
		
		for (int i=1; i<=checkBoxes.size(); i++) {
			if (i%2==0)
				dvr.findElement(By.xpath("(//*[contains(@id, 'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		}
		
		Thread.sleep(2000);
		dvr.quit();
		
	}

}
