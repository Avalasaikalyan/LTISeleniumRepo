package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCHbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\91912\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       // open application
	       driver.get("https://demo.guru99.com/test/newtours/");
	       //click on register link
	       driver.findElement(By.linkText("REGISTER")).click();
	       //enter username as saikalyan
	       driver.findElement(By.name("email")).sendKeys("saikalyan");
	       //enter password as kalyan123
	       driver.findElement(By.name("password")).sendKeys("kalyan123");
	       //enter confirm password
	       driver.findElement(By.name("confirmPassword")).sendKeys("kalyan123");
	       // click on submit
	       driver.findElement(By.name("submit")).click();
	       //close the browser
	       driver.close();
	       

	}

}
