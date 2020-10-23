package uangkyu;

import java.util.ArrayList;

public class Activitylist {
  public ArrayList<Activity> activities = new ArrayList<Activity>();
  
  public Activitylist insert(Activity activity) {
    activity.id = this.activities.size();
    this.activities.add(activity);
    System.out.println("Aktifitas " + activity.description + " berhasil ditambahkan");
    return this;
  }

  public Activitylist getAll() {
    for (Activity activity : activities) {
      System.out.println(activity.id + "\t" + activity.description + "\t" + activity.nominal + "\t" + activity.type);
    }
    return this;
  }
}
