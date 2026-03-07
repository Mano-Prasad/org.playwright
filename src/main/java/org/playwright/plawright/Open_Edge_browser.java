package org.playwright.plawright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Open_Edge_browser {
	public static void main(String[] args) {

		Playwright pw = Playwright.create();
		
		Browser bw =pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
		
		 BrowserContext context = bw.newContext(
			        new Browser.NewContextOptions().setViewportSize(300,200));
		 
		
		Page page = bw.newPage();
		
		page.navigate("https://www.google.com");
		
		page.navigate("https://www.facebook.com");
		
		page.goBack();
		
		page.reload();
		
		page.goForward();
		
		page.reload();
		
		page.navigate("https://www.instagram.com");
		
		System.out.println(page.title());
		
		System.out.println(page.url());
		
	    page.goBack();
	    
	    page.close();
	    pw.close();
		
		
		
		
	}
}
