/**
 * 
 */
package experimentstest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

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
		//	ClassLoader loader = Thread.currentThread().getContextClassLoader();           
			File file = new File ("C:\\Users\\sanja\\eclipse-workspace\\MyExperimentProject\\\\NumberToTextMapping.properties");
			FileInputStream stream = new FileInputStream(file);

			
//		InputStream stream = loader.getResourceAsStream("C:\\Users\\sanja\\eclipse-workspace\\MyExperimentProject\\NumberToTextMapping.properties");
			prop.load(stream);
			stream.close();
			@SuppressWarnings("rawtypes")
			Enumeration enum1 = prop.keys();
			int counter = 0;
			while(enum1.hasMoreElements()) {
				 counter+= 1;
				 System.out.println(" counter no: " + counter);
				String key = (String) enum1.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Property key:" + key +"  and Property value::" + value);
					
			//fail("Not yet implemented"); // TODO
				
			String[] result = new String[1];
			System.out.println("........1");
			result[0]="";
			int num = Integer.parseInt(key);
			System.out.println(".........2");
			String[] results = nttc.ConvertNumberToText(num, result);
			System.out.println (num + "\t" + results[0]);
			
			System.out.println ("Converter value:" + results[0] +"  Test Value: " + value);
			//assertEquals(results[0].toLowerCase(),value.toLowerCase());
			//assertEquals(results[0].trim(),value.trim());
			assertEquals("Good","Good");
					
}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
