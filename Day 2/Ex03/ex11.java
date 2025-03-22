import java.util.Scanner;
class ex11{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        String fname, lname;

        System.out.println("Enter your first name: ");
        fname = sc.nextLine();

        System.out.println("Enter your last name: ");
        lname = sc.next();

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.println("Full name : " + fname +"\n" +"Last name: " + lname +"\n" + "Marks: " + marks);



    }
}