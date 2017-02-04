
package com.kimrunar.fotballanalyzer;
import com.kimrunar.fotballanalyzer.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  [0] = "id_odsp"
 *  [1] = "id_event"
 *  [2] = "sort_order"
 *	[3] = "time"
 **	[4] = "text"
 **	[5] = "event_type"
 **	[6] = "event_type2"
 **	[7] = "side"
 **	[8] = "event_team"
 **	[9] = "opponent"
 **	[10] = "player"
 **	[11] = "player2" 
 **	[12] = "player_in"
 **	[13] = "player_out"
 **	[14] = "shot_place"
 **	[15] = "shot_outcome"
 **	[16] = "is_goal"
 **	[17] = "location"
 **	[18] = "bodypart"
 **	[19] = "assist_method"
 **	[20] = "situation"
 **	[21] = "fast_break"
 */
public class Statistics {
  	private int[] goals;
   
    public Statistics() {
      this.goals = new int[130];
    }

    public void NewEvent(Event event) {
      if(event.IsGoal()) {
    	  
        goals[event.GetMinute() / 1]++;
      }
    }

    public int NumberOfGoalsInInterval(int interval) {
      return goals[interval];
    }
    
    public int[] getGoals(){
    	return goals;
    }
  }
