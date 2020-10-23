import java.util.Scanner;

import uangkyu.Activity;
import uangkyu.Activitylist;

public class App {
  public static void main(String[] args) {
    Activitylist activitylist = new Activitylist();
    Scanner input = new Scanner(System.in);
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
      pilihan = input.nextInt();

      if (pilihan == 1) {
        input.nextLine();
        Activity activity = new Activity();

        System.out.print("Deskripsi\t: ");
        activity.description = input.nextLine();

        System.out.print("Nominal\t\t: Rp");
        activity.nominal = input.nextInt();

        input.nextLine();

        System.out.print("Type\n(1: Pemasukan/2: Pengeluaran)\t: ");
        activity.type = input.nextInt();

        activitylist.insert(activity);
      } else if (pilihan == 2) {
        activitylist.getAll();
      } else if (pilihan == 4) {
        input.nextLine();
        System.out.print("Masukkan id untuk di hapus : ");
        int idActivity = input.nextInt();
        activitylist.delete(idActivity);
      }
    }

    input.close();
  }
}
