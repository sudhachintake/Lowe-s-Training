import java.util.*;

//Single Inheritance
class Employ
{
	int salary=100000;
}
class Promoted_employee extends Employ
{
	int extra_sal=50000;
}

//multilevel inheritance
class A
{
	public void methodA()
	{
		System.out.println("A");
	}
	
}
class B extends A
{
	public void methodB()
	{
		System.out.println("B");
	}
}
class C extends B
{
	public void methodC()
	{
		System.out.println("C");
	}
}

//Multiple Inheritance
interface Aa {
    public void print_A();
}
 
interface Bb {
    public void print_B();
}
 
interface Cc extends Aa, Bb {
    public void print_C();
}

class D implements Cc
{

	@Override
	public void print_B() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

	@Override
	public void print_C() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}

	@Override
	public void print_A() {
		// TODO Auto-generated method stub
		
	}
	
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Promoted_employee p=new Promoted_employee();
		System.out.println("Total Salary="+(p.salary+p.extra_sal));
		C c=new C();
		c.methodC();
		
		D d=new D();
		d.print_A();
		d.print_B();
		d.print_C();
	}

}
