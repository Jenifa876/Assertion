
public class AssertionEx {
	static int a=3;
	static int getnum()
	{
		return a--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		for(int i=0;i<10;i++)
		{
			n=getnum();
			assert n>0 : "Error: whether n value is zero or negative";
			System.out.println("n is "+n);
		}
		getnum();
	}

}
