package MarioMidterm5896;

public class Employee {
	/**
	 * create two PersonalDetails objects:
	 */

	private int ID;
	private String cie;
	private double salary;
	//***PDetails is passed as pd
	private PDetails pd;
	
	
	public Employee() {
		this.ID = 0;
		this.cie = "A";
		this.salary = 0.0;
		//***Object is created here: 
		this.pd = new PDetails("X", "Y");
		
	}
	public Employee(String name, String address, int ID, String cie, double salary) {
		//***Object created here :
		this.pd = new PDetails(name, address);
		this.ID = ID;
		this.cie = cie;
		this.salary = salary;
		
	}
	public int getID() {
		return ID;
	}
	public String getCie() {
		return cie;
	}
	public double getSalary() {
		return salary;
	}
	//***To get details separately for object: use string type, then return object:
	public String getName() {
		return pd.getName();
	}
	public String getAddress() {
		return pd.getAddress();
		
	}
	
}
