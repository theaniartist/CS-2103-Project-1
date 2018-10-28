import java.util.ArrayList;

public abstract class MomentsFriends extends InanimateAccount
{
	private ArrayList <Moment> moments;
	
	public MomentsFriends()
	{
		
	}
	
	@Override
	public void setMoments(ArrayList moments)
	{
		this.moments = moments;
	}
	
}
