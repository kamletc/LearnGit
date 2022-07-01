package launchingofbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker1 {
	static WebDriver dvr;
		public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\kamle\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
			dvr = new ChromeDriver ();
			dvr.get("http://demo.automationtesting.in/Datepicker.html");
			dvr.manage().window().maximize();
			dvr.findElement(By.id("datepicker2")).click();
			
			WebElement year1= dvr.findElement(By.xpath("//select[@class='datepick-month-year'][2]"));
			Select y1= new Select(year1);
			y1.selectByVisibleText("2012");
			
			WebElement year2= dvr.findElement(By.xpath("//select[@class='datepick-month-year'][2]"));
			Thread.sleep(1000);
			Select y2= new Select(year2);
			y2.selectByVisibleText("2002");	
			
			WebElement year3= dvr.findElement(By.xpath("//select[@class='datepick-month-year'][2]"));
			Thread.sleep(2000);
			Select y3= new Select(year3);
			y3.selectByVisibleText("1993");
			
			WebElement month = dvr.findElement(By.xpath("//select[@title='Change the month']"));
			Thread.sleep(3000);
			Select selMonth = new Select(month);
			selMonth.selectByVisibleText("June");
			
			dvr.findElement(By.cssSelector(".dp740385000000")).click();
			Thread.sleep(4000);
	}

}
