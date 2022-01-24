package overloading;

public class Calculator {
	
	public void plus(int a)	{// 파라미터로 int a값만 요구
		System.out.println(a+"에 1을 더한 값은" + (a+1)+" 입니다.");
	}
	public void plus(int a, int b)	{// 파라미터로 int a,b 요구
		System.out.println(a+"에"+b+"를 더한 값은"+(a+b)+"입니다.");
	}
	
	public void plus(double a)	{
		System.out.println(a+"에 0.5을 더한 값은" + (a+0.5)+" 입니다.");
	}
	
	public void plus(String str)	{
		System.out.println("문자열은 연산 대상이 아닙니다.");
	}
}
