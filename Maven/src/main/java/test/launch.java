package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
		driver.get("https://www.google.com");
		driver.findElement(By.className("gb_g")).click();
		driver.findElement(By.linkText("Create an account")).click();
		
		Thread.sleep(6000);
		driver.close();

	}

}
