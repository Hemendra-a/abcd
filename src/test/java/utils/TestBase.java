
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileReader;
public class TestBase {
	public static WebDriver driver;

public WebDriver WebDriverManager() throws IOException{
	FileInputStream fis=new FileInputStream("src/test/resources/global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty("QAUrl");
	if(driver==null) {
		if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();//driver get the life
	driver.manage().window().maximize();
	

	
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();//driver get the life
			driver.manage().window().maximize();
		}

   
	driver.navigate().to(value);//url 
	
	}
	return driver;
   
}
public static void executionDelay(int n) {
	try {
		Thread.sleep(n * 1000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
}
public  WebElement waitForElementToBeClickable(WebElement webelement, int seconds) {
	WebDriverWait wait = new WebDriverWait(driver, seconds);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));
	return element;

}

public  WebElement waitForElementToBeVisible(WebElement webelement, int seconds) {
	WebDriverWait wait = new WebDriverWait(driver, seconds);
	WebElement element = wait.until(ExpectedConditions.visibilityOf(webelement));
	return element;

}

public  List<WebElement> waitForElementToBeVisible1(List<WebElement> ele, WebDriver driver2, int seconds) {
	WebDriverWait wait = new WebDriverWait(driver, seconds);
	List<WebElement> element = wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	return element;
	
}
public void SelectByvalue(WebElement ele,String text) {
	   Select gen=new Select(ele);
	     gen.selectByValue(text);
}
public void SelectByIndex(WebElement ele,int a) {
	   Select gen=new Select(ele);
	     gen.selectByIndex(a);
	     
}
public String ReadGetDataFromJson(String testname,String key,int a) {
	String value="";
	String value2="";
	ArrayList<String>li=new ArrayList<String>();
	  try {
			JSONParser jsonparser = new JSONParser();
			FileReader reader=new FileReader("src\\test\\resources\\global.json");
			Object obj=jsonparser.parse(reader);
			JSONObject jsonobj=(JSONObject)obj;
			JSONArray jsonarray=(JSONArray) jsonobj.get(testname);
			for (int i=0;i<jsonarray.size();i++) {
				JSONObject JSONObjectdata=(JSONObject)jsonarray.get(i);
				@SuppressWarnings("unchecked")
				Set<String>keys=JSONObjectdata.keySet();
				for(int j=0;j<=keys.size()-1;j++) {
				if (keys.contains(key)) {
					value=(String)JSONObjectdata.get(key);	
				}
				}
				li.add(value);
			}
			 value2=li.get(a); 
	} catch (Exception e) {
		e.printStackTrace();
	}
	return value2;
}
public void mousehower(WebElement ele) {
	try {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();//when we need to perform sigle actions then used .perform
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}

