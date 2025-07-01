package giftcards;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_003_Test extends BaseClass{
	@Test
	public void clickOnGiftCards()
	{
//		ExtentTest test = ereport.createTest("clickOnGiftCards");
//		test.log(Status.INFO, "Login is Completed");
		
		HomePage hp = new HomePage(driver);
		hp.getGiftCardLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop . Giftcards", " Gift Cards page is not displayed");
		test.log(Status.PASS, "Giftcards page is displayed");
	}
}
