import java.util.*;
 class A {
	 String name="operation";
	double add(double x,double y)
	{
        
		return (x+y);
	}
	double mul(double x,double y)
	{
		return (x*y);
	}
	double div(double x,double y)
	{
		return (x/y);
	}
	double sub(double x,double y)
	{
		return (x-y);
	}

}
class B extends A
{
void display()
	{
  A a1=new B();
  System.out.println("DRY PRINCIPLE");
  System.out.println("This is implementing the dry principle");
  System.out.println("the result of the add method of class A  "+a1.add(2,4));
		
	}
}
 interface C{
    void display();
    void value();
 }
  class D implements C
  {
      void display()
      {
         System.out.println("D class implementing interface C ");
      }
      void value()
      {
         System.out.println("welcome");
      }
  } 

class Cal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        A a =new A();
     System.out.println("enter the two numbers");
     double y=sc.nextDouble();
     double z=sc.nextDouble(); 
     //implementing the layered architecture:
        System.out.println("LAYERED ARCHITECTURE");
        System.out.println("The result of class A add Method   "+a.add(y,z));
        System.out.println("The result of class A multiply Method   "+a.mul(y,z));
        System.out.println("");
     //implementng the DRY principle:
      B b=new B();
      b.display();
     System.out.println("");
     
     
     // implementing the KISS principle: 
        System.out.println("KISS PRNCIPLE");
        System.out.println("enter the operation number you want to perform from the following");
        System.out.println("1.ADD"+"\n"+ "2.SUBTRACT" +"\n"+ "3.MULTIPLY"+"\n"+ "4.DIVSION");
        int p=sc.nextInt();
        double[] x={a.add(y,z),a.sub(y,z),a.mul(y,z),a.div(y,z)};
        double q=x[p-1];
        System.out.println("");
        System.out.println("the result is"+q); 
        System.out.println("");
      //implementing the solid and yagni principle:
        D d=new D();
        d.display();
        d.value();     
        }
    }

