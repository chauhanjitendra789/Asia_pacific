import java.util.Scanner;
public class swap{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b=sc.nextInt();
        int temp=0;
            temp=a;
            a=b;
            b=temp;
        System.out.println("The value of A after swapping is "+a);
        System.out.println("The value of B after swapping is "+b);
    }
}