package com.kimrunar.fotballanalyzer;
import java.util.ArrayList;
import java.util.List;

public class EventMaker{
		private List<Event> events;
  
  	public EventMaker(List<String[]> input) {
      events = new ArrayList<Event>();
      
      for(int i=0; i<input.size(); i++) {
      	events.add(new Event(i, input.get(i)));
      }
    }
  
  public List<Event> GetEvents() {
  	return this.events;
  }
  
  public Statistics GetStatistics() {
      Statistics statistics = new Statistics();
      for(Event event : events) {
      	statistics.NewEvent(event);
      }
      return statistics;
    }

   }
  
  
  

  	
  
