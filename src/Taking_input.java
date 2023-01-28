import java.util.Scanner;
public class Taking_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name");
        String name = sc.next();// for string
        System.out.println("enter your Age");
        int age = sc.nextInt();// for integer value
        System.out.println("enter your AGE");
        float Age = sc.nextFloat();// for Float value
        System.out.println("describe yourself in a line");
        String about = sc.nextLine();// for printing a line
        System.out.println(name);
        System.out.println(age);
        System.out.println(Age);
        System.out.println(about);
    }
}
