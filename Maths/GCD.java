/* 
 Refer Luv youtube video

 Time- log min(a,b)
 */


public class GCD {
    public static void main(String[] args) {
        int ans=gcd(15,100);
        System.out.println(ans);

    }

       public static int gcd(int a, int b)
    {
    
        {
            if (b%a==0)
                return a;
    
            return gcd(b % a, a);
        }
    }
}
