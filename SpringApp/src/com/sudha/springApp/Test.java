package com.sudha.springApp;
import org.springframework.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("springApp1.xml");
		BeanFactory fac=new XmlBeanFactory(r);
		Product p= (Product) fac.getBean("pBean");
		p.show();

	}

}
