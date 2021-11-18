package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2 : launch the chrome driver
		 ChromeDriver driver = new ChromeDriver();
		 //step 3 : Load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 // step 4 : maximize the browser
		 driver.manage().window().maximize();
		 // step 5 : to enter user name
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 // step 6 : to enter password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 // step 7 : to click on login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //step 8 : click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 // step 9 : click on Leads
		 driver.findElement(By.linkText("Leads")).click();
		 //step 10 : click on Find leads
		 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//step 11 : click on Email
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 // step 12 : enter the email
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		 //step 13 : click on Find lead
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText());
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
			//step 14:click on Duplicate lead button
			driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
			//step 15 : check the tile :
			 String title = driver.getTitle();
			 System.out.println(title);
			//step 15: click on create lead
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			// step 16: 
			driver.findElement(By.id("viewLead_companyName_sp")).getText();
			//step 17 : confirm duplicate lead name is same as captured name
			
			
			
				 
	}

}
