/**
 * @author Kamlesh More
 *
 * @date Apr-08-2022
 * 
 */package launchingofbrowser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleAndUrl {
	
	static WebDriver dvr;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kamle\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
		
		 dvr= new ChromeDriver();
		 
		 dvr.get("https://www.youtube.com/");
		 
		 dvr.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 String url= dvr.getCurrentUrl();
		 if (url.equalsIgnoreCase("https://www.youtube.com/"))
		 		System.out.println("Test is Pass");
		 		System.out.println(url);
		 
		 
		 String title=dvr.getTitle();
		 if (title.equalsIgnoreCase("YouTube"))
				System.out.println("Test is Pass");
		 		System.out.println(title);
		 		
		 		dvr.quit();		
	}

}
