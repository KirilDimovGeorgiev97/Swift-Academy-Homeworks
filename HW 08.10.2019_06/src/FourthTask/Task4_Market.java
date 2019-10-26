package FourthTask;

import java.util.*;

import SecondTask.Credentials;

public class Task4_Market {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String person=sc.nextLine();
		String[] persons=person.split(";");
		Person pcurrent;
		ArrayList <Person> p= new ArrayList<Person>();
		
		for(int i=0;i<persons.length;i++) {
			pcurrent=new Person(persons[i].substring(0,persons[i].indexOf("=")));
			pcurrent.setbalance(Float.parseFloat(persons[i].substring(persons[i].indexOf("=")+1,persons[i].length())));
			p.add(pcurrent);
		}
		//System.out.println(persons[0].substring(0,persons[0].indexOf("=")));
		//System.out.println(persons[1].substring(persons[0].indexOf("=")+1,persons[1].length()));
		//sc.nextLine();
		//String product=sc.nextLine();
		
		//sc.nextLine();
		String product=sc.nextLine();
		String[] products=product.split(";");
		Product prcurrent;
		ArrayList <Product> pr= new ArrayList<Product>();
		for(int i=0;i<products.length;i++) {
			prcurrent=new Product(products[i].substring(0,products[i].indexOf("=")),
					Float.parseFloat(products[i].substring(products[i].indexOf("=")+1,products[i].length())));
			pr.add(prcurrent);
		}
		
		String buying;
		String[] buyings=new String[2];
		do {
			buying=sc.nextLine();
			if(buying.equals("END")) break;
			buyings=buying.split("\\s+");
			prcurrent=pr.get(Product.get2(pr,buyings[1],0));
			pcurrent=p.get(Person.get(p,buyings[0],0));
			if(pcurrent.getbalance()-prcurrent.getprice()>=0) {
				pcurrent.setboughtproduct(prcurrent);
				System.out.println(pcurrent.getname()+" bought "+prcurrent.getname());
			}else System.out.println(pcurrent.getname()+" can't afford "+prcurrent.getname());
			
		}while(true);
		
		Person.print(p);
	}
	
	
	

}
