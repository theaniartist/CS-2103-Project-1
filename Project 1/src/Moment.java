import java.util.ArrayList; //TODO: NEED TO IMPORT THIS LIBRAY TO EVERYFILE???

public class Moment extends InanimateAccount 
{
	private ArrayList<AnimateAccount> participants;
	
	public Moment(String name, Image image, ArrayList<AnimateAccount> participants, ArrayList smileValues) 
	{
		super(name, image);
		this.participants = participants;
		//???
	}

}
