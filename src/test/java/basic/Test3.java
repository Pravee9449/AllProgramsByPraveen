package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();

driver.manage().window().fullscreen();

System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
	}

}
