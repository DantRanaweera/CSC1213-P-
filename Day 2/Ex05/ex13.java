import java.util.Scanner;
class ex13{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num= ob.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is even"); 

        }
        else
        {
            System.out.println("Number is odd"); 

        }

    }
}