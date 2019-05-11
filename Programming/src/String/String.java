//wajp to define a method to calculate the no between two days
package String;

class Date
{
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,31,30,31,30,31};
	
	Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0)
		{
			month[2]=29;
		}
	}
	int noOfDays()
	{
		
	}
	
	
}

public class String 
{
	public static void main(String[] args) {
		Date d1= new Date(18, 9, 1989);
		Date d2= new Date(22, 4, 2019);
		 
		int nd1=d1.noOfDays();
		int nd2=d2.noOfDays();
		System.out.println("Number of days btw the dates: "+(nd2-nd1\));
	}
}




