package experiments;
import javax.swing.JOptionPane; 

public class DialogBoxTest {

	public DialogBoxTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			    String test1, test2, test3;

		        test1= JOptionPane.showInputDialog("Please input mark for test 1: ");

		        test2= JOptionPane.showInputDialog("Please input mark for test 2: ");

		        test3= JOptionPane.showInputDialog("Please input mark for test 3: ");

		        int int1 = Integer.parseInt(test1);
		        int int2 = Integer.parseInt(test2);
		        int int3 = Integer.parseInt(test3);

		System.out.println ("test-1 mark:" + int1);
		System.out.println ("test-2 mark:" + int2);
		System.out.println ("test-3 mark:" + int3);  
		
	}

}
