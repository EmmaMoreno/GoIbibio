package testing;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hexaware.base.IBIBase;
import com.hexaware.pages.LogPage;

public class LogTest extends IBIBase {
	
	LogPage LP;

	@BeforeMethod
	public void browserSetUp() {
		setUp();	
		LP = new LogPage();
		}
	
	
	@Test(priority = 1)
	public void FirstTest() {
		LP.NumberScreen();
		logger.info("Log Number Checked");
	}
	
	/*
	@Test(priority = 1)
	public void AllTest() {
		LP.NumberScreen();
		LP.OTPScreen();
		logger.info("Log Number and OTP Checked");
	}
	*/
	
	@AfterMethod
	public void Close() {
		CloseWebPage();
		
	}
	
}
