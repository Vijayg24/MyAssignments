package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement((By.linkText("Create new account"))).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Pavithra");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Lakshmi");
		//Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("8012345796");
		//Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
		Thread.sleep(2000);
		WebElement DD = driver.findElement(By.id("day"));
		Select ddate = new Select(DD);
		ddate.selectByVisibleText("25");
	    Thread.sleep(2000);
	    WebElement mon = driver.findElement(By.id("month"));
	    Select dmonth = new Select(mon);
		dmonth.selectByVisibleText("Mar");
	    Thread.sleep(2000);
	    WebElement yr = driver.findElement(By.id("year"));
	    Select dyr = new Select(yr);
		dyr.selectByVisibleText("1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	}

}
