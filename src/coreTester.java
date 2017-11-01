import java.util.Arrays;

public class coreTester {

	public static void main(String[] args) {
		
		core c1 = new core("1a1-128");
		core c2 = new core("2m1");
		
		try {
			c1.setGrandmaster();
			//c2.setGrandmaster();
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println(c1.getCoreMark() + " " + Arrays.toString(c1.getGrandmaster()));
		//System.out.println(Arrays.toString(c2.getGrandmaster()));
		

	}

}
