package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "E:\\college software\\java\\driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver(); 
driver.get("https://www.google.com");
driver.findElement(By.className("gLFyf")).sendKeys("TATA"+Keys.ENTER);
	}
	

}
