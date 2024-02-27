package testscripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import pomPages.HomePage;
@Test
public class variableProducts extends Baseclass {

	 public void testProduct() throws IOException, InterruptedException {

	HomePage p = new HomePage(driver);
	Thread.sleep(20000);

	//driver.navigate().refresh();
	try {
		WebDriverWait wait = new WebDriverWait(driver, 20);
        //WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(p.getcloseButton()));
        // Attempt to close the popup window
        p.closeBtn();
        System.out.println("Popup window closed successfully.");
    } catch (Exception e) {
        System.out.println("Unable to close the popup window: " + e.getMessage());
    }
	driverutilies.mouseHover(driver,p.getShop());
	Thread.sleep(10000);
	p.BioAcousticmat();


}
}
