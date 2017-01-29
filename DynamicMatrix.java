import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicMatrix {

	public static void main(String[] args) {
		ArrayList<Integer> Values = new ArrayList<Integer>();
        Values.add(1);
        Values.add(2);
        Values.add(3);
        Values.add(4);
        Values.add(5);
        Values.add(6);
        Values.add(7);
        Values.add(8);
        Values.add(9);
  		
        ArrayList<ArrayList<Integer>> Value = new ArrayList<ArrayList<Integer>>();
        Value.add(Values);
        
        MatrixCreate(Values);
	}
	
	public static void MatrixCreate(ArrayList<Integer> value)
	{  
		
	int k=0;
	List<Integer> col = new ArrayList<Integer>();
	List<Integer> row = new ArrayList<Integer>();
	int matrix[][]=new int[3][3];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=value.get(k);
				k++;	
				
			} 
			
		} 
		
		System.out.println("before change: " + Arrays.deepToString(matrix));

}
}