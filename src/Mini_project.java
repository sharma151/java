import java.util.Scanner;
public class Mini_project {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int MyNumber = (int)(Math.random()*100);
int Usernum =0;
        do {
            System.out.println("Guess any number");
            Usernum =sc.nextInt();
            if(Usernum == MyNumber){
                System.out.println("wohoo... correct number   :)");
                break;
            } else if (Usernum>MyNumber) {
                System.out.println("your Number is greater");
            }else {
                System.out.println("your number is smaller");
            }
        }while (Usernum>=0);
        System.out.println(" my number was");
        System.out.println(MyNumber);
    }
}
