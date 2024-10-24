
//Striver (without recursion) & https://www.youtube.com/watch?v=7wcJXZoGKMI (with recursion)

import java.util.Scanner;

class Solution {


    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        myPow1(x,n);
        myPow2(x,n);
    }

    public static double myPow1(double x, int n) {
        double ans=1.0;
        long copyN=n;

        if (copyN<0) 
            copyN*=-1; //to make copyN positive

        while (copyN>0)
        {
            if(copyN % 2 !=0)
            {
                ans*=x;
                copyN= copyN-1;
            }
            else
            {
                x*=x;
                copyN/=2;
            }
        }
        if (n<0) ans=1.0/ans;
        return ans;
    }

    public static double myPow2(double x, long n) {

        if(n==0)
        {return 1;}

        if(n < 0)
        {return myPow2(1/x, -n);}

        if(n%2==0)
        {return myPow2(x*x,n/2);}
        else
        return x*myPow2(x, (n-1)/2);

    }

}
