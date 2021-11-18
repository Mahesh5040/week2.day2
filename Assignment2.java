package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1 : download and attach chrome driver to this test case
				WebDriverManager.chromedriver().setup();
				// Step 2 : launch the chrome driver
				 ChromeDriver driver = new ChromeDriver();
				 //step 3 : Load the URL
				 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
				 // step 4 : maximize the browser
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				 //step5: Enter the First name
				 driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Mahesh");
				 //step6 :Enter the Lastname
				 driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Raju");
				 // step 7 : Enter Work Email;
				 driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("Maheshraju5040@gmail.com");
				 // step 8 : select jobtitle
				 WebElement dropdown = driver.findElement(By.xpath("//select[@name='UserTitle']"));
				 Select select = new Select(dropdown);
				 select.selectByVisibleText("Sales Manager");
				//step 9 : Enter the company name
				 driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Changepond Technologies");
				 // step 10 : select Employee
				 WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
				 Select Employee = new Select(dropdown1);
				Employee.selectByVisibleText("15 - 100 employees");
				 //step11 : Enter the phone number
				 driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("7401408127");
				 // step 12 : select country
				 WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
				 Select country = new Select(dropdown2);
				country.selectByVisibleText("India");
				// step 13 : click on I agree check box
				driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
				 	 
				
	}

}
