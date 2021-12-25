/*program is to find the number is armstrong or not like if i enter 153 then (1^3)+(5^3)+(3^3) should be equals 153*/
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] ar)
    {
        int n,rem=0,len=0;//n is number.//rem is to get last digit of number .// len is to get number of digits of a number.
        int rearms=0;//to store armstrong number.
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
            rem=temp1%10; // getting last digit
            temp1=temp1/10; // removing last digit.
            rearms=rearms+(int)Math.pow(rem,len); //doing the power of a number with number of digits.
        }
        System.out.println("===================================");
 
        if(n==rearms)
            System.out.println(n+" is equal to "+ rearms +" so it is armstrong number ");
        else
            System.out.println(n+" is not equal to "+ rearms +" so it is not an a armstrong number "); 
 
	}
    
}
