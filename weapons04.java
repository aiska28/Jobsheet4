import java.util.Scanner;
public class weapons04 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double distance;

    System.out.println("input Distance: ");
    distance = sc.nextDouble();

    if (distance<=5){
        System.out.println("melee weapons");
    }else{
        System.out.println("ranged weapons");
    }

    }
}