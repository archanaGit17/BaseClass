import org.openqa.selenium.WebElement;

public class Launch extends BaseClass
{
  public static void main(String[] args) throws InterruptedException 
   {
	  browserLaunch();
	  loadUrl("http://www.adactin.com/HotelApp/");
	  
	  POJO p= new POJO();
	  fillText(p.getUser_name(),"archS1234");
	  fillText(p.getPass_word(),"123456");
	  buttonClick(p.getLog_btn());
	  
	  POJO_2 a=new POJO_2();
	  ddSelectByIndex(a.getLocation(),5);
	  ddSelectByIndex(a.getHotels(),2);
	  ddSelectByIndex(a.getRoomType(),3);
	  ddSelectByIndex(a.getNumOfRooms(),2);
	  ddSelectByValue(a.getAdults(),"2");
	  ddSelectByIndex(a.getChildren(),2);
	  buttonClick(a.getSub_btn());
	  
	  POJO_3 b=new POJO_3();
	  buttonClick(b.getSelect());
	  buttonClick(b.getContd_btn());
	  
	  POJO_4 c=new POJO_4();
	  fillText(c.getF_name(),"Archana");
	  fillText(c.getL_name(),"Subbian");
	  fillText(c.getAddress(),"KCS Darshans Apts, Selaiyur, East Tambaram, Chennai-72");
	  fillText(c.getCard_num(),"4236710120308861");
	  ddSelectByIndex(c.getCard_type(),2);
	  ddSelectByIndex(c.getExpiry_month(),4);
	  ddSelectByIndex(c.getExpiry_year(),11);
	  fillText(c.getCvv_num(),"023");
	  buttonClick(c.getBook_btn());
	  
	  POJO_5 d=new POJO_5();
	  Thread.sleep(7000);
	  get_Attribute(d.getOrder());
	  
	  
   }
}
