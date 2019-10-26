package FourthTask;

import java.util.*;

public class Person {
	private String name;
	private float balance;
	private ArrayList<Product> products=new ArrayList<Product>();
	
	protected Person(String name) {
		this.name=name;
	}
	
	protected boolean setbalance(float balance) {
		if(balance<0) return false;
		this.balance=balance;
		return true;
	}
	
	protected void setboughtproduct(Product p) {
		if(this.getbalance()>=p.getprice()) {
			this.balance=this.getbalance()-p.getprice();
			products.add(p);
		}
	}
	
	
	
	protected float getbalance() {
		return this.balance;
	}
	
	protected String getname() {
		return this.name;
	}
	
	protected ArrayList<Product> getproducts(){
		return this.products;
	}

	
	protected static int get(ArrayList<Person> c,String q,int n) {
		if(n==c.size()) return -1;
		if(q.equals(c.get(n).getname())) return n;
		else return get(c,q,n+1);
	}
	
	protected void printP() {
		System.out.print(this.getname());
		for(Product b:this.products) {
			System.out.print(" "+b.getname());
		}
		System.out.println();
	}
	
	protected static void print(ArrayList<Person> c) {
		for(Person a:c) {
			a.printP();
		}
	}
	
}
