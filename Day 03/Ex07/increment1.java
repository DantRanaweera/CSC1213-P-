import java.util.Scanner;
class increment1{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=ob.nextInt();

        for(int i=1;i<num;i++)
        {
            System.out.println(i+"\t");
        }
    }
}