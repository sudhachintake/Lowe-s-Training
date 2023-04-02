package com.sudha.springApp;

public class Product {
		String pName;
		
		public void setpName(String pName) {
			this.pName = pName;
		}
		
//		public Product(String pName) {
//			super();
//			this.pName = pName;
//		}
//		

		public void show()
		{
			System.out.println("Thanx for purchasing...."+pName);
		}


}


/* Spring Framework is a lightweight opensource platform for the developers 
which can be used for application development where the running platfor wont matter

the steps to follow to create a spring application are
1)Create java project
2)load the jar files
3)create bean class
4)create xml file to get the properties
5)create test class


*/