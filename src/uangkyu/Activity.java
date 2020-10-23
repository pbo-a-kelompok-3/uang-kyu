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
}
