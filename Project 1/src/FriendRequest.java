
public class FriendRequest 
{
	
	private AnimateAccount _friend1;
	private AnimateAccount _friend2;
	
	private boolean _friend1Approve;
	private boolean _friend2Approve;

	public FriendRequest (AnimateAccount _friend1, AnimateAccount _friend2) 
	{
		this._friend1 = _friend1;
		this._friend2 = _friend2;
	}
	
	public void approve (AnimateAccount friend) {
		if (_friend1Approve == true && _friend2Approve == true) 
		{
			_friend1.addFriend(_friend2);
			_friend2.addFriend(_friend1);
			
		} else 
		{
			throw new IllegalArgumentException("Friend Request Unapproved");
			
		}
	}
}
	
	

