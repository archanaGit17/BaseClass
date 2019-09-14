import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinBooking extends BaseClass
{
 public static void main(String[] args) 
  {
	browserLaunch();
	loadUrl("http://adactin.com/HotelApp/");
	WebElement u=driver.findElement(By.id("username"));
	fillText(u,"archS1234");
	WebElement p=driver.findElement(By.id("password"));
	fillText(p,"123456");
	WebElement l=driver.findElement(By.id("login"));
	buttonClick(l);
	WebElement loc=driver.findElement(By.id("location"));
	ddSelectByIndex(loc,8);
	WebElement hotel=driver.findElement(By.id("hotels"));
	ddSelectByIndex(hotel,2);
	WebElement roomtype=driver.findElement(By.id("room_type"));
	ddSelectByIndex(roomtype,3);
	WebElement roomcount=driver.findElement(By.id("room_nos"));
	ddSelectByIndex(roomcount,1);
	WebElement checkIn=driver.findElement(By.id("datepick_in"));
	fillText(checkIn,"18/08/2019");
	WebElement checkOut=driver.findElement(By.id("datepick_out"));
	fillText(checkOut,"23/08/2019");
	WebElement adult=driver.findElement(By.id("adult_room"));
	ddSelectByIndex(adult,2);
	WebElement child=driver.findElement(By.id("child_room"));
	ddSelectByIndex(child,2);
	WebElement sub=driver.findElement(By.id("Submit"));
	buttonClick(sub);
	WebElement radiobtn=driver.findElement(By.id("radiobutton_0"));
	buttonClick(radiobtn);
	WebElement contd=driver.findElement(By.id("continue"));
	buttonClick(contd);
	
  }
}
