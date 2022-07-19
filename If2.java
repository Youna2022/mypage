package ch03;

public class If2 {

	public static void main(String[] args) {
		// main Parameter -> Int로 변환
		//문자를 숫자로 쓸떄 아래처럼 Integer.parseInt(args[0])
		//**외부로부터 받아서 실행할 수 있다
		int a = Integer.parseInt(args[0]); //12<숫자
		if ( a > 0) {
			System.out.println(a + "는 양수");
		} else {
			System.out.println(a + "는 음수");
		}
			System.out.println("프로그램 종료");

		
	}

}
