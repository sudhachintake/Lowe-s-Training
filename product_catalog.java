import java.util.*;

class product
{
	Scanner scan=new Scanner(System.in);
	int p_id,qty,unit_price,stock,tc;
	String p_name;
	void accept()
	{
		 p_id=scan.nextInt();
		 p_name=scan.next();
		 qty=scan.nextInt();
		 unit_price=scan.nextInt();
		 stock=scan.nextInt();
		 tc=qty*unit_price;
	}
	void display()
	{
		System.out.println("p_id:"+p_id);
		System.out.println("p_name:"+p_name);
		System.out.println("qty:"+qty);
		System.out.println("unit_price:"+unit_price);
		System.out.println("stock:"+stock);
		System.out.println("tc:"+tc);
	}
}
public class product_catalog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p=new product();
		p.accept();
		p.display();

	}

}
