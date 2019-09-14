import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO_2 extends BaseClass
{
	public POJO_2()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement NumOfRooms;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement children;
	
	@FindBy(id="Submit")
	private WebElement Sub_btn;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumOfRooms() {
		return NumOfRooms;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSub_btn() {
		return Sub_btn;
	}
}
