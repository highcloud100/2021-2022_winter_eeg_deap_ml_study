package week5;

import java.util.Scanner;

public class Grade {
	int math;
	int sci;
	int eng;
	double average() {
		return (math+sci+eng)/3.0;
	}
	
	Grade(int... arr){
		math = arr[0];
		sci = arr[1];
		eng = arr[2];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i =0;i<3;i++) {
			arr[i] = sc.nextInt();
		}
		
		Grade std = new Grade(arr);
		System.out.println(std.average());
		sc.close();
	}
}
