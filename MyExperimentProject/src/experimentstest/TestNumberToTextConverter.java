/**
 * 
 */
package experimentstest;
//import javax.swing.JOptionPane;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import experiments.NumberToTextConverter;

/**
 * @author sanja
 *
 */
class TestNumberToTextConverter {

	NumberToTextConverter nttc = new NumberToTextConverter();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * Test method for {@link experiments.NumberToTextConverter#ConvertNumberToText(int, java.lang.String[])}.
	 */
	@Test
	void testConvertNumberToText() {
		
		try {
			Properties prop = new Properties();
		       
    	   File file = new File ("C:\\Users\\sanja\\git\\NumberConversionProject\\MyExperimentProject\\NumberToTextMapping.properties");
			FileInputStream stream = new FileInputStream(file);
	

			prop.load(stream);
			stream.close();
			@SuppressWarnings("rawtypes")
			Enumeration enum1 = prop.keys();
			int counter = 0;
			while(enum1.hasMoreElements()) {
				 counter+= 1;
				String key = (String) enum1.nextElement();
				String value = prop.getProperty(key);
				String[] result = new String[1];
			    result[0]="";
			    int num = Integer.parseInt(key);
			    String[] results = nttc.ConvertNumberToText(num, result);
			
			    System.out.println ("Converter value:" + results[0] +"  Test Value: " + value);
			    assertEquals(results[0].trim(),value.trim());
			    //assertTrue(true);
		
			    // String test1;
			    //  test1= JOptionPane.showInputDialog("Please input a number (between 1 and 100,000 for conversion to text: ");

			    // int int1 = Integer.parseInt(test1);
			    //System.out.println("Inpt integer is:"+ int1);
		
			    //assertTrue(true);
					
			}//end while
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
