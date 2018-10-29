import java.util.ArrayList;

public abstract class AnimateAccount extends Account
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
	
	public ArrayList<Double> findAverageHappinessAmoungFriends()
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
					int indexOfFriend = currentMoment.getParticipantIndex(currentFriend);
					double happinessWithFriend = currentMoment.getSmileValues().get(indexOfFriend);
					averageHappiness.set(i, averageHappiness.get(i) + happinessWithFriend);
				}
			}
			averageHappiness.set(i, averageHappiness.get(i) / averageHappiness.size());
		}
		return averageHappiness;
	}
	
	public ArrayList<Double> findAverageHappinessAmoungMoments()
	{
		ArrayList<Double> averageHappiness = Utility.buildList(moments.size(), 0);
		for(int i = 0; i < moments.size(); i++)
		{
			Moment currentMoment = moments.get(i);
			averageHappiness.set(i, Utility.findMeanOfList(currentMoment.getSmileValues()));
		}
		return averageHappiness;
	}
	
	public AnimateAccount getFriendWithWhomIAmHappiest()
	{
		ArrayList<Double> averageHappiness = findAverageHappinessAmoungFriends();
		double happiestValue = Utility.max(averageHappiness);
		if(happiestValue > 0) //Refine!
		{
			int indexOfHappiest = averageHappiness.indexOf(happiestValue);
			return friends.get(indexOfHappiest);
		}
		else
		{
			return null;
		}
	}
	
	public Moment getOverallHappiestMoment()
	{
		if(moments.size() > 0)
		{
			return moments.get(moments.indexOf(Utility.max(findAverageHappinessAmoungMoments())));
		}
		else
		{
			return null;
		}
	}
	
}