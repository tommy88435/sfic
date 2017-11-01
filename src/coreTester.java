import java.util.Arrays;

public class coreTester {

	public static void main(String[] args) {
		
		core c1 = new core("1a1-128");
		
		c1.setGrandmaster();
		
		System.out.println(Arrays.toString(c1.getGrandmaster()));
		
		

	}

}
