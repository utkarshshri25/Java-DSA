//Number is amstrong if abc= a^3 + b^3 + c^3 , abcd= a^3 + b^3 + c^3 + d^3

public class Amstrong {
    
    public static void CheckIfAmstrongnumber(int x)
    {
       
        int copy=x;
        int sum=0;

        while (x>0)
        {
            x=x%10;
            sum = sum + (int)Math.pow(x,3); 
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
