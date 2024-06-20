package project;

public class car {
// has part,state or propertise
	String name;
	int cost;
	float mileage;
	
	//does part or behavior
	void start()
	{
	System.out.println("car is starting");

	System.out.println(" car is accelerating");
 }
void stop()
{
System.out.println("car can stop");
}
}
class type {
	public static void main (String[] args) {
car C1=new car();
C1.stop();
	}
}