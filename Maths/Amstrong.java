//Number is amstrong if abc= a^3 + b^3 + c^3 , abcd= a^4 + b^4 + c^4 + d^4

public class Amstrong {
    
    public static void CheckIfAmstrongnumber(int x)
    {
        int length= String.valueOf(x).length(); //to find number of digits in a number
        int copy=x;
        int sum=0;

        while (x>0)
        {
            x=x%10;
            sum = sum + (int)Math.pow(x,length); 
            x=x%10;

        }
        
        if (sum==copy)
        {
            System.out.println("is Amstronng");
        }
        else 
        {
            System.out.println("not Amstronng");
        }

    }

}
