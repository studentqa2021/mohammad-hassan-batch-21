// frame work code 

package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {

	public void getLogin() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // driver path

		WebDriver driver = new ChromeDriver();// Yes == up casting
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

//		WebElement signInButton = driver.findElement(By.xpath("//*[@class='login']")); // version 2
//		signInButton.click();

		WebElement Username = driver.findElement(By.xpath("//*[@name='userName']"));
		Username.sendKeys("smarttech");
		
		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("student");
		
		WebElement lastSigninButton = driver.findElement(By.xpath("//*[@name='submit']"));
		lastSigninButton.click();
		// driver.findElement(By.xpath("//*[@class='login']")).click(); // version 1 way
		
//		driver.quit();
	}

}
