import java.util.Scanner;
public class PemilihanHari4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;

        System.out.println("Input day name : ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";                
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";

            }
            
            System.out.println(dayName + "is a" + dayType);
    }
}