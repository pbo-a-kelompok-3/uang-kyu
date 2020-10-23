package uangkyu;

import java.util.ArrayList;

public class Activitylist {
  public ArrayList<Activity> activities = new ArrayList<Activity>();
  
  public Activitylist insert(Activity activity) {
    this.activities.add(activity);
    System.out.println("Aktifitas " + activity.name + " berhasil ditambahkan");
    return this;
  }

  public Activitylist getAll() {
    for (Activity activity : activities) {
      System.out.println(activity.name + "\t" + activity.nominal + "\t" + activity.type);
    }
    return this;
  }
}
