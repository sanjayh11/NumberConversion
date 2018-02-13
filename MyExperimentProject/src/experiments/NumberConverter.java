package experiments;

import javax.swing.JOptionPane;

public class NumberConverter {
	
	public NumberConverter() {
		
		
	}

	public static void main(String[] args) {
		
		  String [] result = new String[1];
          result[0] = "";
    	//System.out.println ("in the main");
    	
    	/* Below is to accept a number from a dialog and then call the number converter class*/
    	
    	String test1;
        test1= JOptionPane.showInputDialog("Please input a number (between 1 and 100,000 for conversion to text: ");

          int int1 = Integer.parseInt(test1);
          //System.out.println("Entered value is :" + int1); 
          if(int1 == 0) {
        	 // System.out.println("Invalid input. Please enter a positive number upto 100000");
        	  JOptionPane.getRootFrame().dispose();  	  
          }
          else {
          if(ConvertNumberToText(int1, result) == true) {
        	  if (int1 >0 && int1<100001) {
              System.out.println(int1  + "\t" + result[0]);
        	  }
        	  else {
        		  System.out.println("Invalid input. Please enter a positive number upto 100000");
        	  }
          }
          }

	}
	
	static public boolean HelperConvertNumberToText(int num, String[] result) 
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
      
        if(num > 100000) 
            return false; 
      
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
        return true; 
    } 

    static public boolean ConvertNumberToText(int num, String[] result)
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
            //System.out.println(num + " \tNot Supported"); 
            return false; 
        } 
      
        if( num == 0) 
        {
           System.out.println(num + " \tZero"); 
           return false; 
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
        return true; 
    }

}
