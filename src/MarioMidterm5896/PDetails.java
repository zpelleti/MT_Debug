package MarioMidterm5896;
/**
 * 
 * Class with fields name and address
 * with constructors and methods for all fields: 
 * @author zpell
 *
 */
		
public class PDetails {

	/**
	 * member variables
	 */
	private String name;
	private String address;
	
	public PDetails() {
		this.name = "X";
		this.address = "Y";
		
	}
	public PDetails(String name, String address) {
		this.name = name;
		this.address = address;
		
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
}
