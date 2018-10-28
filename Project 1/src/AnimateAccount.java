
import java.util.ArrayList;

public abstract class AnimateAccount extends Account //Should this be abstract ASK OFFICE HOURS.
{
	private ArrayList friends;
	private ArrayList <Moment> moments;
	
	public AnimateAccount(String name, Image image)
	{
		super(name, image);
	}
	
	public void setFriends(ArrayList friends)
	{
		this.friends = friends;
	}
	
	public void setMoments(ArrayList moments)
	{
		this.moments = moments;
	}
	
	public ArrayList getFriends()
	{
		return friends;
	}
	
	public void addFriend(AnimateAccount friend)
	{
		friends.add(friend);
	}
}