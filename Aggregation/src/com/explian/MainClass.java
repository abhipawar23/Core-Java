package com.explian;

public class MainClass {

	public static void main(String[]args) {
		Company c = new Company();
		c.setCid(10);
		c.setCname("TCS");
		c.setCaddress("Pune");
		
		Employee e = new Employee();
		e.setEname("ABhi");
		e.setEid(1);
		e.setCompany(c);
		
		Employee e1= new Employee();
		e1.setEid(2);
		e1.setEname("Shiv");
		e1.setCompany(c);
		
		System.out.println(e1.getEid()+" "+e1.getEname()+" "+e1.getCompany().getCid()+" "+e1.getCompany().getCname()+" "+e1.getCompany().getCaddress());

		
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getCompany().getCid()+" "+e.getCompany().getCname()+" "+e.getCompany().getCaddress());

		Company c1 = new Company();
		c1.setCid(1234);
		c1.setCname("HCL");
		c1.setCaddress("Mumbai");
		
		Employee e3 = new Employee();
		e3.setEid(11);
		e3.setEname("PAsha");
		e3.setCompany(c1);
		System.out.println(e3.getEid()+" "+e3.getEname()+" "+e3.getCompany().getCid()+" "+e3.getCompany().getCname()+" "+e3.getCompany().getCaddress());

		
	}
}
