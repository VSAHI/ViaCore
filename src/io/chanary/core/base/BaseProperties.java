package io.chanary.core.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import io.chanary.core.type.ResultType;

public class BaseProperties {

	public BaseProperties() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultType saveProperties() {
	 try (OutputStream output = new FileOutputStream("properties/config.properties")) {

         Properties prop = new Properties();

         // set the properties value
         prop.setProperty("version", "0.1.0.191103");        

         // save properties to project root folder
         prop.store(output, null);

//         System.out.println(prop);
         return new ResultType("true");

     } catch (IOException io) {
       //  io.printStackTrace();         
     }
	return null;

	}
	
	public String readProperties(String fileName, String key) {
		
	 String retSt="";
	 
	 try  {

         Properties prop = new Properties();
         prop.load(BaseProperties.class.getResourceAsStream(fileName));
         retSt = prop.getProperty(key);    

     } catch (Exception e) {
    	 try {
			InputStream input = new FileInputStream("properties/"+fileName);
			 Properties prop = new Properties();
	         prop.load(input);
	         retSt = prop.getProperty(key);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	    
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	} 
	 
	 return retSt;
	}
}
