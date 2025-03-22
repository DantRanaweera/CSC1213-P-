import java.util.Scanner;
class ex12{
    public static void main(String args[]){
        Scanner sc = new Scanner (System .in);

        System.out.println("Enter your first name: " );
        String fname = sc.nextLine();

        System.out.println("Enter your last name: " );
        String lname = sc.next();

        System.out.println("Enter your Reg no: " );
        String Regno = sc.next();

        System.out.println("Enter your Age: " );
        int age = sc.nextInt();

        System.out.println("Enter your mobile number: " );
        long mno = sc.nextLong();

        System.out.println("Enter your sex: " );
        char Sex = sc.next().charAt(0);

        System.out.println("Enter your GPA: " );
        double gpa = sc.nextDouble();

        System.out.println("Full name: "+ fname + "\n" + "Last name: " +lname + "\n" + "Reg no: "+Regno+"\n"+"Age: "+ age+ "\n"+ "Mobile number: "+mno+"\n"+"Sex: "+Sex+"\n"+"GPA:"+gpa);
        
 
 
    }
}   