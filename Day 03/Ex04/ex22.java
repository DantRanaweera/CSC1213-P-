import java.util.Scanner;
class ex22{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1=ob.nextInt();
        System.out.println("Enter the second integer: ");
        int num2=ob.nextInt();
        System.out.println("Enter the third integer: ");
        int num3=ob.nextInt();

        if((num1>num2)&&(num1>num3))
        {
            System.out.println(num1+ " is the maximum integer");

        }
        else if((num2>num1)&&(num2>num3))
        {
            System.out.println(num2+ " is the maximum integer");
            
        }
        else
        {
            System.out.println(num3+ " is the maximum integer");
            
        }
    }
}