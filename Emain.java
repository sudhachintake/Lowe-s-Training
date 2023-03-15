import java.util.*;

class Employee
{
	Scanner scan=new Scanner(System.in);
	int E_id;
	float basic_salary;
	String E_name;
	float gross;
	float hra;
	float ta;
	float da;
	void accept()
	{
		E_id=scan.nextInt();
		E_name=scan.next();
		basic_salary=scan.nextFloat();
	}
	
	void calculate()
	{
		hra=(12*basic_salary)/100;
		ta=(8*basic_salary)/100;
		da=(9*basic_salary)/100;
		gross=hra+ta+da;
	}
	
	void display()
	{
		System.out.println("E_id:"+E_id);
		System.out.println("E_name:"+E_name);
		System.out.println("basic salary:"+basic_salary);
		System.out.println("hra:"+hra);
		System.out.println("ta:"+ta);
		System.out.println("da:"+da);
		System.out.println("gross:"+gross);
	}
	void detClass()
	{
		if(gross>=25000)
		{
			System.out.println("remark:"+"A");
		}
		else if(gross>=10000 && gross< 25000)
		{
			System.out.println("remark:"+"B");
		}
		else
		{
			System.out.println("remark:"+"C");
		}
	}
}
public class Emain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.accept();
		e.calculate();
		e.display();
		e.detClass();
				
	}

}
