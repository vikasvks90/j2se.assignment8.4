/**
* <h1>CopyFile</h1>
* This program shows how we can copy the content of a source file in another file
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/
package assignment8.session4;

import java.io.*;

public class CopyFile 
{
    public static void main(String[] args)
    {	
 
    	try{
    		//getting the FileInputStream object which will read the file from the mentioned path 
    		FileInputStream  instream = new FileInputStream("D:\\CopyFile Example\\MyInputFile.txt");
    		//getting the FileOutputtream object which will write to the file at the mentioned path 
    		FileOutputStream outstream = new FileOutputStream("D:\\CopyFile Example\\MyOutputFile.txt");
 
    	    byte[] buffer = new byte[1024];
 
    	    int length ;
    	    
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	}
    }
}