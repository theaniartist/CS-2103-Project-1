
import java.util.ArrayList;

public class Utility
{

	public static void main(String[] args) 
	{
		
	}
	
	public static double findSumOfList(ArrayList<Double> list)
	{
		double sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		return sum;
	}
	
	public static double findMeanOfList(ArrayList<Double> list)
	{
		return findSumOfList(list) / list.size();
	}
	
	public static ArrayList<Double> buildList(int size, double initValue)
	{
		ArrayList<Double> tmpIntList = new ArrayList();
		for(int i = 0; i < size; i++)
		{
			tmpIntList.add(initValue);
		}
		return tmpIntList;
	}
	
	public static double maxDoubleInList(ArrayList<Double> list)
	{
		double max = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(max < list.get(i))
			{
				max = list.get(i);
			}
		}
		
		return max;
	}	
	
	public static int maxIntInList(ArrayList<Integer> list)
	{
		int max = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(max < list.get(i))
			{
				max = list.get(i);
			}
		}
		return max;
	}	
}
