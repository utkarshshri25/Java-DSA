//Striver


import java.util.ArrayList;

public class AllPrimeFactorsOfNumber2 {
    public static void main(String[] args) {
        ArrayList <Integer> list1= new ArrayList<>();
        list1=primeFactors2(2680);
        System.out.println(list1);

    }

    public static ArrayList<Integer> primeFactors(int n)
    {
        ArrayList <Integer> list2= new ArrayList<>();
        for (int i=2; i<n; i++)
        {
            if(n%i==0)
                list2.add(i);

            while(n%i==0)
                n/=i;
        }
        return (list2);

    }

    //Time compelxity- n*log(n)

    public static ArrayList<Integer> primeFactors2(int n)
{
    ArrayList <Integer> list2= new ArrayList<>();
    for (int i=2; i*i<=n; i++)
    {
        if(n%i==0)
            {
                list2.add(i);
            }
        while(n%i==0)
            n/=i;
    }

    if (n!=1)              //if n is prime, then it will not be divisible by any other number hence n won't be =1.
        list2.add(n);      //Hence we stop division when we reach a prime number as divident and add that prime divident to list

    return(list2);

}
}

//Time- sqrt(n)*log(n)


