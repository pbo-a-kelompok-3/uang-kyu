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
    if (this.activities.size() < 1)
      return -1;
    
    int index = -1;
    boolean isFound = false;
    for (Activity activity : activities) {
      index++;

      if (activity.id == id) {
        isFound = true;
        break;
      }
    }
    index = isFound ? index : -1;

    return index;
  }

  public Activitylist getAll() {
    for (Activity activity : activities) {
      System.out.println(
          activity.id + "\t" + activity.description + "\t" + activity.nominal + "\t" + activity.getTypeAsText());
    }
    return this;
  }

  public Activitylist delete(int id) {
    int index = this.getIndexFromId(id);
    if (index < 0) {
      System.out.println("Id : " + id + " tidak ditemukan");
    } else {
      this.activities.remove(index);
      System.out.println("Id : " + id + " berhasil dihapus !");
    }
    return this;
  }

  public Activitylist update(int id, Activity activity) {
    int index = this.getIndexFromId(id);
    if (index < 0) {
      System.out.println("Id : " + id + " tidak ditemukan");
    } else {
      this.activities.set(index, activity);
      System.out.println("Id : " + id + " berhasil diperbarui");
    }
    return this;
  }
}
