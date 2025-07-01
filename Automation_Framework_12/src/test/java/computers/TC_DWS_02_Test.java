package computers;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_02_Test extends BaseClass{
	@Test
	public void clickOnComputers()
	{
//		ExtentTest test = ereport.createTest("clickOnComputers");
//		test.log(Status.INFO, "Login is completed");
		
		HomePage hp = new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "computers page is not displayed");
		test.log(Status.PASS, "Computers page is displayed");
	}
}
