import java.util.*;

class Student
{
	Scanner scan=new Scanner(System.in);
	int st_id;
	String st_name;
	int m1,m2,m3;
	int total_attendance=280;
	int nop,total_marks;
	float avg,percentage_a;
	String reg_remark;
	
	void accept()
	{
		st_id=scan.nextInt();
		st_name=scan.next();
		m1=scan.nextInt();
		m2=scan.nextInt();
		m3=scan.nextInt();
		nop=scan.nextInt();
	}
	
	void calc()
	{
		total_marks=m1+m2+m3;
		avg=(m1+m2+m3)/3;
		percentage_a=(nop/total_attendance)*100;
	}
	
	void regularity()
	{
		if(percentage_a>=75)
		{
			reg_remark="Good";
		}
		else if (percentage_a<75 && percentage_a>50)
		{
			reg_remark="OK!";
		}
		else
		{
			reg_remark="Need to attend more!!";
		}
	}
	
	void display()
	{
		System.out.println("st_id:"+st_id);
		System.out.println("st_name:"+st_name);
		System.out.println("m1:"+m1);
		System.out.println("m2:"+m2);
		System.out.println("m3:"+m3);
		System.out.println("Total Marks:"+total_marks);
		System.out.println("Avg_Marks:"+avg);
		System.out.println("Percentage Attendance:"+percentage_a);
		System.out.println("Remark on Regularity:"+reg_remark);
	}
}
public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.accept();
		s.calc();
		s.regularity();
		s.display();
	}

}
