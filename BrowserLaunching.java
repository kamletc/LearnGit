package launchingofbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamle\\Documents\\Selenium\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get ("https://www.amazon.in/-/hi/deals?ref_=nav_cs_gb");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	

}
