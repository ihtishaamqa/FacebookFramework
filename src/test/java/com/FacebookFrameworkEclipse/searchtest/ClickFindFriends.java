package com.FacebookFrameworkEclipse.searchtest;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.LogInPage;

public class ClickFindFriends extends LogInPage{

		@BeforeTest
		public void init() {
			beforetest();
			
		}

		@Test 
		public void VerifyClickFindFriends() throws InterruptedException{
			driver.findElement(By.id("findFriendsNav")).click();
		}
			
		}