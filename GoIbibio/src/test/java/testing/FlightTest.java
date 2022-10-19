package testing;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hexaware.base.IBIBase;
import com.hexaware.pages.FlightPage;

public class FlightTest extends IBIBase {
	
	FlightPage FP;

	@BeforeMethod
	public void browserSetUp() {
		setUp();	
		FP = new FlightPage();
		}
	
	@Test(priority = 1)
	public void FirstTest() {
		FP.FlyFirstScreen();
		logger.info("First Screen Checked");
	}
	
	@Test(priority = 2)
	public void SecondTest() {
		FP.FlyFirstScreen();
		FP.FlySecondScreen();
		logger.info("Second Screen Checked");
	}
	
	/*
	@Test(priority = 1)
	public void ThirdTest() {
		FP.FlyFirstScreen();
		FP.FlySecondScreen();
		FP.FlyThirdScreen();
		logger.info("Third Screen Checked");
	}
	*/
	
	@Test(priority = 3)
	public void AllStepsTest() {
		FP.FlyFirstScreen();
		FP.FlySecondScreen();
		FP.FlyThirdScreen();
		logger.info("All Screens Checked");
	}
	
	@AfterMethod
	public void Close() {
		CloseWebPage();
		
	}
	
}