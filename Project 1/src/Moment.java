import java.util.ArrayList; //TODO: NEED TO IMPORT THIS LIBRAY TO EVERYFILE???

public class Moment extends InanimateAccount 
{
	private ArrayList<AnimateAccount> participants;
	private ArrayList<Double> smileValues;
	
	public Moment(String name, Image image, ArrayList<AnimateAccount> participants, ArrayList<Double> smileValues)
	{
		super(name, image);
		this.participants = participants;
		this.smileValues = smileValues;
	}
	
	public ArrayList<AnimateAccount> getParticipants()
	{
		return participants;
	}
	
	public ArrayList<Double> getSmileValues()
	{
		return smileValues;
	}
	
	public boolean hasParticipant(AnimateAccount participant)
	{
		return participants.contains(participant);
	}
	
	public int getParticipantIndex(AnimateAccount participant)
	{
		return participants.indexOf(participant);
	}

}
