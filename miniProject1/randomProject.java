package miniProject1;

public class randomProject {
	public static void main(String[] args) {
		
		int lotto=(int)(Math.random()*45)+1;
			System.out.println("로또로 뽑은 숫자 = " + lotto);
		// math 클래스의 random 메소드는 0.0~1.0인 실수 리턴타입
		// 기본적으로 double 타입을 선언
		// 정수형의 출력값을 얻으려면 양쪽에 int로 형변환
}
}
