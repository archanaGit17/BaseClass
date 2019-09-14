import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO_3 extends BaseClass
{
	public POJO_3()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement select;
	
	@FindBy(id="continue")
	private WebElement contd_btn;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContd_btn() {
		return contd_btn;
	}
	
}
