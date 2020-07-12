package com.INDBanking.testCases;

import java.io.IOException;


import org.testng.annotations.Test;

import com.INDBanking.BaseClass.BaseClass;
import com.INDBanking.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException
	{
		
		
	    logger.info("URL is open");
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(baseUsername);
		logger.info("Enter usrname");
		lp.setPassword(basePassword);
		
		logger.info("Enter Password");
		lp.setLoginbtn();
		logger.info("Click on submit button");
		System.out.println("Login Successfully" + "Adding new code to repository");
		
		
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test pass");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertFalse(false);
			logger.info("Login test fail");
		}
	}
}

