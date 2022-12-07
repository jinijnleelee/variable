package edu.kh.variable.ex1;

public class variableExample2 {
	
		public static void main(String[] args) {
			/*자바 기본 자료형 8가지
			 * 논리형 : boolean(1byte)
			 * 정수형 : byte(1byte),short(2byte),int(4byte),long(8byte)
			 * 실수형 : float(4byte),double(8byte)
			 * 문자형 : char(2byte,유니코드)
			 * 
			 * */
			
			//변수 선언 : 메모리에 값을 저장 할 공간을 할당하는 것.
			//변수 값 대입 : 변수에 값을 집어 넣는 것
			
			
			boolean booleanData;
			//메모리에 논리 값(t/f)을 저장할 공안 1byte 할당하고
			//할당된 공간을 booleanData라고 부르겠다
			
			booleanData = true;
			// = : 대입연산자 ==> 오른쪽에 있는 값을 왼쪽에 대입하겠다
			System.out.println("booleanData = " + booleanData);
			
			
			//자료형 byte 변수명 byteNumber 값 127 대입 
			
			byte byteNumber = 127;
			
			
			/*
			 * 메모리에 정수값을 저장할 공간 1byte 할당하고
			 * 할당된 공간을 byteNumber라고 부르겠다
			 * 선언된 byteNumber 변수에 처음으로 127을 넣음
			 *  --> 초기화 :처음 변수에 값을 대입
			 *  
			 *  
			 * */
			
			System.out.println("byteNumber = " + byteNumber);
			
			short shortNumber = 32767; // 변수 선언 및 초기화
			// 정수 자료형의 기본형~!(short, byte 옛날 코드의 잔재)
			int intNumber = 2147483647; //변수 선언 및 초기화
		// 자료형  변수명 	  =  리터럴;
			//프로그래밍에서는 대입되는 데이터를 리터럴이라는 단어로 표현
			
			//**리터럴 : 변수에 대입되거나 작성되는 값 자체
			// + 자료형에 따라 리터럴 표기법이 다름
			
			long longNumber = 10000000000L; // 소문자 대문자 상관없음
			// The literal 10000000000 of type int is out of range 
			//100억 이라는 값은 범위를 벗어남
			//	뒤에 L을 붙여줌으로써 long 자료형인것을 나타냄
			
			// 실수형
			float floatNumber = 1.2345F;// f,F 소문자 대문자 상관없음
			double doubleNumber = 3.141592; 
			//double은 뒤에 d를 쓸수는 있으나
			// 실수형은 float,double 두개밖에 없기 때문에
			//자바는 double을 리터럴 안붙이고 쓰는애로 정함
			
			// 문자형 리터럴 표기법 : ' '(홀따옴표)
			// - > 문자 하나
			char ch = 'A';
			char ch2 = 66;
			//String str = 'gdsg';
			
			
			System.out.println("ch  = " + ch);
			System.out.println("ch2 = " + ch2);
			
			/*
			 *  char 자료형에 숫자가 대입될 수 있는 이유
			 * - 컴퓨터에는 문자표가 존재하고 있는데
			 *  숫자에 따라 지정된 문자 모양이 매팅되어있고
			 *  'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변화되서 저장.
			 *  --> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는것이 가능
			 * 
			 * */
			
			
			// 변수 명명 규칙
			// 1. 대소문자 구분 O
			// 2. 길이제한 X
		
			// 3. 예약어 사용 X ex) float double; 
			// 4. 숫자 시작 X
			// 5. 특수문자 _ $ 만 사용가능(하지만 안쓴다)
			 int $intNumber;// 문제는 없으나 개발자가 직접 사용 안한다
			 int $int_Number;// 자바는 카멜표기법 쓰기때문에 _ 작성 안함
			 				// _ 은 DB에서 사용
			 //6.  카멜표기법
			 //-> 변수명 작성시 여러 단어를 이어서 작성하는 경우
			 //띄어쓰지 않고 후속단어 첫 글자를 대문자로 작성
			 
			 // 변수명은 언어를 가리지않음 (하지만 사용하지않음)
			 
			 int 정수1 = 10;
			 int aa;
			 System.out.println(정수1);
			 
			 //--------------------------------------
			 
			 
			 int number = 10;
			 System.out.println("number: " + number); //10
			 
			 number = 20;
			 System.out.println("number: " + number); //20
			 
			 
			 /* 상수(항상 같은 수)
			  * - 변수의 한 종류
			  * - 한번 값이 대입되면 다른 값 대입 불가
			  * - 자료형 앞에 final 키워드를 작성 (마지막 대입되는 값)
			  * 
			  * 
			  * - 상수 명명 규칙: 모두 대문자, 여러 단어 작성 시 "_" 사용
			  * 
			  * - 상수를 사용하는 경우
			  * 1) 변하면 안되는 고정된 값을 저장할 때
			  * 2) 특정한 값에 의미 부여하는 경우 
			  * 
			  * */
			 
			 final double PI_VALUE = 3.14;
			 // PI_VALUE = 2.3; // 에러! 대입 불가
			 
			 
			 
			 
			 
		}

}
