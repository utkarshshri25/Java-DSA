
import java.util.Scanner;

//Just replace the number with the base you want to convert to

public class DecimalToAnyBase 
{
    static void decToBinary1 (int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
 
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;   //for any base- n%base
            n /= 2;              //for any base - n/=2
            i++;
        }
 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void decToBinary2 (int n)
    {
        int buildingNumber=0, power=0;

        while (n>0)
        {
            int reminder = n%2;
            n/=2;
            buildingNumber += (int) (reminder * Math.pow(10,power)); 
            power++;
        }
        System.out.println(buildingNumber);

    }

    
    // driver program
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBinary1(n);
        decToBinary2(n);
    }

}



