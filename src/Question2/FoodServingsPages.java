package Question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weightwachers.base.TestBase;

public class FoodServingsPages  extends TestBase {
	
	//Page Factory
	@FindBy(xpath="//div[@class='itemContent']/span[5]")	
	WebElement thirdItem;
	
	@FindBy(xpath="//div[@class='itemContent']/span[9]")	
	WebElement fifthItem;
	
	@FindBy(xpath="//*[@ng-bind='food.name']")
	public List<WebElement> food_names;
	
	@FindBy(xpath="//*[@ng-bind='food._servingDesc']")
	public List<WebElement> serving;
	

	public FoodServingsPages() {
		PageFactory.initElements(driver, this);
	}
	
	public String[] display3rd_5th_Item(){
		String third_Food_item = thirdItem.getText();
		String fifth_Food_item = fifthItem.getText();
		return new String[] { third_Food_item, fifth_Food_item };
	}
	
	public void display_all_Item(){
		
		List allfood_name  = new ArrayList();
		List all_serving  = new ArrayList();
		
		
		for (WebElement food_name : food_names) {
		    HashMap<String, String> item_name = new HashMap<String, String>();
		    item_name.put("FoodName",food_name.getText());
		    allfood_name.add(item_name); // adding map to list
		}
		
		for (WebElement sv : serving) {
			HashMap<String, String> servings = new HashMap<String, String>();
			servings.put("Servings",sv.getText());
			all_serving.add(servings); // adding map to list
		}
		System.out.println(allfood_name);
		System.out.println(all_serving);
		
		
	}
	

}
