package com.selenium.MavenExample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitEx {

	
	@BeforeClass
	public static void launchBrowser()
	{
		System.out.println("launching...");
	}
	@AfterClass
	public static void closeBrowser() {
		
		System.out.println("closing..");
	}
 @Before
 public void startTime() {
	System.out.println("start");
}
 @After
 public void endTime() {
	System.out.println("end");
}
 @Test
 public void aText() {
	System.out.println("aaaa");

}
 @Test
 public void zText() {
	System.out.println("zzzz");
}
 @Test
 public void cText() {
	System.out.println("cccc");

}
}
