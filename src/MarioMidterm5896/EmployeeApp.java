package MarioMidterm5896;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EmployeeApp {
/**
 * @throws IOException 
 * EmployeeApp object declares objects, prompts user for details, 
 * using GUI, for employee details ( name + address) , company name and salary
 * per year.
 * ID must be between 1001 and 9999, salary between 40k and 90k.
 * Save that info to a file named EmployeeInformation.txt
 * 
 * @param args
 * @throws  
 */
	public static void main(String[] args) throws IOException   {
		//for loop allows to create 4 different files: 
		for(int i = 0; i < 2; i++) {
			
			String inputID = JOptionPane.showInputDialog(null, "Enter your ID: ");
			int ID = Integer.parseInt(inputID);				
			if(ID < 1001 || ID > 9999) {
				inputID = JOptionPane.showInputDialog(null, "Enter a valid ID: ");
				ID = Integer.parseInt(inputID);
				}
			
			String name = JOptionPane.showInputDialog(null, "Enter your name: ");			 
			String address = JOptionPane.showInputDialog(null, "Enter your address: ");			
			String cie = JOptionPane.showInputDialog(null, "Enter your company name: ");						
			
			String inputSal = JOptionPane.showInputDialog(null, "Enter your yearly salary: ");			
			double salary = Double.parseDouble(inputSal);
			if(salary <= 40000 || salary >= 90000 ) {
				inputSal = JOptionPane.showInputDialog(null, "Enter a valid salary: ");
				salary = Double.parseDouble(inputSal);
					
			}
			
			//now create object Employee:
			Employee employee = new Employee(name, address, ID, cie, salary);
			//call writing method to add to file: 
			write(employee);
			
		}
			read();
		
	}
	public static void write(Employee emp) throws IOException{
		
		FileWriter fwInfo = new FileWriter("Employee Info.txt", true);
		FileWriter fwFields = new FileWriter("Employee Fields.txt", true);
			
		PrintWriter pwInfo = new PrintWriter(fwInfo);
		PrintWriter pwFields = new PrintWriter(fwFields);
		
		pwInfo.print(emp.getID() + "\t");
		pwInfo.print(emp.getName() + "\t\t");
		pwInfo.print(emp.getAddress() + "\t");
		pwInfo.print(emp.getSalary() + "\t\t");
		pwInfo.print(emp.getCie() + "\t");
		
		pwFields.print(emp.getID());
		
		fwInfo.close();
		fwFields.close();
		pwInfo.close();
		pwFields.close();
		
		
	}
	
	public static void read() throws FileNotFoundException {
		//open file you want to read: 
			File fwInfo = new File("Employee Info.txt");
			File fwFields = new File("Employee Fields.txt");
		//read file using scanner: 
			Scanner fwIRead = new Scanner(fwInfo);
			Scanner fwFRead = new Scanner(fwFields);
			
			int count = 1;
			System.out.println("# \t ID \t NAME \t \t ADDRESS \t SALARY \t COMPANY");
			
			while(fwIRead.hasNext()){
				String info = fwIRead.nextLine();
				String id = fwFRead.nextLine();
				System.out.println("\n" + count + "\t" + info + "\t\t" + id );
				count++;
				
			}
			fwIRead.close();
			fwFRead.close();
			
		
	}

}
