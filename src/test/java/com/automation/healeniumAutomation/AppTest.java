package com.automation.healeniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;

public class AppTest 
{
 
    @Test
    public void selfHealingUsingHealenium()
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
