import java.util.Scanner;
class ex15{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Input the side length : ");
		double length = ob.nextDouble();
		System.out.printf("Square value: %.2f\n",length*length);
		System.out.printf("Cubic value: %.2f\n",length*length*length);
		System.out.printf("Fourth power value: %.2f\n",Math.pow(length,4));
	}
}