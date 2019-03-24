package pro01;
//매개변수의 수를 모를경우
public class computer {
	//int[] values = type[] name
	//int result1=myCom.sum1(new int[] {1,2,3});
	int sum1(int[] values)
	{
		int sum=0;
		for(int i=0; i<values.length; i++)
		{
			sum+=values[i];
		}
		return sum;
	}
	//int ... values = type ... name
	// int result2=myCom.sum2(1,2,3);
	int sum2(int ... values) {
		int sum=0;
		for(int i=0; i<values.length; i++)
		{
			sum+=values[i];
		}
		return sum;
	}
	
}
