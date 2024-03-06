package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbuttonsample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\college software\\java\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement getpostion=driver.findElement(By.id("j_idt88:j_idt94"));
		Point xyvalue=getpostion.getLocation();
		int xvalue=xyvalue.getX();
		int yvalue=xyvalue.getY();
		System.out.println("x value is:"+xvalue);
		System.out.println("y value is:"+yvalue);
	
		WebElement colorbutton=driver.findElement(By.id("j_idt88:j_idt96"));
		String color=colorbutton.getCssValue("background");
		System.out.println("button is:"+color);
		
		WebElement sizebutton=driver.findElement(By.id("j_idt88:j_idt98"));
		int height=sizebutton.getSize().getHeight();
		int width=sizebutton.getSize().getWidth();
		System.out.println("height is: "+height +"width is: "+width);
		
		WebElement clickbutton=driver.findElement(By.id("j_idt88:j_idt90"));
		clickbutton.click();
		
	}

}
