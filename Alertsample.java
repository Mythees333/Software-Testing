package simpletest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\college software\\java\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
				driver.get("https://www.leafground.com/alert.xhtml");
				
				WebElement alertoneclick=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[1]"));
				alertoneclick.click();
				Alert clickalert=driver.switchTo().alert();
				clickalert.accept();
				
				WebElement confirmclick=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[1]"));
				confirmclick.click();
				Alert cancelclick=driver.switchTo().alert();
				cancelclick.dismiss();
				
				WebElement textalert=driver.findElement(By.id("j_idt88:j_idt104"));
				textalert.click();
				Alert textclick= driver.switchTo().alert();
				textclick.sendKeys("process sucess");
				textclick.accept();
				
	}

}
