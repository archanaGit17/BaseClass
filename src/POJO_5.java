import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO_5 extends BaseClass
{
	public POJO_5()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='disable_text'])[15]")
	private WebElement order;
	
	
	public WebElement getOrder() {
		
		
		return order;
	}

	
}
