
import java.util.ArrayList;

public class AllPrimeFactorsOfNumber1 {
    public static void main(String[] args) {
        ArrayList <Integer> list1= new ArrayList<>();
        list1=primeFactors(105);
        System.out.println(list1);

    }

       public static ArrayList<Integer> primeFactors(int n)
    {
        ArrayList <Integer> list2= new ArrayList<>();
        for (int i=2; i*i <= n; i++ )
        {
            if(n%i==0)
            {
                if(isPrime(i))
                  list2.add(i);
                if(n/i!=i)
                {
                    if(isPrime(n/i))
                      list2.add(n/i);
                }
            }
        }
        return list2;
    }

    public static boolean isPrime(int p)
    {
        int count=0;
        for(int i=2; i*i <= p; i++)
        { 
            if(p%i==0)
            {
                count++;
            }
        }

        return (count==0);  //learn how to return boolean without if-else
        
    }


}