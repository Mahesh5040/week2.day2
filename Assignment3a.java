package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3a{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1 : download and attach chrome driver to this test case
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
		 // step 9 : click on Contacts tab
		 driver.findElement(By.linkText("Contacts")).click();
		 // step 10 : click on create create contact
		 driver.findElement(By.linkText("Create Contact")).click();
		 // step 11 : to enter First Name
		 driver.findElement(By.id("firstNameField")).sendKeys("Mahesh");
		 // step 12 : to enter last name
		 driver.findElement(By.id("lastNameField")).sendKeys("Raju");
		 // step 13 : Enter first name (local)
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Test");
		 // step 14 : Enter Last name (local)
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Test12");
		 //step 15 : Enter department field using any locator
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
		 //step 16 : Enter description field using any locator
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Test Description");
		 //step 17 : Enter email in Email address field
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("maheshraju5041@gmail.com");
		 //step 18 : select state / province as Newyork
		 WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select state = new Select(dropdown);
		 state.selectByVisibleText("New York");
		 // step 19s : click on create contact
		driver.findElement(By.name("submitButton")).click();
		 //step 20: click on Edit button
			driver.findElement(By.linkText("Edit")).click();
		 //step 21 : clear description field using .clear()
			driver.findElement(By.name("description")).clear();
		 // step 22 : Fill important field with any text
			driver.findElement(By.name("importantNote")).sendKeys("Editnote");
			 // step 23 : click on update using xpath
		 driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		//step 15: check the page title
		String title = driver.getTitle();
		System.out.println(title);
		// step 17 : to close the browser
		 //driver.close();


	}

}
