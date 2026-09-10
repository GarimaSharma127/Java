import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name-");
        String name=sc.nextLine();
        System.out.print("Enter your age-");
        int age=sc.nextInt();
        System.out.println("My name is " +name);
        System.out.println("My age is "+age);
        sc.close();
    }
}