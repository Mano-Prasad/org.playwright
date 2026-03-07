package org.playwright.plawright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Open_chrome_browser {

	public static void main(String[] args) throws InterruptedException{
	Playwright pw =	Playwright.create();
	
	Browser bw =pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page =bw.newPage();

	page.navigate("https://www.google.com");
	page.close();
	pw.close();
	
	}
}
