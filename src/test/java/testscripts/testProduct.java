package testscripts;



import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import pomPages.HomePage;
import pomPages.checkOut;
import pomPages.minibiomat;
@Test
public class testProduct extends Baseclass {



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

	//driverutilies.alertPopup(driver);
	Thread.sleep(10000);
	driverutilies.mouseHover(driver,p.getShop());
	Thread.sleep(10000);
	p.minibiomat();
	Thread.sleep(5000);


	minibiomat m = new minibiomat(driver);
	Thread.sleep(10000);
	 m.selectProduct();
	 Thread.sleep(5000);
	 m.positiveBtn();
	 Thread.sleep(5000);

	 m.negativeBtn();
	 Thread.sleep(5000);

	 m.qtyField();
	 Thread.sleep(5000);

	 m.addToCartBTN();
	 Thread.sleep(5000);
	 m.checkoutBTN();

	 checkOut checkOutPage = new checkOut(driver);
	 String actualtext = driverutilies.getText(checkOutPage.getText());
	 String expectedText = "Mini Biomat";
	 Thread.sleep(5000);
	 System.out.println(actualtext);
	 if(actualtext.equals(expectedText)) {
		 System.out.println("Product added succesfully on checkout page");
	 }

	 else {
		 System.out.println("Product is not added  on checkout page");
	 }
	 Thread.sleep(10000);

	 Reporter.log(driver.getCurrentUrl(), true);
	 Thread.sleep(10000);
}
}