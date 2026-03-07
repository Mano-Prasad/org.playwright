package org.playwright.plawright;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WebDriverUniversity {

	public static void main(String[] args) throws InterruptedException {

		Playwright pw = Playwright.create();
		
		Page page = pw.chromium().launch(new LaunchOptions().setHeadless(false)).newPage();
		
	}

}
