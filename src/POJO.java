import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO extends BaseClass
{
  
	public POJO()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user_name;
	
	@FindBy(id="password")
	private WebElement pass_word;
	
	@FindBy(id="login")
	private WebElement Log_btn;

	public WebElement getUser_name() 
	 {
		return user_name;
	 }

	public WebElement getPass_word() 
	 {
		return pass_word;
	 }

	public WebElement getLog_btn() 
	 {
		return Log_btn;
	 }
}
