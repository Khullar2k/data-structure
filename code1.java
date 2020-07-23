import java.util.Scanner;
public class High {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,j,c=0,arr[],n,t;
		arr = new int[100];
		n=in.nextInt();
		for(a=0;a<n;a++)
		{
			arr[i]=in.nextInt();
		}
		j=arr[0];
		for(a=0;a<n;a++)
		{
			if(arr[a+1]>arr[a])
			{
				j=arr[a+1];
				
			}
			
		}
			System.out.print(j);
		

	}

}
