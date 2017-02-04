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
	
    public  void readLargerTextFile() throws IOException {

        
        String line = "";
       
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        	
        	
        	br.readLine(); //Jumping first line (Categories)
        	while(line != null){
	        	
	        	line = br.readLine();
	        	if(line != null){
	        		fieldData =line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
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
    
    public static void write (int[] x) throws IOException{
    	  BufferedWriter outputWriter = null;
    	  outputWriter = new BufferedWriter(new FileWriter("timeline.txt"));
    	  for (int i = 0; i < x.length; i++) {
    	    
    	    outputWriter.write("{y : " + x[i] +"},");
    	    
    	  }
    	  outputWriter.newLine();
    	  outputWriter.flush();  
    	  outputWriter.close();  
    	}
    
    

}
