package Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		1. Launch the browser.
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		2. Provide the URL of Modus Webapp Home
		driver.get("https://modusretail.azurewebsites.net/Pages/Hierarchy/home.aspx");
		
//		3. Provide Log-in credentials.
		Thread.sleep(2000);
		driver.findElement(By.id("i0116")).sendKeys("QA-Assignment@outlook.com");
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("i0118")).sendKeys("qa-assign10");
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("acceptButton")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		4. Click on Operating Model
		driver.findElement(By.id("MainContent_M_HomeControl_dtlist1_hypModule1_1")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		5. Click on Operating Model Submodule X
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div[3]/div[2]/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.id("MainContent_M_SubModulesControl1_rptAccordianContent_dtlist_2_hypModule_33")).click();
		
//		6. Click on Add Header Level button.
		driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/button[1]/span[2]")).click();
		
//		7. Click on Save button.
		driver.findElement(By.id("txtHeaderTitle")).sendKeys("Testing1 Nan");
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(2000);
//		8. Click on OK button of Successful Header Level alert popup.
		Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        
//		9. Click on Add icon of created Header Level
        driver.findElement(By.xpath("//div[@leveloneid='12158']")).click();
        
//		10. Enter Title “Test Automated Level Zero C1”
        driver.findElement(By.id("txtTitle")).sendKeys("Test Automated Level Zero C1");
        
//		11. Enter Description “Description L0 C1”
        driver.findElement(By.id("txtDescription")).sendKeys("Description L0 C1");
        
//		12. Select Publish Checkbox of L0 popup.
        driver.findElement(By.id("chk")).click();
        
//		13. Click on Save button.
        driver.findElement(By.xpath("//button[@onclick='InsertUpdateLevelZero();']")).click();
        
        Thread.sleep(3000);     
//		14. Click on OK button of Successful Level Zero alert popup.
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        Thread.sleep(3000); 
//        
////		15. Click on Add icon of Level Zero
        driver.findElement(By.xpath("//img[@leveloneid='12337']")).click();
        
////		16. Enter Title “Test Automated Level One C1”
        driver.findElement(By.id("txtTitleLevelOne")).sendKeys("Test Automated Level One C1");
        
////		17. Enter Description “Description L1 C1”
        driver.findElement(By.id("txtDescriptionLevelOne")).sendKeys("Description L1 C1");
        
////		18. Enter Short Description “L1A”
        driver.findElement(By.id("txtShortDescriptionLevelOne")).sendKeys("L1A");
        
////		19. Select Team as Business Team
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[6]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[6]/div[2]/span/span/div/ul/li[3]/a/label/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[6]/div[2]")).click();
        
        Thread.sleep(2000);
//		20. Select Department as Business Department
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[7]/div[2]/span/span/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[7]/div[2]/span/span/div/ul/li[4]/a/label/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[7]/div[2]/span/span/div/button/span")).click();
        
        Thread.sleep(2000);
//		21. Select Role as Business Owner
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[8]/div[2]/span/span/span/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[8]/div[2]/span/span/span/div/ul/li[5]/a/label/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div[8]/div[2]/span/span/span/div/button")).click();
        
        Thread.sleep(2000);
//		22. Select Publish Checkbox of Level One popup.
        driver.findElement(By.id("chkLevelOne")).click();

//		23. Click on Save button.
        driver.findElement(By.xpath("//button[@onclick='InsertUpdateLevelOne();']")).click();
        
        Thread.sleep(3000); 
//		24. Click on OK button of Successful Level One alert popup.
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(3000); 
        
//		For Reverse Automation of Assignment 2
//		23. Click on Delete icon of created Level One
        driver.findElement(By.xpath("//img[@onclick='DeleteLevels(12008)']")).click();
//        
        Thread.sleep(2000);
//		24. Click on OK button of Level One delete alert popup
        Alert alert3 = driver.switchTo().alert();
        alert3.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.switchTo().alert().accept();
        
//		25. Click on Delete icon of created Level Zero
        driver.findElement(By.xpath("//img[@onclick='DeleteLevels(11891)']")).click(); 
        Thread.sleep(2000);
//		26. Click on OK button of Level Zero delete alert popup
        Alert alert4 = driver.switchTo().alert();
        alert4.accept();
        Thread.sleep(2000);
        
        driver.switchTo().alert().accept();
        
//		27. Click on Delete icon of created Header Level
        driver.findElement(By.xpath("//div[@onclick='DeleteLevels(11879)']")).click();
//		28. Click on OK button of Header Level delete alert popup
        Thread.sleep(2000);
        Alert alert5 = driver.switchTo().alert();
        alert5.accept();
        Thread.sleep(2000);
        
        driver.switchTo().alert().accept();
        
	}

}
