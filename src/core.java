import java.util.Scanner;
import java.util.Arrays;

public class core {
	
	Scanner scan = new Scanner(System.in);
	private String coreMark = " ";
	
	private int [] control = new int[7];
	private int [] grandmaster = new int[7];
	private int [] operating = new int[7]; 
	
	private String gm = "";
	private String ctrl = "";
	private String oper = "";
	
	private int[] topPin = new int[7];
	private int[] buildUpPin = new int[7];
	private int[] masterPin = new int[7];
	private int[] bottomPin = new int[7];
	
	public String getCoreMark() {
		return coreMark;
	}

	public void setCoreMark(String coreMark) {
		this.coreMark = coreMark;
	}

	
	public core(String coremark) {  // Constructor
		this.coreMark = coremark;
		
		for(int i = 0 ; i <= grandmaster.length -1; i++) {
			grandmaster[i] = 0;
		} 
		
		for(int i = 0 ; i <= control.length-1; i++) {
			control[i] = 0;
		} 
		
		for(int i = 0 ; i <= operating.length-1; i++) {
			operating[i] = 0;
		} 
		
		
	}
	

	public int[] getControl() {
		return control;
	}

	public int[] getGrandmaster() {
		return grandmaster;
	}

	public int[] getOperating() {
		return operating;
	}

	public core() {
		
	}
	
	public void setGrandmaster() throws Exception{
		try {
		for(int i = 0 ; i <= grandmaster.length-1; i++) {
			System.out.println("Please enter key cut " + (i+1));
			this.grandmaster[i] = scan.nextInt();
		} 
		
		//System.out.println("Grandmaster key cuts succesfully generated");
		}
		
		catch(java.util.InputMismatchException e) {
			System.out.println("Please enter a number");
			
		}
	}
	
		
	
	
	public void setControl() {
		for(int i = 0 ; i <= control.length-1; i++) {
			System.out.println("Please enter key cut " + (i+1));
			control[i] = scan.nextInt();
		} 
		
		System.out.println("Control key cuts succesfully generated");
	}
	
	public void setOperating() {
		for(int i = 0 ; i <= operating.length-1; i++) {
			System.out.println("Please enter key cut " + (i+1));
			operating[i] = scan.nextInt();
		} 
		
		System.out.println("Operating key cuts succesfully generated");
	}
	
	public void putToString() {
		this.ctrl = Arrays.toString(control);
		this.gm = Arrays.toString(grandmaster);
		this.oper = Arrays.toString(operating);
	}
	
	
	
	
	
	

}
