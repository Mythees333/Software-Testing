package simpletest;

		// TODO Auto-generated method stub
		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

		public class NewTest {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\college software\\java\\driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		//using class name... find to website name  
		//driver.findElement(By.className("gLFyf")).sendKeys("TATA"+Keys.ENTER);
		
		//using ling to find  particular webpage 
		//driver.findElement(By.partialLinkText("Mobiles")).click();
		driver.findElement(By.name("q")).sendKeys("new mobile"+Keys.ENTER);
		
		
		
		}

		}
	


