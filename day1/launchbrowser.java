package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class launchbrowser {
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
		WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec=new Select(sourceDD);
		sec.selectByIndex(4);
		WebElement marketCamp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mark=new Select(marketCamp);
		mark.selectByVisibleText("Automobile");
		WebElement ownShip=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select oship=new Select(ownShip);
	    oship.selectByValue("OWN_CCORP");
	    driver.findElement(By.className("smallSubmit")).click();
	    System.out.println("Title is "+ driver.getTitle());
		//driver.close();
	}

}
