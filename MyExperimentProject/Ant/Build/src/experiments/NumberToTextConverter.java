/**
 * 
 */
package experiments;

import javax.swing.JOptionPane;

/**
 * @author sanja
 *
 */
public class NumberToTextConverter {

	/**
	 * 
	 */
	public NumberToTextConverter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  String [] result = new String[1];
//          result[0] = "";
//    	System.out.println ("in the main");
//    	
//    	/* Below is to accept a number from a dialog and then call the number converter class*/
//    	
//    	String test1;
//        test1= JOptionPane.showInputDialog("Please input mark for test 1: ");
//
//          int int1 = Integer.parseInt(test1);
//          result = ConvertNumberToText(int1, result); 
//              System.out.println(int1  + "\t" + result[0]);

	}
	public String[] HelperConvertNumberToText(int num, String[] result) 
    { 
		//System.out.print("Inside Helper converter method");
        String [] strones = { 
          "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
          "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", 
          "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", 
        }; 
      
        String [] strtens = { 
            "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", 
            "Seventy", "Eighty", "Ninety", "Hundred"
        };

        result[0] = "";
        int single, tens, hundreds; 
      
        if(num > 1000) {
        	result[0] = "Invalid Number";
        	return result; 
        }
        hundreds = num / 100; 
        num = num - hundreds * 100; 
        if( num < 20) 
        { 
            tens = 0; // special case 
            single = num; 
        } 
        else
        { 
            tens = num / 10; 
            num = num - tens * 10; 
            single = num; 
        }
        
        if(hundreds > 0) 
        { 
           result[0] += strones[hundreds-1];
           result[0] += " Hundred ";
        } 
        if(tens > 0) 
        {
           result[0] += strtens[tens - 1];
           result[0] += " ";
        } 
        if(single > 0) 
        {
           result[0] += strones[single - 1];
           result[0] += " ";
        }
        
        
        return result; 
       
    } 

    public String[] ConvertNumberToText(int num, String[] result)
    {
    	//System.out.print("Inside Convert No to Text method");
        String tempString[] = new String[1]; 
        tempString[0] = "";
        int thousands; 
        int temp;
        result[0] = "";
        //if(num < 0 || num > 100000) 
        if(num < 0 || num > 100000) 
        { 
            System.out.println(num + " \tNot Supported"); 
            result[0]="Invalid Number: Not supported";
            return result; 
        } 
      
        if( num == 0) 
        {
           System.out.println(num + " \tZero"); 
           result[0]="Zero";
           return result; 
        } 
              
        if(num < 1000) 
        {   
            HelperConvertNumberToText(num, tempString); 
            result[0] += tempString[0]; 
        } 
        else
        { 
            thousands = num / 1000; 
            temp = num - thousands * 1000; 
            HelperConvertNumberToText(thousands, tempString);
            result[0] += tempString[0];
            result[0] += "Thousand ";              
            HelperConvertNumberToText(temp, tempString);
            result[0] += tempString[0]; 
        }
        return result; 
    }

}
