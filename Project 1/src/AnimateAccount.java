
import java.util.ArrayList;

public abstract class AnimateAccount extends Account //Should this be abstract ASK OFFICE HOURS.
{
	private ArrayList<AnimateAccount> friends;
	private ArrayList<Moment> moments;
	
	public AnimateAccount(String name, Image image)
	{
		super(name, image);
	}
	
	public void setFriends(ArrayList<AnimateAccount> friends)
	{
		this.friends = friends;
	}
	
	public void setMoments(ArrayList<Moment> moments)
	{
		this.moments = moments;
	}
	
	public ArrayList<AnimateAccount> getFriends()
	{
		return friends;
	}
	
	public void addFriend(AnimateAccount friend)
	{
		friends.add(friend);
	}
	
	public AnimateAccount getFriendWithWhomIAmHappiest()
	{
		ArrayList<Double> averageHappiness = Main.buildList(friends.size(), 0);
		for(int i = 0; i < friends.size(); i++)
		{
			AnimateAccount currentFriend = friends.get(i);
			for(int j = 0; j < moments.size(); j++)
			{
				Moment currentMoment = moments.get(j);
				ArrayList<AnimateAccount> participantsInMoment = currentMoment.getParticipants();
				if(currentMoment.hasParticipant(currentFriend))
				{
					int indexOfFriend = participantsInMoment.indexOf(currentFriend);
					double happinessWithFriend = currentMoment.getSmileValues().get(indexOfFriend);
					averageHappiness.set(i, averageHappiness.get(i) + happinessWithFriend);
				}
			}
			averageHappiness.set(i, averageHappiness.get(i) / averageHappiness.size());
		}
		int indexOfHappiest = averageHappiness.indexOf(Main.max(averageHappiness));
		return friends.get(indexOfHappiest);
	}
	
	
}