package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1 : download and attach chrome driver to this test case
		WebDriverManager.chromedriver().setup();
		// Step 2 : launch the chrome driver
		 ChromeDriver driver = new ChromeDriver();
		 //step 3 : Load the URL
		 driver.get("https://acme-test.uipath.com/login");
		 // step 4 : maximize the browser
		 driver.manage().window().maximize();
		 // step 5 : to enter user name
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 // step 6 : to enter password
		 driver.findElement(By.id("password")).sendKeys("leaf@12");
		 // step 7 : to click on login button
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 // step 8 : get title
		String title = driver.getTitle();
		System.out.println(title);
		// step 9 : to close the browser
		// driver.close();
	}

}
