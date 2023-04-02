import java.util.*;
import java.io.*;
import java.sql.*;

public class Main1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","Skc@2001");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from customer");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ID:");
		int id=scan.nextInt();
		System.out.println("Enter name:");
		String name=scan.next();
		System.out.println("Enter location:");
		String loc=scan.next();
		System.out.println("Enter age:");
		int age=scan.nextInt();
		
		PreparedStatement ps=con.prepareStatement("Insert into customer values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, loc);
		ps.setInt(4, age);
		
		int c=ps.executeUpdate();
		System.out.println(c+" record inserted");
		
		PreparedStatement ps1=con.prepareStatement("Update customer set name=? where id=?");
		System.out.println("Enter ID:");
		int id1=scan.nextInt();
		System.out.println("Enter name:");
		String name1=scan.next();
		ps.setInt(1, id1);
		ps.setString(2, name1);
		int c1=ps.executeUpdate();
		System.out.println(c1+" record updated");
		
		PreparedStatement ps2=con.prepareStatement("delete from customer where id=?");
		System.out.println("Enter ID:");
		int id2=scan.nextInt();
		ps.setInt(1, id2);
		int c2=ps.executeUpdate();
		System.out.println(c2+" record deleted");
		
		con.close();
	}

}
