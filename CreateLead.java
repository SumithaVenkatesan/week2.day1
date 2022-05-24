package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement eleUserName= driver.findElement(By.id("username"));
		
		eleUserName.sendKeys("DemoSalesManager");
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkat");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jai");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Sai");
		
		driver.findElement(By.name("departmentName")).sendKeys("Pharmancy");
		
			
		driver.findElement(By.id("createLeadForm_description")).sendKeys("pls Acknowledge the form");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nmsumitha82@gmail.com");
		
		//driver.findElement(By.name("submitButton")).click();
		
		
		WebElement industryDropDown=driver.findElement(By.name("industryEnumId"));
		Select selectIndustry= new Select(industryDropDown);
		selectIndustry.selectByVisibleText("Aerospace");
		
		
		WebElement ownerDropDown=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select selctOwner= new Select(ownerDropDown);
		selctOwner.selectByIndex(1);
		
		// select state/provice dropdown
		WebElement stateDropDown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectState=new Select(stateDropDown);
		//selectState.selectByVisibleText("Sole Proprietorship");
		selectState.selectByValue("NY");
		
		
		WebElement sourceDropDown=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select selectSource = new Select(sourceDropDown);
		selectSource.selectByVisibleText("Conference");
		
			
		
		//driver.findElement(By.name("submitButton")).click();
		
		//driver.findElement(By.linkText("Edit")).click();
		//driver.findElement(By.id("createLeadForm_description")).sendKeys("pls Acknowledge the form");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(3000);
		//String firstName=driver.findElement(By.id("ViewLead_firstName_sp")).getText();
		//System.out.println(firstName);
		
		// Edit Page
		driver.findElement(By.linkText("Edit")).click();
		
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("importantNote")).sendKeys("This is an important note");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		//driver.close();
		
		
	


	}

}

