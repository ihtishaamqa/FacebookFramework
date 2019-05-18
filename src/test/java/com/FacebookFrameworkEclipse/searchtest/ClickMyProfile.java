package com.FacebookFrameworkEclipse.searchtest;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.LogInPage;

public class ClickMyProfile extends LogInPage{
	
	@BeforeTest
	public void init() {
		beforetest();
		
	}
	
	@Test
	public void verifyProfileClickable() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Peter Parker")).isDisplayed();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"u_fetchstream_1_8\"]/li[2]/a")).click();
		driver.quit();
	}

}
