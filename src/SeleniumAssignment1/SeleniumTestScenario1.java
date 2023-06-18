package SeleniumAssignment1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestScenario1 {

public static void main(String[] args) throws InterruptedException {

// WebDriverManager.firefoxdriver().setup();
 WebDriverManager.chromedriver().setup();
//WebDriverManager.edgedriver().setup();
	

 WebDriver driver = new ChromeDriver();
// WebDriver driver = new FirefoxDriver();
//WebDriver driver = new EdgeDriver();
 
 // Maximizing the window size.
 driver.manage().window().maximize();
 // Navigating to the desired application.
driver.get("http://qatechhub.com");
String headerTxt = driver.getTitle();
//Checking the title of page..
if(headerTxt =="QA Automation Tools Trainings and Tutorials | QA Tech Hub") {
	System.out.println("PASS");
}
else {
	System.out.println("FAIL");
}
// Navigating to the youtube in current tab.
	driver.navigate().to("http://youtube.com");
	// Navigating back to the previous page.
	driver.navigate().back();
//Printing the Url of current page.
   String url = driver.getCurrentUrl();
   System.out.println(url);
   //Navigating Forward
   driver.navigate().forward();
   // Reloading the Page
   driver.navigate().refresh();
   // Close the Browser
   driver.quit();

Thread.sleep(30000);
driver.quit();



}



}