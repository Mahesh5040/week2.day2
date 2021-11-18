package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3d {

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
		//step 11 : click on Name and ID	
		 driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		 // step 12 : enter the first name
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mahesh");
		 //step 13 : click on Find lead
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText());
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			//step 14: verify the title of page
			String title = driver.getTitle();
			 System.out.println(title);
			//step 14:click on Edit button
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			//step 15: change company name
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Changepond");
			// step 16: click on update button
			driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
			// step 17 : verify the updated text
			System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
			
			
		
	}

}
