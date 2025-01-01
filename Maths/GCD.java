/* 
 Refer Luv youtube video & Pepcoding
https://www.youtube.com/watch?v=ZtDeDD1VYLk
 Time- log min(a,b)
 */


public class GCD {
    public static void main(String[] args) {
        int ans=gcd1(15,100);
        System.out.println(ans);

    }

       public static int gcd1(int a, int b)
    {
    
        {
            if (b%a==0)
                return a;
    
            return gcd1(b % a, a);
        }
    }

    public static int gcd2 (int a, int b)
    {
        while(b%a!=0)
        {
            int rem=b%a;
            b=a;
            a=rem;
        }
        return a;
    }
}
