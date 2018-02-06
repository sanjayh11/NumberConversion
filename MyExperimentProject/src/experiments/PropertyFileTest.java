/**
 * 
 */
package experiments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author sanja
 *
 */
public class PropertyFileTest {

	/**
	 * 
	 */
	public PropertyFileTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub

			Properties prop = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();           
			File file = new File ("C:\\Users\\sanja\\eclipse-workspace\\MyExperimentProject\\\\NumberToTextMapping.properties");
			FileInputStream stream = new FileInputStream(file);
		
			
//			InputStream stream = loader.getResourceAsStream("C:\\Users\\sanja\\eclipse-workspace\\MyExperimentProject\\NumberToTextMapping.properties");
			prop.load(stream);
			stream.close();
			Enumeration enum1 = prop.keys();
			while(enum1.hasMoreElements()) {
				String key = (String) enum1.nextElement();
				String value = prop.getProperty(key);
				System.out.println(key + ": " + value);
		
				
			}
			
			
			//String textValue = prop.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
