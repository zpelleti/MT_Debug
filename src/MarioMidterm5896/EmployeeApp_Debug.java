package MarioMidterm5896;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EmployeeApp_Debug {

	public static void main(String[] args) throws IOException {

		for (int i = 0; i < 2; i++) {
		String userIn = JOptionPane.showInputDialog(null, "Please enter your ID");
		int ID = Integer.parseInt(userIn);
		while(ID < 1001 || ID > 9999) {
			JOptionPane.showMessageDialog(null, "Enter valid ID");
			 userIn = JOptionPane.showInputDialog(null, "Please enter your ID");
			 ID = Integer.parseInt(userIn);
		}
		String name = JOptionPane.showInputDialog(null, "Enter your name");
		String add = JOptionPane.showInputDialog(null, "Enter address");
		String cie = JOptionPane.showInputDialog(null, "Enter company");
		userIn = JOptionPane.showInputDialog(null, "Enter annual salary");
		double salary = Double.parseDouble(userIn);
		while(salary < 40000 | salary > 90000) {
			JOptionPane.showMessageDialog(null, "Enter valid salary");
			userIn = JOptionPane.showInputDialog(null, "Enter annual salary");
			salary = Double.parseDouble(userIn);			
		}
		/**
		 * STRUGGLE HERE: don't forget to enter parameters accepted in employee object
		 * (Same order - go see class Employee)
		 */
		Employee employee = new Employee( name, add, ID,  cie, salary );
		
		write(employee);
		}
		read();
		
	}
	public static void write(Employee emp) throws IOException {
		
		FileWriter fwFields = new FileWriter("FW Fields.txt", true);
		FileWriter fwID = new FileWriter("FW ID.txt", true);
		
		PrintWriter pwFields = new PrintWriter(fwFields);
		PrintWriter pwID = new PrintWriter(fwID);
		
		/**
		 * STRUGGLE HERE: pwFields.print = writes on file, (println = new line), 
		 * emp.getID = object (emp), getID (constr. method), \t (format on file)  
		 */
		pwFields.print(emp.getID() +"\t");
		pwFields.print(emp.getName() +"\t");
		pwFields.print(emp.getAddress() +"\t");
		pwFields.print(emp.getCie() +"\t");
		pwFields.println(emp.getSalary() +"\t");
		
		pwID.println(emp.getID() +"\t");

		/**
		 * Close BOTH FileWriter and PrintWriter
		 */
		pwFields.close();
		pwID.close();
		
	}
	public static void read() throws FileNotFoundException {
		
		/**
		 * STRUGGLE HERE: to read: Open files you want to read using File / file object name / file actual name ( .txt )
		 */
		File fwFields = new File("FW Fields.txt");
		File fwID = new File("FW ID.txt");
			
		/**
		 * import Scanner, two objects , read the opened files 
		 */
		Scanner Fread = new Scanner(fwFields);
		Scanner Iread = new Scanner(fwID);
		
		/** 
		 * STRUGGLE HERE: we need to read (Scan) and print all info on the files (hasNext())
		 * Add a loop and counter ( to enumerate )
		 * Then print on console , add count...
		 * 
		 * First: Header for all the info in console: 
		 */
		System.out.println("#. \t ID \t NAME \t ADDRESS \t SALARY \t COMPANY \t ");
		
		
		int count = 1;
		
		while(Fread.hasNext() && Iread.hasNext()) {
			/**
			 * STRUGGLE HERE: 
			 * print out:  Fread & Iread : ADD  nextLine() so that it reads all 
			 * lines scanned from the file.  
			 */			
			System.out.println(count + "\t" + Fread.nextLine() + "\t" + Iread.nextLine());
			count++;
			
		}
		//close both files out of while loop :
		Fread.close();
		Iread.close();
		
		
		
		
	}
	
	
}
