package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Nagalakshmi");
		driver.findElement(By.id("lastNameField")).sendKeys("Selvam");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("NL");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("SV");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("create contact assignment");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("lakshminaga612@gmail.com");
		WebElement stateDD = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		//call select class
		Select sec = new Select(stateDD);
		//select by visibletext
		sec.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}

}
