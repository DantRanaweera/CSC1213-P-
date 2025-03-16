class ex08{
    public static void main (String[] args){
        int x = 80;
        int y = 15;

        boolean isTrue = true;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Boolean Value " + isTrue);

        System.out.println("Unary + of x: " + (+x));
		System.out.println("Unary - of x: " + (-x));
		System.out.println("Increment of x: " + (++x));
		System.out.println("Decrement of y: " + (--y));
		System.out.println("Logical complement: " + (!isTrue));
		System.out.println("Bitwise complement: " + (~y));
		
		System.out.println("Logical AND(x<100 && y>10): " + (x<100 && y>10));
		System.out.println("Logical OR(x>90 || y<5): " + (x>90 || y<5));
		System.out.println("Logical NOT(!(X<100 && Y>10)): " +!(x<100 && y>10));
		
		System.out.println("x == Y: " + (x == y));
		System.out.println("x != Y: " + (x != y));
		System.out.println("x > y: " + (x > y));
		System.out.println("x < y: " + (x < y));
		System.out.println("x >= y: " + (x>= y));
		System.out.println("x <= y: " + (x<= y));
		
		System.out.println("Value of x: " + x);
		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 2: " + (x -= 2));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 10: " + (x /= 10));
		System.out.println("x %= 7: " + (x+= 7));
		
		int max = (x>y) ? x : y;
		System.out.println("The maximum value: " + max);
        

    }
}