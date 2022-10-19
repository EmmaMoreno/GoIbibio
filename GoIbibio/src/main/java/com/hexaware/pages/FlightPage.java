package com.hexaware.pages;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.hexaware.base.IBIBase;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class FlightPage extends IBIBase {
		
		public void FlyFirstScreen() {
			web.findElement(By.xpath("//p[text()='Enter city or airport']")).click();
			WebElement from1 = web.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[1]/div/div[2]/div/input"));
			from1.sendKeys(properties.getProperty("from"));
			
			//WebDriverWait wait = new WebDriverWait(web, Duration.ofSeconds(10));
			//Thread.sleep(4000);
			web.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
			web.findElement(By.xpath("//*[@id='autoSuggest-list']/li[1]/div/div[1]/div/p[1]/span[1]")).click();
			WebElement to1 = web.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div/div[1]/div[2]/div/div[2]/div/input"));
			to1.sendKeys(properties.getProperty("to"));
			//Thread.sleep(4000);
			web.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			web.findElement(By.xpath("//*[@id='autoSuggest-list']/li[1]/div")).click();
			
			web.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[3]/p[1]")).click();
			//driver.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[5]")).click();
			web.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
			web.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
			web.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div[3]/span")).click();
			screenShot("Flight/Page one Checked");
			//Thread.sleep(40000);
			web.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		
		public void FlySecondScreen() {
			web.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/button")).click();
			//Thread.sleep(2000);
			web.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			try {
			//driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/span/span"));
				web.findElement(By.xpath("//*[@id=\'root\']/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/span/span")).click();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("\n No confirmation \n");
			}
			screenShot("Flight/Page two Checked");
			web.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//Thread.sleep(3000);
		}
		
		public void FlyThirdScreen() {
			web.findElement(By.xpath("//*[@id=\'insurance_section\']/div/div[2]/div[5]/div/button[2]")).click();
			web.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div[6]/div[3]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/select")).click();
			web.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div[6]/div[3]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/select/option[2]")).click();
			WebElement first1 = web.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[6]/div[3]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/input"));
			first1.sendKeys(properties.getProperty("first"));
			WebElement last1 = web.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[6]/div[3]/div[2]/div[2]/div[2]/div/div[2]/div/div[3]/input"));
			last1.sendKeys(properties.getProperty("last"));
			WebElement email1 = web.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[6]/div[3]/div[2]/div[3]/div[2]/div/div[1]/input"));
			email1.sendKeys(properties.getProperty("email"));
			web.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[6]/div[3]/div[2]/div[4]/div[2]/div[1]/select")).click();
			web.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div[6]/div[3]/div[2]/div[4]/div[2]/div[1]/select/option[122]")).click();
			WebElement num1 = web.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div[6]/div[3]/div[2]/div[4]/div[2]/div[2]/input"));
			num1.sendKeys(properties.getProperty("num"));
			
			web.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[6]/div[4]/button")).click();
			//Thread.sleep(1000);
			web.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			web.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[6]/div[1]/div/div/span")).click();
			//Thread.sleep(20000);
			web.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web.findElement(By.xpath("//*[@id='tab_card']/div[2]/div")).click();
			//Thread.sleep(1000);
			screenShot("Flight/Page three Checked");
			web.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			//web.close();
			//Thread.sleep(1000);
		}
		
	}