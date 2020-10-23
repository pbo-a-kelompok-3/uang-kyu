package uangkyu;

import java.util.ArrayList;

public class Activitylist {
  ArrayList<Activity> activities;
  
  public Activitylist insert(Activity activity) {
    this.activities.add(activity);
    return this;
  }
}
