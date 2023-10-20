import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter factorial no: ");
        int f=obj.nextInt();
        int a=1;
        for(int i=1;i<=f;i++)
        {
            a=a*i;
        }
        System.out.println("Factorial of "+ f+ " is "+ a);
    }
}