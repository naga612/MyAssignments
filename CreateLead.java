package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nagalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test123");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lakshminaga612@gmail.com");
		//ctrl+2,L
		//State or Province DropDown
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//call select class
		Select sec = new Select(stateDD);
		//select by visibletext
		sec.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}

}
