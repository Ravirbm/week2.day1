package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) {
		
		//set up the driver
		WebDriverManager.chromedriver().setup();
		
		//launth the chrome
		ChromeDriver driver = new ChromeDriver();
		
		//enter the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize the window
		driver.manage().window().maximize();
	
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//select CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Select contacts
		driver.findElement(By.linkText("Contacts")).click();
		
		//Select Find contact
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//Select Email
		driver.findElement(By.linkText("Email")).click();
				
		//Enter the last Name
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		
		//Select Create Contact 
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//close the browser
		//driver.close();
		
		
	}

}
