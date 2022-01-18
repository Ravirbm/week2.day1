package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		//set up the driver
		WebDriverManager.chromedriver().setup();
		
		//launth the chrome
		ChromeDriver driver = new ChromeDriver();
		
		//enter the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//print the title
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//select CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Select leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Select Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		
		//Enter the first Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("R");
		
		//Enter the last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravishankar");
		
		//select source
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(source);
		dd.selectByVisibleText("Self Generated");
		
		//Select Create Leads 
		driver.findElement(By.name("submitButton")).click();
		
		
		//close the browser
		//driver.close();
		
		
	}

}
