package uangkyu;

import java.util.ArrayList;

public class Activitylist {
  public ArrayList<Activity> activities = new ArrayList<Activity>();
  
  public Activitylist insert(Activity activity) {
    int activitiesLength = this.activities.size();
    
    if (activitiesLength != 0) {
      Activity lastActivity = this.activities.get(this.activities.size() - 1);
      activity.id = lastActivity.id + 1;
    } else {
      activity.id = 0;
    }

    this.activities.add(activity);
    System.out.println("Aktifitas " + activity.description + " berhasil ditambahkan");
    return this;
  }

  public int getIndexFromId(int id) {
    Activity highestId = this.activities.get(this.activities.size() - 1);
    
    int index = 0;
    for (int i = 0; i < highestId.id; i++) {
      if (i == id) {
        index = 0;
        break;
      }
    }

    return index;
  }

  public Activitylist getAll() {
    for (Activity activity : activities) {
      System.out.println(activity.id + "\t" + activity.description + "\t" + activity.nominal + "\t" + activity.type);
    }
    return this;
  }

  public Activitylist delete(int id) {
    int index = this.getIndexFromId(id);
    this.activities.remove(index);
    return this;
  }
}
