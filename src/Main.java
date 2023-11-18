
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        int length = 0;
        int breath = 0;
        int area = 0;
        int perimeter =0;

        System.out.print("Enter the lentht of Rectagle : ");
        length = scanner.nextInt();

        System.out.print("Enter the breath of Rectangular : ");
        breath = scanner.nextInt();

        area = length * breath;
        perimeter = 2 *(length + breath);

        System.out.println("The Area of Rectangular is : " +area);
        System.out.println("The Permiter of Rectangular is : " + perimeter);




    }
}