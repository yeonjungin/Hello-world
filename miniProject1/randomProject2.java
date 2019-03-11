package miniProject1;
import java.util.Random;
public class randomProject2 {
	public static void main(String[] args) {
		Random random=new Random();
		int lotto[]=new int[6];
		// int lotto[]=new int[6] --> 배열 선언 및 크기 할당
	
		//배열 안의 lotto 클래스를 초기화시켜주어야 한다.
		for (int i=0; i<lotto.length; i++)
		{
			//.length 배열 길이의 갯수
			lotto[i]=random.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
	}
}
