package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1 : download and attach chrome driver to this test case
		WebDriverManager.chromedriver().setup();
		// Step 2 : launch the chrome driver
		 ChromeDriver driver = new ChromeDriver();
		 //step 3 : Load the URL
		 driver.get("https://www.opencart.com/index.php?route=account/register");
		 // step 4 : maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //step5: Enter the username
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Mahesh Raju");
		 //step6 :Enter the First name
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mahesh");
		//step6 :Enter the last name
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raju");
		 // step 7 : Enter Work Email;
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Maheshraju5040@gmail.com");
		 // step 8 : select Country
		 WebElement dropdown = driver.findElement(By.xpath("//select[@name='country_id']"));
		 Select select = new Select(dropdown);
		 select.selectByVisibleText("India");
		//step 9 : Enter the password
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("M@hesh5040");
		 //step 10 : close browser
		 //driver.close();
		 	 

	}

}
