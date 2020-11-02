import java.io.Console;

import uangkyu.Activity;
import uangkyu.Activitylist;

public class App extends Activitylist {
  public static void main(String[] args) {
    App activitylist = new App();
    Console input = System.console();
    int pilihan = 0;

    while (pilihan != 6) {
      System.out.println("UANG KYU");
      System.out.println("1. Masukan aktifitas");
      System.out.println("2. List aktifitas");
      System.out.println("3. Cari aktifitas");
      System.out.println("4. Hapus aktifitas");
      System.out.println("5. Update aktifitas");
      System.out.println("6. Keluar program");
      System.out.println("=====================");
      System.out.print("Masukkan pilihan anda : ");
      pilihan = Integer.parseInt(input.readLine());

      App.getEqualLine();
      switch (pilihan) {
        case 1:

          System.out.println("TAMBAH AKTIFITAS");
          System.out.println();
          Activity activity = new Activity();

          System.out.print("Deskripsi\t: ");
          activity.description = input.readLine();

          System.out.print("Nominal\t\t: Rp");
          activity.nominal = Integer.parseInt(input.readLine());


          System.out.print("Type\n(1: Pemasukan/2: Pengeluaran)\t: ");
          activity.description = input.readLine();

          activitylist.insert(activity);
          break;
        case 2:
          System.out.println("LIST AKTIFITAS");
          activitylist.getAll();
          break;
        case 3:
          System.out.println("CARI AKTIFITAS");
          System.out.print("Masukkan id untuk dicari: ");
          int idActivityToShow = Integer.parseInt(input.readLine());
          activitylist.get(idActivityToShow);
          break;
        case 4:
          System.out.println("HAPUS AKTIFITAS");
          System.out.print("Masukkan id untuk dihapus : ");
          int idActivity = Integer.parseInt(input.readLine());
          activitylist.delete(idActivity);
          break;
        case 5:
          System.out.println("UPDATE AKTIFITAS");
          System.out.println();
          System.out.print("Masukkan id yang ingin di update : ");
          int targetIdToUpdate = Integer.parseInt(input.readLine());

          Activity activityToUpdate = new Activity();

          System.out.print("Deskripsi\t: ");
          activityToUpdate.description = input.readLine();

          System.out.print("Nominal\t\t: Rp");
          activityToUpdate.nominal = Integer.parseInt(input.readLine());


          System.out.print("Type\n(1: Pemasukan/2: Pengeluaran)\t: ");
          activityToUpdate.type = Integer.parseInt(input.readLine());
          
          System.out.println();
          activitylist.update(targetIdToUpdate, activityToUpdate);
          break;
        case 6:
          break;
        default:
          break;
      }
      App.getEqualLine();
    }

    input.readLine();
  }

  public static void getEqualLine() {
    System.out.println("====================================");
  }
}
