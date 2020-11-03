package uangkyu;

public class Activity {
  public int id = 0;
  public int createdAt = 0;
  public int updatedAt = 0;
  public int nominal;
  public String description;
  public int type;

  public String getTypeAsText() {
    return type == 1 ? "Pemasukan" : "Pengeluaran";
  }

  public Activity Id(int id) {
    this.id = id;
    return this;
  }

  public Activity CreatedAt(int createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Activity UpdatedAt(int updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Activity Nominal(int nominal) {
    this.nominal = nominal;
    return this;
  }

  public Activity Description(String description) {
    this.description = description;
    return this;
  }

  public Activity Type(int type) {
    this.type = type;
    return this;
  }

  public int getId() {
    return id;
  }

  public int getCreatedAt() {
    return createdAt;
  }

  public int getUpdatedAt() {
    return updatedAt;
  }

  public String getDescription() {
    return description;
  }

  public int getNominal() {
    return nominal;
  }

  public int getType() {
    return type;
  }
}
