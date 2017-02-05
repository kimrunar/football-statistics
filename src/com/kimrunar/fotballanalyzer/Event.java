package com.kimrunar.fotballanalyzer;
public class Event{
	private String id;
  	private int minute;
  	private int goal;
  	private int eventType;
  	
  
  
 


	public Event(int idx, String[] input) {    	
	    	this.id = input[0];	    	
	    	String min = input[3].replace("\"","");
	    		this.minute = Integer.parseInt(min);
	    	String goal = input[16].replace("\"","");
	    		this.goal = Integer.parseInt(goal);
	    	String event_type = input[5].replace("\"","");
	    		this.eventType = Integer.parseInt(event_type);
	    	}
	    	    	
    
  
  	public String GetId() {
  		return this.id;
    }
  
  	public int GetMinute() {
  		return this.minute;
    }
  
	public boolean IsGoal() {
  		return this.goal == 1 ? true : false;
    }
	   public int getEventType() {
			return eventType;
		}

	
	
  }
