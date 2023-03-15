package com.sudha;

import java.util.*;

class product
{
	Scanner sc=new Scanner(System.in);
	int id,total_cost,remaining_stock,unit_price,qty,stock;
	String name;
	
	void accept()
	{
		System.out.println("Enter Product id:");
		id=sc.nextInt();
		System.out.println("Enter Product name:");
		name=sc.next();
		System.out.println("Enter Product's price:");
		unit_price=sc.nextInt();
		System.out.println("Enter Product quantity:");
		qty=sc.nextInt();
		System.out.println("Enter stock:");
		stock=sc.nextInt();
	}
	
	void calculate()
	{
		if(qty<stock)
		{
			total_cost=unit_price*qty;
			remaining_stock=stock-qty;
		}
		else
		{
			System.out.println("OUT OF STOCK");
		}
		
		System.out.println("Total cost: "+total_cost);
		System.out.println("Remaining stock: "+total_cost);
	}
}
public class product_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of products:");
		int no=scan.nextInt();
		
		for(int i=0;i<no;i++)
		{
			product pr=new product();
			pr.accept();
			pr.calculate();
		}
		

	}

}
