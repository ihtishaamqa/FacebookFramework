package com.facebook;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LogInPage {
	public WebDriver driver;
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		 driver = new ChromeDriver(options);
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ihtishaamulhassanqa@gmail.com");
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Soldier1996.");
driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
}
}