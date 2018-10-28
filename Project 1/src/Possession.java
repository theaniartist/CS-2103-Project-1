
public class Possession extends InanimateAccount
{
	private Person owner;
	private float price;
	
	public Possession(String name, Image image, Person owner, float price)
	{
		super(name, image);
		this.owner = owner;
		this.price = price;
	}
	
	public float getPrice()
	{
		return price; 
	}
}
