package Question2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.weightwachers.base.TestBase;

public class FoodServingTest extends TestBase {
	
	FoodServingsPages foodservingpage;
	
	public FoodServingTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		 initialization();
		 foodservingpage = new FoodServingsPages();
	}
	
	
	//@Test(priority=1)
	public void verify_displayItems() {
		String foodTitles[] = foodservingpage.display3rd_5th_Item();
		for (String item: foodTitles) {
	        System.out.println(item);
	    }
	}
	
	
	@Test(priority=2)
	public void verify_allItems() {
		 foodservingpage.display_all_Item();
		
	}
	
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
