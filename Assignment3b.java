package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3b {

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
		//step 11 : click on phone
		 driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		 // step 12 : enter the phone number
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		 //step 13 : click on Find lead
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText());
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			//step 14:click on Delete button
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			//step 15: click on Find leads
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			// step 16 : click on Name and ID
			driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys("11050");
			//// step 17 :click on find leads
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			//step 18 : print "No records to display message
			String text = driver.findElement
					(By.className("x-paging-info")).getText();
			System.out.println(text);
			if(text.equals("No records to display"))
				{
				System.out.println("Record Mathced ");
				
				}
			else
				System.out.println("Record Not Matched");
				 
	}

}
