package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdownsample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\college software\\java\\driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dropdown= driver.findElement(By.className("ui-selectonemenu"));
		Select buttonselect = new Select(dropdown);
		buttonselect.selectByIndex(3);
		//buttonselect.selectByValue("3");
		//buttonselect.selectByVisibleText("Playwright");
		WebElement dropdown1= driver.findElement(By.id("j_idt87:country"));
		Select buttonselect1 = new Select(dropdown1);
		buttonselect1.selectByVisibleText("India");
	}

}
