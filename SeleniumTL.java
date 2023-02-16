package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTL {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//EdgeDriver driver1=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaf Taps");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VijayaKumar");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindaraja");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vijay");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_description")).sendKeys("A software tester is also known as a software test engineer");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vijayg@gmail.com");
		Thread.sleep(2000);
	WebElement DD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd = new Select(DD);
	dd.selectByVisibleText("New York");
    driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_description")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("importantNote")).sendKeys("Please update the important things");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

//		driver2.get("https://account.kpostindia.com/login");
//		driver2.manage().window().maximize();
//		driver2.findElement(By.id("mat-input-0")).sendKeys("vijayakumarg");
//		driver2.findElement(By.id("mat-input-1")).sendKeys("123456");
//		driver2.findElement(By.id("loginbtns")).click();
//		
	
		//driver2.findElement(By.id("actmessage")).sendKeys("Prime Minister Narendra Modi has inaugurated the Sohna-Dausa stretch of the Delhi-Mumbai Expressway in Rajasthan's Dausa. The 246-kilometre stretch will benefit people travelling from Delhi to Rajasthan's capital Jaipur, who will now have an alternate and shorter route where travel time will be reduced by over an hour -- from five hours to around three and a half hours. It is also expected to boost economic opportunities in the entire region.");
//		String title1 = driver.getTitle();
//		System.out.println(title1);
	    
		
	}
}