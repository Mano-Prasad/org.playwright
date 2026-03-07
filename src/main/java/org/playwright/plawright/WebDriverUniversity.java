package org.playwright.plawright;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WebDriverUniversity {

	public static void main(String[] args) throws InterruptedException {

		Playwright pw = Playwright.create();
		
		Page page = pw.chromium().launch(new LaunchOptions().setHeadless(false)).newPage();
		
		page.navigate("https://webdriveruniversity.com/Contact-Us/contactus.html");
		
		Thread.sleep(5000);
		
		System.out.println("Page Title is : "+ page.title());

		page.locator("//input[@name='first_name' and @placeholder='First Name']")
		.fill("Mano Prasad");
		
		page.locator("//input[starts-with(@placeholder,'Last')]").fill("R");
		
		page.locator("//input[contains(@placeholder,'Address')]").fill("manoprasad@gmail.com");
		
		page.locator("//textarea[contains(@placeholder,'ments')]").fill("Hello WebDriver University");
		
		page.locator("//input[@value='SUBMIT']").click();
		
		Thread.sleep(4000);
		
		String text = page.locator("//h1[contains(text(),'Thank You')]").innerText();
		
		System.out.println(text);
		
		page.close();
		
		// pw.close();
		
		
	}

}
