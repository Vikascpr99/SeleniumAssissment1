package SeleniumAssignment1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestScenario2 {

public static void main(String[] args) throws InterruptedException {

// WebDriverManager.firefoxdriver().setup();
 WebDriverManager.chromedriver().setup();
//WebDriverManager.edgedriver().setup();
	

 WebDriver driver = new ChromeDriver();
// WebDriver driver = new FirefoxDriver();
//WebDriver driver = new EdgeDriver();
driver.get("http://qatechhub.com");
//Maximizing the browser window
driver.manage().window().maximize();
//String headerTxt = driver.findElement(By.tagName("h1")).getText();
WebElement email1 = driver.findElement(By.cssSelector("#tve_editor > div.thrv_wrapper.thrv-contact-form > form > div.tve-cf-item-wrapper > div:nth-child(1) > div > div:nth-child(1) > div > div > div > div > input[type=email]"));
email1.clear();
email1.sendKeys("Abc@abc.com");
WebElement Full_name = driver.findElement(By.cssSelector("#tve_editor > div.thrv_wrapper.thrv-contact-form > form > div.tve-cf-item-wrapper > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div > input[type=text]"));
Full_name.clear();
Full_name.sendKeys("abc");

driver.findElement(By.cssSelector("#tve_editor > div.thrv_wrapper.thrv-contact-form > form > div.tve-cf-submit.tcb-icon-display > button")).click();

String error_msg = driver.findElement(By.cssSelector("#tve_editor > div.thrv_wrapper.thrv-contact-form > form > div.tve-cf-item-wrapper > div:nth-child(2) > div > div > div > div > div > div > span")).getText();
System.out.println(error_msg);
//driver.quit();

Thread.sleep(3000);
driver.quit();



}



}