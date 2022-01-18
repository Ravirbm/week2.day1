package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		
		//Select Create contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Enter the first Name
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("R");
		String attribute = firstName.getAttribute("value");
		System.out.println(attribute);
		
		
		//Enter the last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Ravishankar");
		
		//Select Create Contact 
		driver.findElement(By.name("submitButton")).click();
		
		//print the title
		String title = driver.getTitle();
		System.out.println(title);		
		
		//close the browser
		driver.close();
		
		
	}

}
