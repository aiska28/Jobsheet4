import java.util.Scanner;

public class PemilihanHariDenganlf04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input number = ");
        int dayNumber = sc.nextInt();

        if (dayNumber >=1 && dayNumber <= 5) {
            System.out.println("The day is weekday");
        }else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("The day is weekend");
        }else{
            System.out.println("Invalid Number");
        }
    }
} 