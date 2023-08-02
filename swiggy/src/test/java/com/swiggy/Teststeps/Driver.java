package com.swiggy.Teststeps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.swiggy.pages.Food;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.Restaurant;
import com.swiggy.pages.Signin;

public class Driver extends Tools{
	protected static LandingPage landingpage;
	protected static Restaurant restaurant;
	protected static Food food;
	protected static Signin signin;
	
	public static void init() {
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("win")){			
			driver = new ChromeDriver();
		}
		    
		else if (os.contains("nix") || os.contains("aix") || os.contains("nux")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");			
			driver = new ChromeDriver(options);
		}
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		landingpage = new LandingPage(driver);
		restaurant = new Restaurant(driver);
		food = new Food(driver);
		signin = new Signin(driver);
	}
}
