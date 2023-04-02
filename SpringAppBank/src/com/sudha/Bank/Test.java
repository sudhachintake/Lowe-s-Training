package com.sudha.Bank;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
public static void main(String[] args) {
	Resource r = new ClassPathResource("App.xml");
	BeanFactory fac = new XmlBeanFactory(r);
	Bank i = (Bank) fac.getBean("bnkBean");
	i.disp();
}
}
