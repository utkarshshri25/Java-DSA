import java.util.Scanner;

public class AnyBaseToDecimal {

public static void binaryToDecimal(int n)
{
    int unitDigit, decimalNum = 0, power=0;


    while (n>0)
    {
        unitDigit= n%10;
        n/=10;                        //for other base: n/=base
        decimalNum= (int) (decimalNum + unitDigit * Math.pow (2,power));  //for other base: Math.pow(base,power)
        power++;
    }

}

//driver program
        public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryToDecimal(n);
    }
    
}
