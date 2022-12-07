package edu.kh.variable.practice;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
	
		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		//Scanner 생성
		//-> 프로그램 안에 스캐너라는 기계를 만든 것
		
		Scanner sc = new Scanner(System.in);
		//import java.util.Scanner을 안해주면 에러발생
		//==> import를 안해와서 에러발생.
		//==> 즉 Scanner를 만들어서 쓰고시은데 설계도가 없음
		//==> import 해오면 오류 해결
		
		//System.out.println("값을 입력하시오: ");
		
		//int input1 = sc.nextInt();	//입력 받은 정수를 input1에 대입
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		
		//System.out.println(input1);
		
		//System.out.println("실수만 입력해주세요 : ");
		//double input2 = sc.nextDouble();
		// nextDouble() : 다음 입력된 실수를 읽어옴 (키보드로 입력된 실수를 읽어옴)
		//System.out.println(input2);
		
		//안녕?안녕! 출력하려면?
		//nextLine() 이나 String input4 =input3 + sc.next();로
		System.out.println("입력1 = ");
		String input3 =sc.nextLine();
		//nextLine() :  단어 여러개 한줄 출력
		//next() : 다음 입력된 한 단어를 읽어옴
		System.out.println(input3);
		
		
		
		System.out.println("입력2 = ");
		String input4 =input3 + sc.next();
		// input3 과 input4을 같이 출력하려면 이렇게도 가능. 변수의 재사용성
		System.out.println(input4);
		
		
		
		
	}

}
