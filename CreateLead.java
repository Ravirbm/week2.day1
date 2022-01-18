package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		
		//select Marketing Campaign
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd1 = new Select(marketingCampaign);
		dd1.selectByValue("9001");
		
		//Enter birthDate
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/22/1996");
		
		//Enter Country Code
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		
		//Enter AreaCode
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("642001");
		
		//Enter AreaCode
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8012387467");
		
		//Enter E-Mail Address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ravishankarrbm@gmail.com");
		
		//Enter To Name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Babu");
		
		//Enter To Attention Name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Hari");
		
		//Enter To Address Line 1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("2/1");
		
		//Enter To Address Line 2
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Ram Nagar");
		
		//Enter To City
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Pollachi");
		
		//Enter To State
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TamilNadu");
		
		//Enter To Postal Code
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("642001");
		
		//Select the country
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd2 = new Select (country);
		dd2.selectByVisibleText("India");
		
		//Select Create Leads 
		driver.findElement(By.name("submitButton")).click();
		
		
		//close the browser
		//driver.close();
		
		
	}

}
