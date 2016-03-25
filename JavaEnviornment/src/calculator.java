
public class calculator {
 int  c;
 
  public void addition(int a, int b)
 {
	 c = a + b;
	 System.out.println(" add of"+a+"and"+b+"="+ c);
	 
 }
  public void substraction(int a, int b)
  {
	  if (a>b)
	  {
		  c=a-b;
		  System.out.println(" sub of"+a+"and"+b+"="+ c);
	  }
	  else{
		  c=b-a;
	  System.out.println(" sub of"+b+"and"+a+"="+ c);
	  }
  }
	public void divide(int a, int b)
	{
		if(a==0||b==0)
		{
			System.out.println("error");
		}
		else {
			c=a/b;
		
		System.out.println(" Div of"+a+"and"+b+"="+ c);
		}
	}
	
	public void multiply(int a, int b)
	{
		c= a*b;
		System.out.println(" Mul of"+a+"and"+b+"="+ c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator c1 = new calculator();
		c1.addition(2,3);
		c1.substraction(7, 2);
		c1.divide(12,3);
		c1.multiply(4, 6);

	}

}
