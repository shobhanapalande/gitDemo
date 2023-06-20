package com.mvn.gitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class Test1 {
	public static void main(String []args ) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");

		//creating obj of chromedrivr using webdriver interface
		WebDriver d = new ChromeDriver ();
		//get webPage of particular url
		d.get("https://www.tutorialspoint.com/index.htm");

		System.out.println(d.getTitle());         // get webPage title
		d.navigate().refresh();                   //to refresh 

		System.out.println(d.getCurrentUrl());
		d.close();
	}
}
	
