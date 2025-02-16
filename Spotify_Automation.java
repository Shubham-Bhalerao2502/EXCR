package com.spotify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class Spotify_Automation {
	WebDriver ob;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/abc/eclipse-workspace/codnera/Epsilon_QA/src/test/resources/Driver1/chromedriver.exe");
		ob=new ChromeDriver();
		ob.manage().window().maximize();
		
		
	}
	

	
	@Test(priority = 1)
	public void url() throws InterruptedException
	{
		
		ob.get("https://laptopsmobiles.myshopify.com/");
		
		WebElement pass=ob.findElement(By.id("password"));
		pass.sendKeys("Nok5233@");
		
		WebElement passbtn=ob.findElement(By.xpath("//button[@type='submit']"));
		passbtn.click();
		
		
	}
	
	@Test(priority = 2)
	public void product() throws InterruptedException
	{
	
		Thread.sleep(2000);
		WebElement dellprod=ob.findElement(By.id("Slide-template--23915209392446__collection_list-1"));
		dellprod.click();
		
		Thread.sleep(2000);
		
		WebElement delladdcart=ob.findElement(By.xpath("//button[@name='add']"));
		delladdcart.click();
		
		Thread.sleep(2000);
		WebElement home=ob.findElement(By.xpath("//a[@id='HeaderMenu-home']"));
		home.click();
		
	}
	@Test(priority = 3)
	public void product2() throws InterruptedException
	{
		
		
		Thread.sleep(2000);
		WebElement dellprod=ob.findElement(By.id("Slide-template--23915209392446__collection_list-3"));
		dellprod.click();
		
		Thread.sleep(2000);
		
		WebElement delladdcart=ob.findElement(By.xpath("//button[@name='add']"));
		delladdcart.click();
			
		
	}
	@Test(priority = 4)
	public void verify() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement delladdcart=ob.findElement(By.xpath("//a[@href='/cart']"));
		delladdcart.click();
		
		String s="https://laptopsmobiles.myshopify.com/cart";
		
		String s1=ob.getCurrentUrl();
		Assert.assertEquals(s, s1);
		
		ob.close();
	}


}
