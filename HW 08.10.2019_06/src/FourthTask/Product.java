package FourthTask;

import java.util.ArrayList;

public class Product {
	private String name;
	private float price;
	
	protected Product(String name,float price) {
		this.name=name;
		this.price=price;
	}
	
	protected float getprice() {
		return this.price;
	}
	
	protected String getname() {
		return this.name;
	}
	
	protected static int get2(ArrayList<Product> c,String q,int n) {
		if(n==c.size()) return -1;
		if(q.equals(c.get(n).getname())) return n;
		else return get2(c,q,n+1);
	}
	
}
