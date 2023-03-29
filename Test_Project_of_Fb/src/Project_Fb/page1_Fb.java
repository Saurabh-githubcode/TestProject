package Project_Fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page1_Fb
{
// Automate Fb page
	
     public static void main(String args [] ) 
    {
      System.setProperty("Webdriver.Chrome.Driver", "C:\\Users\\HP\\Browser Extention\\chromedriver.exe");
   	  WebDriver driver=new ChromeDriver();
   	  driver.get("https://www.Facebook.com");
	}
}
