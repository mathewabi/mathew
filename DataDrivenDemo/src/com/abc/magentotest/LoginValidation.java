package com.abc.magentotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ihass\\Desktop\\JulyUc3\\DataDrivenDemo\\src\\com\\abc\\utilities\\DataDriven.properties");
		Properties p = new Properties();
		p.load(fis);
		
//		String nurl = p.getProperty("url");
	    String nurl = p.getProperty("url");
		String nusername = p.getProperty("username");
		String npassword = p.getProperty("password");
		
		System.out.println(nurl);
		System.out.println(nusername);
		System.out.println(npassword);
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(nurl);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(nusername);
		driver.findElement(By.id("pass")).sendKeys(npassword);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		*/
		
		
	}

}
