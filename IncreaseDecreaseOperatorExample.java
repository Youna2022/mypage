package ch02;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		//x = x + 1
		//x = x + 1
		++x;
		//x = x+1
		x++;
		//x = x+1
		System.out.println("1.x=" + x);
		System.out.println("---------------");
		y--;
		//y = y-1
		--y;
		System.out.println("2.y=" + y);
		
		System.out.println("---------------");
		z = x++;
//		z = ++x;
		//**
		// 1. z = x
		// 2. x = x+1
		System.out.println("3.z=" + z);
		System.out.println("4.x=" + x); 

		System.out.println("---------------");
		z = ++x;
		System.out.println("5.z=" + z);
		System.out.println("6.x=" + x);
		
		
		
	}
}
