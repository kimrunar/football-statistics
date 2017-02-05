package com.kimrunar.fotballanalyzer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Datastorage {
	
	String file;
	
	
	public Datastorage(String file){
		this.file = file;
	}
	ArrayList<String[]> event = new ArrayList<String[]>() ;
	
	
	String[] fieldData;
	
    public  void readCVS(String splitpattern) throws IOException {

        
        String line = "";
       
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        	
        	
        	br.readLine(); //Jumping first line (Categories)
        	while(line != null){
	        	
	        	line = br.readLine();
	        	if(line != null){
	        		fieldData =line.split(splitpattern);
	        	}
	        	event.add(fieldData);   
	        	
        	}
        	    
            	
            }
        

    }
    
    
    
    

    public ArrayList<String[]> getEvent(){
    	return event;
    }
    
    public String[] getFieldData(){
    	return fieldData;
    }
    
    public void writeToFile(int[] values, String leftOfValue, String rightOfValue,String filename) throws IOException{
    	String l = leftOfValue;
    	String r = rightOfValue;
    	  BufferedWriter outputWriter = null;
    	  outputWriter = new BufferedWriter(new FileWriter(filename));
    	  for (int i = 0; i < values.length; i++) {
    	    
    	    outputWriter.write(l + values[i] +r);
    	    
    	  }
    	  outputWriter.newLine();
    	  outputWriter.flush();  
    	  outputWriter.close();  
    	}
    
    

}
