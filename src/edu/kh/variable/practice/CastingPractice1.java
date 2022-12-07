package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1/iNum2);
		//정수형 10 / 정수형 4 
		System.out.println((int)dNum);
		//정수형으로 강제형변환해서 소수점 버림처리
		
		System.out.println(iNum2 * dNum); //10.0
		//double이 더 큰 자료형으로 double로 강제형변환
		System.out.println((double)iNum1); //10.0
		//iNum1이 정수형이므로 실수형인 double로 강제형변환
		
		System.out.println((double)iNum1/(double)iNum2);
		//iNum1,iNum2 두 변수 다 정수형이므로 실수형인 double로
		//강제형변환하여 나누기
		System.out.println(dNum);
	
		System.out.println((int)fNum);//3
		//fNum은 실수형이므로 정수형으로 강제형변환
		System.out.println(iNum1/(int)fNum); // 3
		//iNum1은 정수형,fNum은 실수형이므로 fNum를 정수형으로 강제형변환
		//하여 나누기
	
		System.out.println(iNum1/fNum);
		//실수형과 정수형을 나누면 실수형
		System.out.println(iNum1/(double)fNum);
		//fNum을 더 큰 double형으로 강제형변환후 나누기
		
		System.out.println("'"+ch+"'");
		System.out.println((int)ch); 
		//문자열자료형의 고유값을 끌어내기위해 int로 강제형변환 
	
		System.out.println((int)ch + iNum1);
		//ch의 고유값을 끌어내기위해 int로 강제형변환 후 더하기 
		System.out.println("'"+(char)((int)ch + iNum1)+"'");
		//ch의 고유값을 끌어내기위해 int로 강제형변환 후 iNum와 더 하고
		//그것을 문자열로 바꾸기위해 char로 강제형변환
		
		

	}

}
