package miniProject1;
import java.util.Random;
public class randomProject2 {
	public static void main(String[] args) {
		Random random=new Random();
		int lotto[]=new int[6];
		// int lotto[]=new int[6] --> �迭 ���� �� ũ�� �Ҵ�
	
		//�迭 ���� lotto Ŭ������ �ʱ�ȭ�����־�� �Ѵ�.
		for (int i=0; i<lotto.length; i++)
		{
			//.length �迭 ������ ����
			lotto[i]=random.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
	}
}
