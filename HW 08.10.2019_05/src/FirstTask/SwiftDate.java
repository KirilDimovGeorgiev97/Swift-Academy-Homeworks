package FirstTask;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SwiftDate {
	private int year;
	private int month;
	private int date;
	
	protected void Setdate(int year,int month,int date) { //setter
		this.year=year;
		this.month=month;
		this.date=date;
	}
	
	protected int[] Getdate() { //getter
		int [] data=new int [3];
		data[0]=year;
		data[1]=month;
		data[2]=date;
		return data;
	}
	
	protected boolean isLeapYear() {
		boolean LeapYear=false;
		if(year%4==0&&year%100!=0) {
			LeapYear=true;
		}else if(year%4==0 && year%100==0 && year%400==0 ) {
			LeapYear=true;
		}
	return LeapYear;
	}
	
	protected int getCentury() {
		if(year<=-100) return (year/100)-1;
		else if(year<0 && year>-100) return -1;
		else if (year<100 && year>=0) return 1;
		else return (year/100)+1;
	}
	
	protected long getDaysDifference(SwiftDate other) {
		LocalDate O=LocalDate.of(other.year, other.month, other.date);
		LocalDate T=LocalDate.of(this.year, this.month, this.date);
		return ChronoUnit.DAYS.between(O,T);
	}
	
	protected void printInfo() {
		if(this.isLeapYear()==true) {
			//System.out.println(this.isLeapYear());
			System.out.printf("%d %d %d - %d century. It is LEAP Year \n",this.year,this.month,this.date,this.getCentury());
		}else {
			//System.out.println(this.isLeapYear());
			System.out.printf("%d %d %d - %d century \n.",this.year,this.month,this.date,this.getCentury());
		}
	}
	
}	
