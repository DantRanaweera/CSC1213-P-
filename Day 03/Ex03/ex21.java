import java.util.Scanner;
class ex21{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=ob.nextInt();

        if(num>0)
        {
            System.out.println(num+" is positive");
        }
        else if(num<0)
        {
            System.out.println(num+" is negative ");
        }
        else
        {
            System.out.println(num+" is zero "); 
        }
    }
}