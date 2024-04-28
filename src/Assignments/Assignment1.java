package Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ScreenRecorderUtil.startRecord("main");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		URL of Modus Webapp Home
		driver.get("https://modusretail.azurewebsites.net/Pages/Hierarchy/home.aspx");
		
//		Log-in credentials
		Thread.sleep(2000);
		driver.findElement(By.id("i0116")).sendKeys("QA-Assignment@outlook.com");
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("i0118")).sendKeys("qa-assign10");
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("acceptButton")).click();
		
//		Click on User Hierarchy
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"LINK\"]/div")).click();
		
//		Click on Manage Module
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_2")).click();
		
//		Click on 3rd page of Manage Module Table.
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div[3]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/div/div/table/tbody/tr[12]/td/table/tbody/tr/td[3]/a")).click();
		
		Thread.sleep(3000);
//		Click on View button of Operating Model
		driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnViewLevel_4")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Click on Add
		driver.findElement(By.id("MainContent_ModuleSubModule_btnAddNew")).click();
		
		Thread.sleep(2000);
//		Enter “Test Automated Value Chain (Your Name)” in Title field.
		driver.findElement(By.id("MainContent_ModuleSubModule_txtName")).sendKeys("Test Automated Value Chain(Nandan)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Select Modus QA Group.
		driver.findElement(By.xpath("//option[contains(text(),'M')]")).click();
		
//		Click on Submit
		driver.findElement(By.id("MainContent_ModuleSubModule_btnOkay")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/div[3]/div/ul[2]/li/span")).click();
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/div[3]/div/ul[2]/li/ul/ul/li/span")).click();
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/div[3]/div/ul[2]/li/ul/ul/li/ul/ul/li/ul[2]/li/label/input")).click();
		
		Thread.sleep(2000);
//		Click on Save
		driver.findElement(By.id("BtnSave_SubModulePermissionMapping UHAllbuttonColors")).click();
		
		Thread.sleep(2000);
//		Click on Ok button of Successful Submodule Feature alert popup.
		Alert alert = driver.switchTo().alert();
        alert.accept();
		
		Thread.sleep(2000);
//		Click on Save
		driver.findElement(By.id("btnSaveSubModuleFeatureMapping")).click();
		
		Thread.sleep(2000);	
//		Click on Ok button of Successful Submodule Feature alert popup.
		Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        
        Thread.sleep(2000);	
        
//		Select Role dropdown.
//		Select Business Owner
		driver.findElement(By.xpath("//option[contains(text(),'Business Role')]")).click();
		
//		//Click on Save
		driver.findElement(By.id("btnSaveFeatureRolePermissionMapping")).click();

		Thread.sleep(3000);
//		Click on OK button of Successful Role Feature alert popup
		Alert alert2 = driver.switchTo().alert();
        alert2.accept();
//		
//		// Click on Delete button o/f created Submodule
		driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnDelete_0")).click();
//		
		Thread.sleep(2000);
//	    Click on Yes button of delete alert popup.
		driver.findElement(By.id("MainContent_ModuleSubModule_btnDeleteModule")).click();
		
        driver.quit();
        
        ScreenRecorderUtil.stopRecord();
	}

}
