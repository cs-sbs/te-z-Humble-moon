

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int countOdd = 0;
        int countEven = 0;
        Scanner in = new Scanner(System.in);
        do{
            number = in.nextInt();
            if(number != -1)
            {
                if (number % 2 == 0) {
                    countEven += 1;
                } else {
                    countOdd += 1;
                }
            }
        }while(number != -1);
        System.out.print(countOdd+" ");
        System.out.println(countEven);
    }
}