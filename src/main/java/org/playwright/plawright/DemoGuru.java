package org.playwright.plawright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class DemoGuru {
	public static void main(String[] args) throws InterruptedException {
		
		Playwright pw = Playwright.create();		
		
		Browser bw = pw.chromium().launch(new LaunchOptions().setHeadless(false));
		
		Page page = bw.newPage();
		
		page.navigate("https://demo.guru99.com/test/newtours/register.php");
		
		System.out.println("Page Title is : "+ page.title());
		
		Thread.sleep(5000);
		
		page.locator("//input[@name='firstName']").fill("Mano Prasad");
		
		page.locator("//input[@name='lastName']").fill("R");
		
		page.locator("//input[@name='phone']").fill("9876543210");
		
		page.locator("//input[@name='userName' and @id='userName']").fill("manoprasad@gmail.com");
		
		page.locator("//input[contains(@name,'address1')]").fill("No.76, Nehruji Nagar 8th street, Enathur");
		
		page.locator("//input[contains(@name,'city')]").fill("Kanchipuram");
		
		page.locator("//input[contains(@name,'state')]").fill("Tamil Nadu");
		
		page.locator("//input[starts-with(@name,'postal')]").fill("635469");
		
		Locator country = page.locator("//select[starts-with(@name,'country')]");
		
		country.selectOption(new SelectOption().setValue("INDIA"));
		
		page.locator("//input[starts-with(@name,'ema')]").fill("manoprasad@gmail.com");
		
		page.locator("//input[@name='password']").fill("12345678");
		
		page.locator("//input[starts-with(@name,'confirm')]").fill("12345678");
		
		Thread.sleep(3000);
		
		page.locator("//input[starts-with(@name,'submit')]").click();
		

		String registered = page.locator("//font[contains(text(),'Thank you')]").innerText();
		
		System.out.println(registered);
		
		 page.close();
		 bw.close();

		 pw.close();
		

		
	}

}
