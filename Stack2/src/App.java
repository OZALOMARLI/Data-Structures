
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements do you want to insert into the stack?");
        int n = scanner.nextInt();

        Stack list = new Stack(n);

        int choice = -1, number;
        while (choice != 0) {
            System.out.println("1- Add");
            System.out.println("2- Remove");
            System.out.println("3- Show Top");
            System.out.println("4- Print");
            System.out.println("0- Exit");
            System.out.println("Your Choice ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Number : ");
                    number = scanner.nextInt();
                    list.push(number);
                    break;
                case 2:
                    list.pop();
                    break;
                case 3:
                    list.showTop();
                    break;
                case 4:
                    list.print();
                    break;
                case 0:
                    System.out.println("You're logged out!");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }

    }
}
