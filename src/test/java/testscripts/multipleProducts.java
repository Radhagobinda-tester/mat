package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.Baseclass;
import pomPages.HomePage;
import pomPages.bioacoustic_mat;

@Test
public class multipleProducts  extends Baseclass {
	  public void testProduct() throws IOException, InterruptedException {
		  
		  HomePage p = new HomePage(driver);
			Thread.sleep(20000);

			//driver.navigate().refresh();
			try {
				
		        //WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(p.getcloseButton()));
		        // Attempt to close the popup window
		        p.closeBtn();
		        System.out.println("Popup window closed successfully.");
		    } catch (Exception e) {
		        System.out.println("Unable to close the popup window: " + e.getMessage());
		    }

			//driverutilies.alertPopup(driver);
			Thread.sleep(10000);
			driverutilies.mouseHover(driver,p.getShop());
			Thread.sleep(10000); 
			
			p.BioAcousticmat();
			
			bioacoustic_mat b = new bioacoustic_mat(driver);
			Thread.sleep(10000); 
			b.selectProduct1();
			Thread.sleep(20000); 
			b.getDd2().click(); // Click on the dropdown
			Thread.sleep(2000); // Wait for dropdown options to appear (adjust as needed)
			b.yesBtn(); // Click on the "Yes" option
			Thread.sleep(20000);
			Thread.sleep(20000);
		    b.uploadBtn();
		    Thread.sleep(20000);
	 }
}
