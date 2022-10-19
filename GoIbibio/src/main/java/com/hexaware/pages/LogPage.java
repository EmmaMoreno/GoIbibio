package com.hexaware.pages;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.hexaware.base.IBIBase;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LogPage extends IBIBase {
		
		public void NumberScreen() {
			web.findElement(By.xpath("//*[@id=\'root\']/div[1]/div/header/div[2]/div")).click();
			WebElement log1 = web.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div/input"));
			log1.sendKeys(properties.getProperty("num"));
			
			WebElement button1 = web.findElement(By.xpath("//*[@id='root']/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/input"));
			button1.click();
			web.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebElement button2 = web.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[1]/div/div/div[2]/span/span"));
			button2.click();
//			try {
//				web.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/input")).click();
//				} catch (org.openqa.selenium.NoSuchElementException e) {
//					System.out.println("\n No confirmation \n");
//				}
			screenShot("Log/Number Checked");
			web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
		
		public void OTPScreen() {
			web.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[1]/div[1]/input")).sendKeys("1");
			web.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/input")).sendKeys("2");
			web.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/input")).sendKeys("3");
			web.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[1]/div[4]/input")).sendKeys("4");
			screenShot("Log/OTP Checked");

			web.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
}