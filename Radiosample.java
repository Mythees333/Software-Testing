package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Radiosample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\college software\\java\\driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.leafground.com/radio.xhtml");

WebElement unchecked= driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[1]/div/div[2]/span"));
WebElement checked= driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div/div[2]/span"));
 boolean s1=unchecked.isSelected();
 
 boolean s2=checked.isDisplayed();
 System.out.println(s1);
 System.out.println(s2);
 WebElement below20=driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]/span"));
 below20.click();
 
 
 
 
		 

	}

}
