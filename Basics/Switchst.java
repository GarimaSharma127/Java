import java.util.Scanner;
public class Switchst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1-3):");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Selected option 1");
                break;
            case 2:
                System.out.println("Selected option 2");
                break;  
            case 3:
                System.out.println("Selected option 3");
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}   