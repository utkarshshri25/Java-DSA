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
        if (n!=1)
           list2.add(n);      
    }
    return(list2);

}
}

//Time- n*k, where k is minimal so T(n)=N


