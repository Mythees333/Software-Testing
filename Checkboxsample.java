package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\college software\\java\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement choose=driver.findElement(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td[2]/div/div[2]"));
		choose.click();
		
		WebElement boxisdisabled = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt102\']"));
		Boolean notshow=boxisdisabled.isDisplayed();
		System.out.println(true);
		

}
}