package com.FacebookFrameworkEclipse.searchtest;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.LogInPage;

public class HomePageSearchTest extends LogInPage{
	
	@BeforeTest
	public void init() {
		beforetest();
		
	}
	
@Test
public void VerifysearchButton() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("Ihtishaam Ul Hassan");
	Thread.sleep(5000);
	//System.out.println(driver.findElement(By.xpath("//*[@id=\"u_c_2\"]/input[2]")).getSize());
	
	
}
}
