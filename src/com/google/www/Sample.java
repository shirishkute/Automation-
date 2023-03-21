package com.google.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	
	WebDriver rv=new FirefoxDriver();
	rv.get("https://www.facebook.com/");

	}
}
