package myMvnProject01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mytest01 extends framework.BasicTest {
	@Test
	public void BasicTest() {
		WebElement partialLinktest=driver.findElement(By.partialLinkText("Partial Link"));
		Assert.assertEquals(partialLinktest.getText(), "Partial Link Test"); 
		WebElement linktext=driver.findElement(By.linkText("Link Test")) ;
		Assert.assertEquals(linktext.getText(), "Link Test"); 
	}

}
