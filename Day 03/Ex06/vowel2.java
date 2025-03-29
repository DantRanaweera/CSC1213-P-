import java.util.Scanner;
class vowel2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter=sc.next().charAt(0);

        if(letter=='a'||letter=='A'||letter=='e'||letter=='E'||letter=='i'||letter=='I'||letter=='o'||letter=='O'||letter=='u'||letter=='U')
        {
            System.out.println(letter+" is a vowel");

        }
        else
        {
            System.out.println(letter+" is not a vowel");

        }

        
    }
}
