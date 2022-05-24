package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sumitha");
		
		Thread.sleep(4000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(4000);
		
		driver.findElement(By.id("email")).sendKeys("venkat");
		String value=driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(value);

		boolean enabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(enabled);

	}

}
