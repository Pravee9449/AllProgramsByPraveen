package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		

	}

}
