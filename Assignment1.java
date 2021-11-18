package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1 : download and attach chrome driver to this test case
		WebDriverManager.chromedriver().setup();
		// Step 2 : launch the chrome driver
		 ChromeDriver driver = new ChromeDriver();
		 //step 3 : Load the URL
		 driver.get("https://en-gb.facebook.com/");
		 // step 4 : maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //step5: click on create account button
		 driver.findElement(By.linkText("Create New Account")).click();
		 //step6: first name
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.name("firstname")).sendKeys("Mahesh");
		 //step7: surname
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.name("lastname")).sendKeys("Raju");
		//step 8 : enter mail / password
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7401408127");
		 //step 9: password
		 driver.findElement(By.id("password_step_input")).sendKeys("M@hesh5040");
		// step 10 : select date
		 WebElement dropdown1 = driver.findElement(By.id("day"));
		 Select Date = new Select(dropdown1);
		 Date.selectByVisibleText("22");
		 // step 12 : select Month
		 WebElement dropdown2 = driver.findElement(By.id("month"));
		 Select Month = new Select(dropdown2);
		 Month.selectByVisibleText("Jul");
		// step 12 : select year
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select Year = new Select(dropdown3);
		Year.selectByVisibleText("1994");
		 //step 11: click on Male Radio button
		 driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		 
	}

}
