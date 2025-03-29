import java.util.Scanner;
class increment2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value for coumter 01: ");
        int count1=sc.nextInt();
        System.out.print("Enter the value for coumter 02: ");
        int count2=sc.nextInt();

        for(int i=0; i<count1; i++)
        {
            System.out.println("value for i: "+i);

            for(int j=0;j<count2;j++)
            {
                System.out.println("value for j: "+j);
 
            }
            System.out.println();
            

        }
    }
}