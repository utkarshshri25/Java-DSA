//Striver

import java.util.ArrayList;

public class AllPrimeFactorsOfNumber1 {
    public static void main(String[] args) {
        ArrayList <Integer> list1= new ArrayList<>();
        list1=primeFactors(105);
        System.out.println(list1);

    }

       public static ArrayList<Integer> primeFactors(int n)
    {
        ArrayList <Integer> list2= new ArrayList<>();       //This function is taking sqrt(n)*2*sqrt(n) time
        for (int i=2; i*i <= n; i++) //Time- sqrt(n)
        {
            if(n%i==0)
            {
                if(isPrime(i)) //Time-sqrt(n)
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
        for(int i=2; i<= (int)Math.sqrt(p); i++)
        { 
            if(p%i==0)
            {
                count++;
                break;
            }
        }

        return (count==0);  //learn how to return boolean without if-else
        
    }


}

//Time- srqt(n) * [2*sqrt(n)]. Hence Time complexity=n
