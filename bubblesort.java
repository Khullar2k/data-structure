import java.util.Scanner;

public class Bubblesort {
    public static void main(String args[])
    {
        int t;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array=");
        int n = sc.nextInt();
        
        int a[]=new int [n];
        System.out.println("elements=");
        for(int i=0;i<n;i++)
            
            
        {
            a[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<n-1;i++)
        {
            
            
            int flag=0;
            for(int j=0;j<n-1-i;j++)
                
            {
                
              if(a[j]>a[j+1])
                {
                  
                 t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
                  
                }
                
                flag=1;

            }
            
            if(flag==0)
                break;
        }
             
   for(int i=0;i<a.length;i++)
       
        System.out.println(a[i]);
    }
