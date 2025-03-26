import java.util.Scanner;
class ex19{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=ob.nextInt();
        System.out.println("The value is: " +num);

        if((num%5==0)&&(num%11==0))
        {
            System.out.println("The number is divicible by 11 and 5 in the same time");

        }
        else{
            System.out.println("The number is not divicible by 5 and 11 in same time");

        }
    }
}