package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("Praveen");
driver.findElement(By.name("pass")).sendKeys("12356gs");
driver.findElement(By.name("login")).click();

driver.manage().window().fullscreen();
driver.navigate().back();

Thread.sleep(6000);
driver.navigate().refresh();
	}

}
