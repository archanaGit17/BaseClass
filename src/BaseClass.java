import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
   static WebDriver driver;
   public static WebDriver browserLaunch()
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\AdactinHotel\\driver\\chromedriver.exe");
	   driver =new ChromeDriver();
	   return driver;
   }
   public static void loadUrl(String url)
   {
	   driver.get(url);
   }  
   public static void fillText(WebElement e,String value)
   {
	   e.sendKeys(value);
   }   
   public static void buttonClick(WebElement e)
   {
	   e.click();
   }  
   public static void ddSelectByIndex(WebElement e,int index)
   {
	   Select s=new Select(e);
	   s.selectByIndex(index);
   } 
   public static void ddSelectByValue(WebElement e,String value)
   {
	   Select s=new Select(e);
	   s.selectByValue(value);
   } 
   
   public static void get_Attribute(WebElement e)
   {
	  String att= e.getAttribute("value");
	   System.out.println(att);
   }
   
}
