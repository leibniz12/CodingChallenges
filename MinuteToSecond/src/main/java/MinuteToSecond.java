import java.util.Scanner;

public class MinuteToSecond {

    public static int MinToSec(int min){
        int second =0;
        second = min *60;
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Minutes:");
        int min = sc.nextInt();
        System.out.println(min+ " minutes is " +MinToSec(min)+" seconds.");
    }
}
