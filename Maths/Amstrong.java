//Number is amstrong if abc= a^3 + b^3 + c^3 , abcd= a^4 + b^4 + c^4 + d^4

public class Amstrong {
    
    public static void CheckIfAmstrongnumber(int x)
    {
       
        int copy=x;
        int x1=x;            //store the number in another variable to count number of digits
        int sum=0;
        int count=0;


        while (x1>0)
        {
            x1/=10;
            count++;
        }

        while (x>0)
        {
            x=x%10;
            sum = sum + (int)Math.pow(x,count); 
            x=x/10;

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
