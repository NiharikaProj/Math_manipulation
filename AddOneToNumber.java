import java.util.*;

public class AddOneToNumber {

	public static void main(String[] args) {
	 	
		List<Integer> Value = new ArrayList<Integer>();
		//Value.add(0);
		//Value.add(0);
		//Value.add(6);
		Value.add(9);
		
		System.out.println("Input array: " + Value);
		List<Integer> ArraynewValue = plusOne((ArrayList<Integer>) Value);
		
		System.out.println("Output array: "+ ArraynewValue);	
			
	}	
	public static List<Integer> plusOne(ArrayList<Integer> value) {
		
		
		int length = value.size();
		if (length<2)
		{
			int currval=value.get(0);
			currval=currval+1;
			value.set(0, currval);
			if(value.get(0)==10)
			{
				value.add(0, 1);
				value.set(1, 0);
			}
		}
		if (length>=2)
		{
		int nextVal = value.get(length-2);;
		int lastVal = value.get(length-1);
		if (lastVal < 9)
		{
			lastVal = lastVal+1;
		value.set(length-1, lastVal);
		}
		
		else if (lastVal==9)
		{
			nextVal= nextVal+1;
			value.set(length-1, 0);
			value.set(length-2, nextVal);
		}

		
for (int i =length-1; i>=0; i--)
{
	int currVal = value.get(i);
		if(currVal==10)
			if(i==0)
		{
			value.add(0, 1);
			value.set(1, 0);
		}
			else if (i>0)
			{
				value.set(i, 0);
				int nextval=value.get(i-1);
				nextval=nextval+1;
				value.set(i-1, nextval);
			}

	
}	 
for(int j=0;j<length-1;j++)
{
	while (value.get(j)==0)
		value.remove(j);
		break;
}
	
		}	
	
		return value;
	}
	}

