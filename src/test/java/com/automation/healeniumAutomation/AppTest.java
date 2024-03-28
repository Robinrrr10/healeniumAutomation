package com.automation.healeniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;

public class AppTest 
{
  
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Starting....");
        
        SelfHealingDriver driver = null;
        
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        System.out.println("qqq....1");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[1]/input")).sendKeys("admin");
        System.out.println("qqq...2.");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("admin");
        System.out.println("qqq...3.");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        System.out.println("qqq...4.");
        
        driver.quit();
        System.out.println("Done");
    }
 
    @Test
    public void sample2()
    {
        System.out.println("Starting....");
        
        SelfHealingDriver driver = null;
        
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
        driver.get("http://192.168.136.132/sample.html");
        driver.findElement(By.name("username")).sendKeys("Working");
        delay(5);
        driver.quit();
        System.out.println("Done");
    }
    
    private void delay(int sec) {
    	try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
