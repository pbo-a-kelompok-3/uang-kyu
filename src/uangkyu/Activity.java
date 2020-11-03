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

  public void setId(int id) {
    this.id = id;
  }

  public void setCreatedAt(int createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(int updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setNominal(int nominal) {
    this.nominal = nominal;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setType(int type) {
    this.type = type;
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
