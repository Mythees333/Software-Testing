package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testboxsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\college software\\java\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		WebElement addname = driver.findElement(By.id("j_idt88:name"));
		addname.sendKeys("Mythees");

		WebElement cityappend = driver.findElement(By.id("j_idt88:j_idt91"));
		cityappend.sendKeys("formerly know as madras");
		
		WebElement boxisdisabled = driver.findElement(By.xpath("//*[@id='j_idt88']/div[3]/div"));
		boxisdisabled.isEnabled();
		System.out.println("True");

		WebElement textclear = driver.findElement(By.id("j_idt88:j_idt95"));
		textclear.clear();

		WebElement Retrievetext = driver.findElement(By.id("j_idt88:j_idt97"));
		String value1 = Retrievetext.getAttribute("value");
		System.out.println(value1);

		WebElement emailinput = driver.findElement(By.id("j_idt88:j_idt99"));
		emailinput.sendKeys("mythees@gmail.com");
		emailinput.sendKeys(Keys.TAB);

		WebElement yourself = driver.findElement(By.id("j_idt88:j_idt101"));
		yourself.sendKeys("Hi i'm Mythees completed BE CSE and also i have completed MBA ");
		
		WebElement keytoch = driver.findElement(By.xpath(" //*[@id=\'j_idt88:j_idt103_toolbar\']/span[2]/button[1]"));
		keytoch.click();
		WebElement texteditor = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]"));
		texteditor.sendKeys("Hi i'm Mythees");
		
		//WebElement error=driver.findElement(By.id("j_idt106:thisform:age"));
       // error.sendKeys(Keys.ENTER);
         
		WebElement label=driver.findElement(By.id("j_idt106:float-input"));
		label.click();
		label.getCssValue("//*[@id='j_idt106:j_idt113']");
		System.out.println("true");
		
		WebElement dob=driver.findElement(By.id("j_idt106:j_idt116_input"));
		dob.sendKeys("10/05/1999");
		String value2=dob.getAttribute("value");
		if(value2.equals("10/05/1999"))
		{System.out.println("succesfylly:"+value2);}
		
		WebElement spin=driver.findElement(By.xpath("//*[@id=\'j_idt106:j_idt118_input\']"));
		spin.sendKeys("3");
		WebElement incrementbutton=driver.findElement(By.xpath("//*[@id=\'j_idt106:j_idt118\']/a[1]/span/span"));
		incrementbutton.click();
		
		WebElement randomnumber=driver.findElement(By.id("j_idt106:slider"));
		randomnumber.sendKeys("32");

}
}