import java.util.Scanner;
public class PrimeNumbers2{
public static void main (String[] args){
    int[] array = new int [5];
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<5; i++)
    {
        array[i] = sc.nextInt();
    }

    for(int i=0; i<array.length; i++){
        boolean isPrime = true;


        for (int j=2; j<i; j++){

            if(i%j==0){
                isPrime = false;
                break;
            }
        }
     

        if(isPrime)

            System.out.println(i + " are the prime numbers in the array ");
    }
}
}