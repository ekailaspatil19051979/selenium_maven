package com.testNG.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerfiyTestNG {
	
	@Test
	void launch() throws InterruptedException {
		WebDriverManager.chromedriver().browserVersion("124").setup();
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/indices/bse/sensex");
		driver.manage().window().maximize();
		Thread.sleep(25000);
		driver.quit();
	}

}
