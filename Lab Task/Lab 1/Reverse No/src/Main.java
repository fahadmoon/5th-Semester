import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
        System.out.println("What is the number of entries?");
        int no=obj.nextInt();
        System.out.println("Enter element of array");
        int[] array=new int[no];
      for(int i=0;i<no;i++){
           array[i]=obj.nextInt();
      }

        for(int i=no-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}