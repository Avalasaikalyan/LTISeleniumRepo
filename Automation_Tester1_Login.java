package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91912\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.name("Email")).sendKeys("kalyanyadav7391@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("kalyan123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
       // driver.close();
        
	}

}
