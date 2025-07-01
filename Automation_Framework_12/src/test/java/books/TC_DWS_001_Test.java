package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass{
	@Test
	public void clickOnBooks()
	{
//		ExtentTest test = ereport.createTest("clickOnBooks");
//		test.log(Status.INFO, "Login is completed");
		
		HomePage hp = new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
		
	}
}
