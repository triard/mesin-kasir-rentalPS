import java.util.Scanner;

public class m1 {
static Scanner sc = new Scanner (System.in);
    static void menuMobil() {
        String[] platmobil = { "\t\t\t    Avanza  : R 4567 EE", "\t\t\t    Xenia   : W 9998 XY",
                "\t\t\t    Inova   : E 1101 FG", "\t\t\t    Ayla    : S 1234 TU", "\t\t\t    Jazz    : A 5678 BC" };
        for (int i = 0; i < platmobil.length; i++) {
            System.out.println(platmobil[i]);
        }
    }

    public static void main(String[] args) {

        String nama, merk, nomob;
        int nomobil, lama,harga,bayar;    int telat,   
      int tanggal, kembali;
    int[] mobil = new int[10];int i;

    while 

    
    
            menuMobil();

            System.out.println();

            System.out.print("\t\t===========================================\n\n");

            System.out.println();

            {
                System.out.print("\t\t===============RENTAL MOBIL================\n\n");
                System.out.print("\t\tMasukkan Data-data berikut ini :\n");
                System.out.print("\t\tNama                  : ");
                nama = sc.nextLine();
                System.out.print("\t\tNo Mobil <X XXXX XX>  : ");
                nomob = sc.nextLine();
                System.out.print("\t\tTanggal pinjam        : ");
                tanggal = sc.nextInt();
                System.out.print("\t\tTanggal Kembali       : ");
                kembali = sc.nextInt();
                lama = kembali-tanggal;
                System.out.print("\t\tLama Keterlambatan    : ");
                telat = sc.nextInt();
                System.out.println("\t\t===========================================\n\n");

                if (nomob.equals("R 4567 EE")) {
                    merk = "Avanza";
                    harga = 300000;
                } else if (nomob.equals("W 9998 XY")) {
                    merk = "Xenia";
                    harga = 250000;
                } else if (nomob.equals("E 1101 FG")) {
                    merk = "Inova";
                    harga = 700000;
                } else if (nomob.equals("S 1234 TU")) {
                    merk = "Ayla";
                    harga = 550000;
                } else if (nomob.equals("A 5678 BC")) {
                    merk = "Jazz";
                    harga = 700000;
                } else {
                    merk = "Nomor Mobil Tidak Terdaftar";
                    harga = 0;
                }
                System.out.println("");

                bayar = telat * 50000;
                total = harga * lama + bayar;

                System.out.println("\t\t=========MESIN KASIR RENTAL MOBIL==========\n");
                System.out.print("\t\tNama                    : " + nama + "\n");
                System.out.print("\t\tNo Mobil                : " + nomob + "\n");
                System.out.print("\t\tMerk Mobil              : " + merk + "\n");
                System.out.print("\t\tLama Pinjam             : " + lama + " hari\n");
                System.out.print("\t\tTanggal pinjam          : " + tanggal + "\n");
                System.out.print("\t\tTanggal pengembalian    : " + kembali + "\n");
                System.out.print("\t\tHarga                   : " + harga + "\n");
                System.out.print("\t\tTerlambat Mengembalikan : " + telat + " hari\n");
                System.out.print("\t\tDenda                   : " + bayar + "\n");
                System.out.print("\t\tTotal bayar             : " + total + "\n\n");
            }
            System.out.println("\t\t================TERIMA KASIH===============");

            System.out.println();
            System.out.println();

            System.out.println("\t\t      ||||||                    ||||||       ");
            System.out.println("\t\t     ||||||||                  ||||||||      ");
            System.out.println("\t\t     ||||||||                  ||||||||      ");
            System.out.println("\t\t      ||||||                    ||||||       ");
            System.out.println("\t\t                                             ");
            System.out.println("\t\t     __________________________________      ");
            System.out.println("\t\t     \\          |   | |   |           /     ");
            System.out.println("\t\t      \\         |___| |___|          /      ");
            System.out.println("\t\t       \\                            /       ");
            System.out.println("\t\t        \\                          /        ");
            System.out.println("\t\t          ------------------------           ");

            System.out.println();
            System.out.print("\t\tTekan Y untuk mengulang pemesanan atau T untuk keluar ");

            
			String respon = sc.nextLine();
			if (respon.equals("t") || respon.equals("T")) {
				System.exit(0);
			}
        }
    }
}
