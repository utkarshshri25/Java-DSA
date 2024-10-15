/*
n=36

1*36
2*18
3*12
4*9
6*6
-------6 is sqrt of 36 || after sqrt of n, factors start repeating || If i is one factor of n, n/i is other factor
9*4
12*3
18*2
36*1
*/

import java.util.ArrayList;

public class FindFactors {

    public static void main(String[] args) {
        
        int n=36;
        ArrayList <Integer> factors= new ArrayList<>();  //we are taking arraylist coz count of factors is not known
        int sqrtN = (int) Math.sqrt(n);

        for(int i=1; i<=sqrtN; i++)
        {
            if (n%i==0)
            {
                factors.add(i);
                if (n/i != i)
                {
                    factors.add(n/i);
                }
            }
        }
        System.out.println(factors);
    }
}
