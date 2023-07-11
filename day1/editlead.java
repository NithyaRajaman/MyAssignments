package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editlead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUsername=driver.findElement(By.id("username"));
		eleUsername.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QAAUTOMATION");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("SeleniumLearning");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithu.nithya91@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statePro=new Select(state);
		statePro.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
