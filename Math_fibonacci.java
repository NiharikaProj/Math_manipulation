import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_fibonacci {

	public static void main(String[] args) throws IOException {
		int i=0, j=1, k,l;
		System.out.println("enter value");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		System.out.println("n is: "+n);
		System.out.println(i + "\n"+j);
		
		for(k=0;k<=n;k++)
		{
		l=i+j;
		i=j;
		j=l;
		System.out.println(l);
	}

}
}
