import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO_4 extends BaseClass
{
	public POJO_4()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement f_name;
	
	@FindBy(id="last_name")
	private WebElement l_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement card_num;
	
	@FindBy(id="cc_type")
	private WebElement card_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiry_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiry_year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv_num;
	
	@FindBy(id="book_now")
	private WebElement book_btn;
	

	public WebElement getF_name() {
		return f_name;
	}

	public WebElement getL_name() {
		return l_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_num() {
		return card_num;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv_num() {
		return cvv_num;
	}

	public WebElement getBook_btn() {
		return book_btn;
	}
	
	
}
