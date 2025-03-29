import java.util.Scanner;
class switch2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter=sc.next().charAt(0);

        switch(letter){
            case 'a':
            case 'A':
            System.out.println(letter+ " is a vowel");
            break;

            case 'e':
            case 'E':
            System.out.println(letter+ " is a vowel");
            break;

            case 'i':
            case 'I':
            System.out.println(letter+ " is a vowel");
            break;

            case 'o':
            case 'O':
            System.out.println(letter+ " is a vowel");
            break;

            case 'u':
            case 'U':
            System.out.println(letter+ " is a vowel");
            break;

            default:
            System.out.println(letter+ " is not a vowel");
            break;





        }
    }
}