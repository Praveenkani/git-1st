package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Automation Testing\\training progrmas\\Test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement se = driver.findElement(By.xpath("//input[(@name='q')]"));
		
		
	}
	

}
