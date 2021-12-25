import java.util.Scanner;

public class Armstrong {
    public static void main(String[] ar)
    {
        int n,rem=0,len=0;
        int rearms=0;
        System.out.print("Enter a digit to check is it armstrong number or not :- ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        int temp=n;
        while(temp>0)
        {
            temp=temp/10;
            len++;
        }
 
        int temp1=n;
        for(int i=0;i<len;i++)
        {
            rem=temp1%10;
            temp1=temp1/10;
            rearms=rearms+(int)Math.pow(rem,len);
        }
        System.out.println("===================================");
 
        if(n==rearms)
            System.out.println(n+" is equal to "+ rearms +" so it is armstrong number ");
        else
            System.out.println(n+" is not equal to "+ rearms +" so it is not an a armstrong number "); 
 
	}
    
}
