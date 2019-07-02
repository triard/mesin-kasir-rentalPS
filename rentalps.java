import java.util.Scanner;

class rentalps {
    static Scanner sc = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    static int pilihan, durasi, diskon, total, akhir = 0, bayar, pembayaran, banyak, tot, tot1, tot2, tot3, tot4, tal,
            pilihan1, pilihan2, pilihan3, pilihan4, pilihan5, air = 2000, tea = 3000, taro = 1000, fries = 1000,
            citato = 1000, end;
    static String nober, jawaban, ps, kursi, jenis;

    public static void main(String[] args) {
        do {
            Login();
            tampilkanMenu();
            pilihanmenu(pilihMenu());
        } while (Ulangi());
        struk();
       
    }

    public static void Login() {
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\tSELAMAT DATANG DI RENTAL PS KROMO DIRJO         |");
        System.out.println("|\t    Silahkan isi data dibawah ini             |");
        System.out.println("|-------------------------------------------------------|");
        System.out.print("\t->Masukan nomer members(bukan member[0]) : ");
        nober = sc.next();
    }

    public static void tampilkanMenu() {
        System.out.println("|\t\t|=======================|               |");
        System.out.println("|\t\t|  PILIH MENU           |               |");
        System.out.println("|\t\t|  1. Type PS           |               |");
        System.out.println("|\t\t|  2. Makanan           |               |");
        System.out.println("|\t\t|=======================|               |");
    }

    public static int pilihMenu() {
        System.out.print("\t-> Masukkan Pilihan anda\t\t: ");
        pilihan = sc.nextInt();
        return pilihan;
    }

    public static void pilihanmenu(int pilihan) {
        if (pilihan == 1) {
            tampilkanMenups();
        } else if (pilihan == 2) {
            tampilkanmenuMakanan();
        } else {
            System.out.println("Inputan salah!");
        }
    }

    public static void tampilkanMenups() {

        System.out.println("|================== Type playstation ===================|");
        System.out.println("|\t\t    1. PlayStation 2                    |");
        System.out.println("|\t\t    2. PlayStation 3                    |");
        System.out.println("|\t\t    3. PlayStation 4                    |");
        System.out.println("|=======================================================|");
        System.out.print("\t-> Masukan pilihan anda(ps2)\t\t\t: ");
        ps = sc.next();

        switch (ps) {

        case 
        ("ps2")  :
            ps2();
            break;

        case ("ps3"):
            ps3();
            break;

        case ("ps4"):
            ps4();
            break;

        default:
            System.out.println("Maaf jenis PS yang anda inginkan tidak ada");
        }
    }

    static void diskon10() {
        diskon = total * 10 / 100;
        System.out.println("|\t\tDiskon\t\t\t\t: " + diskon + "  |");
        akhir = total - diskon;
        System.out.println("|\t\tSetelah diskon\t\t\t: " + akhir + "  |");
    }

    static void diskon20() {
        diskon = total * 20 / 100;
        System.out.println("|\t\tDiskon\t\t\t\t: " + diskon + "  |");
        akhir = total - diskon;
        System.out.println("|\t\tSetelah diskon\t\t\t: " + akhir + "  |");
    }

    public static void ps2() {

        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\t\tBiaya per jam Rp 2000                   |");
        int bayarps2 = 2000;
        System.out.print("\t\tDurasi waktu (jam)\t\t: ");
        durasi = sc.nextInt();
        total = durasi * bayarps2;
        System.out.println("|\t\tPembayaran PS\t\t\t:Rp" + total + "|");

        if ((nober.equals("13")) && (durasi >= 5) && (durasi <= 10)) {
            diskon10();
        }

        else if ((nober.equals("13")) && (durasi > 10)) {
            diskon20();
        } else {
            akhir = total + akhir;
        }
        pilihtempatduduk();
    }

    public static void ps3() {
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\t\tBiaya per jam Rp 4000                   |");
        int bayarps3 = 4000;
        System.out.print("\t\tDurasi waktu (jam)\t\t: ");
        durasi = sc.nextInt();
        total = durasi * bayarps3;
        System.out.println("|\t\tPembayaran PS\t\t\t:Rp" + total + "|");

        if ((nober.equals("13")) && (durasi >= 5) && (durasi < 10)) {
            diskon10();
        }

        else if ((nober.equals("13")) && (durasi > 10)) {
            diskon20();
        } else {
            akhir = total + akhir;
        }
        pilihtempatduduk();
    }

    public static void ps4() {

        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\t\tBiaya per jam Rp 6000                   |");
        int bayarps4 = 6000;
        System.out.print("\t\tDurasi waktu (jam)\t\t: ");
        durasi = sc.nextInt();
        total = durasi * bayarps4;
        System.out.println("|\t\tPembayaran PS\t\t\t:Rp" + total + "|");

        if ((nober.equals("13")) && (durasi >= 5) && (durasi < 10)) {
            diskon10();

        } else if ((nober.equals("13")) && (durasi >= 10)) {
            diskon20();
        } else {
            akhir = total + akhir;
        }
        pilihtempatduduk();
    }

    public static void pilihtempatduduk() {
        System.out.println("|-------------------------------------------------------|");
        String[][] nilai = new String[3][5];

        nilai[0][0] = "PS2 TV1";
        nilai[0][1] = "PS2 TV2";
        nilai[0][2] = "PS2 TV3";
        nilai[0][3] = "PS2 TV4";
        nilai[0][4] = "PS2 TV5";
        nilai[1][0] = "PS3 TV1";
        nilai[1][1] = "PS3 TV2";
        nilai[1][2] = "PS3 TV3";
        nilai[1][3] = "PS3 TV4";
        nilai[1][4] = "PS3 TV5";
        nilai[2][0] = "PS4 TV1";
        nilai[2][1] = "PS4 TV2";
        nilai[2][2] = "PS4 TV3";
        nilai[2][3] = "PS4 TV4";
        nilai[2][4] = "PS4 TV5";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("   |" + nilai[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("|------------------ ----------------------------------------|");
        System.out.print("\t\tMasukan pilihan kursi(ps2tv1)\t:");
        kursi = sc.next();
        System.out.println("|-----------------------------------------------------------|");

        System.out.print("\t\t->Ingin beli cemilan[y/n]\t: ");
        jawaban = sc.next();
        if (jawaban.equals("y")) {
            tampilkanmenuMakanan();
        } else {
            pembayaran();
        }
    }

    public static void tampilkanmenuMakanan() {
        System.out.println("|-------------------------------------------------------|");
        System.out.println("\t\tDaftar Makanan Ringan:");
        System.out.println("|-------------------------------------------------------|");
        String[] makanan = { "1. Air Mineral\tRp 2000", "2. fresh tea\tRp 3000", "3. Taro\t\tRp 1000",
                "4. French fries\tRp 1000", "5. Chitato\tRp 1000" };
        for (int i = 0; i < makanan.length; i++) {
            System.out.println("\tDaftar Snack: " + makanan[i]);
        }
        System.out.print("\t-> masukan jumlah jenis makanan\t\t: ");
        jenis = sc.next();

        switch (jenis) {

        case ("1"):
            pilihanPertama();
            tal = tot;
            System.out.println("|\t\tTotal makanan yang dibeli\t : Rp" + tal + "|");
            pembayaran();

            break;

        case ("2"):
            pilihanPertama();
            pilihanKedua();
            tal = tot + tot1;
            System.out.println("|\t\tTotal makanan yang dibeli\t : Rp" + tal + "|");
            pembayaran();
            break;

        case ("3"):
            pilihanPertama();
            pilihanKedua();
            pilihanKetiga();
            tal = tot + tot1 + tot2;
            System.out.println("|\t\tTotal makanan yang dibeli\t : Rp" + tal + "|");
            pembayaran();
            break;

        case ("4"):
            pilihanPertama();
            pilihanKedua();
            pilihanKetiga();
            pilihanKeempat();
            tal = tot + tot1 + tot2 + tot3;
            System.out.println("|\t\tTotal makanan yang dibeli\t : Rp" + tal + "|");
            pembayaran();
            break;

        case ("5"):
            pilihanPertama();
            pilihanKedua();
            pilihanKetiga();
            pilihanKeempat();
            pilihanKelima();
            tal = tot + tot1 + tot2 + tot3 + tot4;
            System.out.println("|\t\tTotal makanan yang dibeli\t : Rp" + tal + "|");
            pembayaran();
            break;

        default:
            System.out.println("Maaf melebihi batas yang ditentukan");
        }
    }

    public static void pilihanPertama() {
        System.out.print("\t\tPilihan pertama makanan\t\t : ");
        pilihan1 = sc.nextInt();

        if (pilihan1 == 1) {
            System.out.print("\t\tBanyaknya barang pilihan pertama : ");
            banyak = sc.nextInt();
            tot = air * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot + "|");

        } else if (pilihan1 == 2) {
            System.out.print("\t\tBanyaknya barang pilihan pertama : ");
            banyak = sc.nextInt();
            tot = tea * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot + "|");

        } else if (pilihan1 == 3) {
            System.out.print("\t\tBanyaknya barang pilihan pertama : ");
            banyak = sc.nextInt();
            tot = taro * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot + "|");
        } else if (pilihan1 == 4) {
            System.out.print("\t\tBanyaknya barang pilihan pertama : ");
            banyak = sc.nextInt();
            tot = fries * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot + "|");
        } else if (pilihan1 == 5) {
            System.out.print("\t\tBanyaknya barang pilihan pertama : ");
            banyak = sc.nextInt();
            tot = citato * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot + "|");
        } else {
            System.out.println("|\t\tMaaf inputan anda salah!");

        }
    }

    public static void pilihanKedua() {
        System.out.print("\t\tPilihan kedua makanan\t\t : ");
        pilihan2 = sc.nextInt();
        if (pilihan2 == 1) {
            System.out.print("\t\tBanyaknya barang pilihan kedua   : ");
            banyak = sc.nextInt();
            tot1 = air * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot1 + "|");

        } else if (pilihan2 == 2) {
            System.out.print("\t\tBanyaknya barang pilihan kedua   : ");
            banyak = sc.nextInt();
            tot1 = tea * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot1 + "|");
        } else if (pilihan2 == 3) {
            System.out.print("\t\tBanyaknya barang pilihan kedua   : ");
            banyak = sc.nextInt();
            tot1 = taro * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot1 + "|");
        } else if (pilihan2 == 4) {
            System.out.print("\t\tBanyaknya barang pilihan kedua   : ");
            banyak = sc.nextInt();
            tot1 = fries * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot1 + "|");
        } else if (pilihan2 == 5) {
            System.out.print("\t\tBanyaknya barang pilihan kedua   : ");
            banyak = sc.nextInt();
            tot1 = citato * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot1 + "|");
        } else {
        }
    }

    public static void pilihanKetiga() {
        System.out.print("\t\tPilihan ketiga makanan\t\t : ");
        pilihan3 = sc.nextInt();
        if (pilihan3 == 1) {
            System.out.print("\t\tBanyaknya barang pilihan ketiga   : ");
            banyak = sc.nextInt();
            tot2 = air * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot2 + "|");

        } else if (pilihan3 == 2) {
            System.out.print("\t\tBanyaknya barang pilihan ketiga   : ");
            banyak = sc.nextInt();
            tot2 = tea * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot2 + "|");
        } else if (pilihan3 == 3) {
            System.out.print("\t\tBanyaknya barang pilihan ketiga   : ");
            banyak = sc.nextInt();
            tot2 = taro * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot2 + "|");
        } else if (pilihan3 == 4) {
            System.out.print("\t\tBanyaknya barang pilihan ketiga   : ");
            banyak = sc.nextInt();
            tot2 = fries * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot2 + "|");
        } else if (pilihan3 == 5) {
            System.out.print("\t\tBanyaknya barang pilihan ketiga   : ");
            banyak = sc.nextInt();
            tot2 = citato * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot2 + "|");
        } else {
        }
    }

    public static void pilihanKeempat() {
        System.out.print("\t\tPilihan keempat makanan\t\t : ");
        pilihan4 = sc.nextInt();
        if (pilihan4 == 1) {
            System.out.print("\t\tBanyaknya barang pilihan keempat   : ");
            banyak = sc.nextInt();
            tot3 = air * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot3 + "|");

        } else if (pilihan4 == 2) {
            System.out.print("\t\tBanyaknya barang pilihan keempat   : ");
            banyak = sc.nextInt();
            tot3 = tea * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot3 + "|");
        } else if (pilihan4 == 3) {
            System.out.print("\t\tBanyaknya barang pilihan keempat   : ");
            banyak = sc.nextInt();
            tot3 = taro * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot3 + "|");
        } else if (pilihan4 == 4) {
            System.out.print("\t\tBanyaknya barang pilihan keempat   : ");
            banyak = sc.nextInt();
            tot3 = fries * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot3 + "|");
        } else if (pilihan4 == 5) {
            System.out.print("\t\tBanyaknya barang pilihan keempat   : ");
            banyak = sc.nextInt();
            tot3 = citato * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot3 + "|");
        } else {
        }
    }

    public static void pilihanKelima() {
        System.out.print("\t\tPilihan kelima makanan\t\t : ");
        pilihan5 = sc.nextInt();
        if (pilihan5 == 1) {
            System.out.print("\t\tBanyaknya barang pilihan kelima   : ");
            banyak = sc.nextInt();
            tot4 = air * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot4 + "|");

        } else if (pilihan5 == 2) {
            System.out.print("\t\tBanyaknya barang pilihan kelima   : ");
            banyak = sc.nextInt();
            tot4 = tea * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot4 + "|");
        } else if (pilihan5 == 3) {
            System.out.print("\t\tBanyaknya barang pilihan kelima   : ");
            banyak = sc.nextInt();
            tot4 = taro * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot4 + "|");
        } else if (pilihan5 == 4) {
            System.out.print("\t\tBanyaknya barang pilihan kelima   : ");
            banyak = sc.nextInt();
            tot4 = fries * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot4 + "|");
        } else if (pilihan5 == 5) {
            System.out.print("\t\tBanyaknya barang pilihan kelima   : ");
            banyak = sc.nextInt();
            tot4 = citato * banyak;
            System.out.println("|\t\tTotal\t\t\t\t : Rp" + tot4 + "|");
        } else {
        }
    }

    public static void pembayaran() {
        System.out.println("|-------------------------------------------------------|");
        end = tal + akhir;
        System.out.println("|\t\tTotal akhir\t\t\t : Rp" + end + "|");
        System.out.print("\t\tMasukan uang pembayaran\t\t : Rp ");
        pembayaran = sc.nextInt();

        if (end <= pembayaran) {
            bayar = pembayaran - end;
            System.out.println("\t\t\tkembalian Rp " + bayar);
        } else if (akhir <= pembayaran) {
            bayar = pembayaran - total;
            System.out.println("|\t\tUang kembalian anda sebesar\tRp " + bayar);
        } else {
            System.out.println("|\tmaaf uang anda kurang, silahkan masukan uang lagi|");
            pembayaran();
        }
        System.out.println("|\t\tTransaksi anda sukses                    |");

    }

    public static void struk() {
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\t\tRENTAL PS KROMO DIRJO                      |");
        System.out.println("|\t    jl. Senggani No 24a Kota Malang             |");
        System.out.println("|\t\t  Phone: 085606313076                   |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\t\t\t  <STRUK>                       |");
        System.out.println("|=======================================================|");
        if (nober.equals("13")) {
            System.out.println("|\t\t Status Member\t: Members               |");
        } else {
            System.out.println("|\t\t Status Member\t: nonMembers            |");
        }
        System.out.println("|\t\t Type PS\t: " + ps + "                   |");
        if (ps.equals("ps2")) {
            System.out.println("|\t\tBiaya per jam Rp 2000                   |");
        } else if (ps.equals("ps3")) {
            System.out.println("|\t\tBiaya per jam Rp 4000                   |");
        } else if (ps.equals("ps4")) {
            System.out.println("|\t\tBiaya per jam Rp 6000                   |");
        } else {
            
            System.out.println("-");
        }
        System.out.println("|\t\tDurasi waktu(jam)\t\t: " + durasi + "     |");
        System.out.println("|\t\tPembayaran PS\t\t\t:Rp" + total + "|");
        if ((nober.equals("13")) && (durasi >= 5) && (durasi <= 10) || (durasi > 10)) {
            System.out.println("|\t\tDiskon\t\t\t\t: " + diskon + "  |");
            akhir = total - diskon;
            System.out.println("|\t\tSetelah diskon\t\t\t: " + akhir + "  |");
        } else {

        }
        System.out.println("|\t\tTempat duduk\t\t\t: " + kursi + "|");
        if (jawaban.equals("y")) {
            System.out.println("|\t\tPembayaran makanan\t\t:Rp" + tal + " |");
        } else {
        }
        if (jawaban.equals("y")) {
            System.out.println("|\t\tTotal keseluruhan\t\t:Rp" + end + "|");
        } else if (akhir >= 0) {
            System.out.println("|\t\tTotal keseluruhan\t\t:Rp" + akhir + "|");
        } else {
            System.out.println("|\t\tTotal keseluruhan\t\t\t:Rp" + total + "|");
        }
        System.out.println("|\t\tUang pembayaran\t\t\t:Rp" + pembayaran + "|");
        System.out.println("|\t\tKembalian\t\t\t:Rp " + bayar + "|");
        System.out.println("|\t\t<TERIMAKASIH TELAH BERKUNJUNG :)>\t|");
        System.out.println("|-------------------------------------------------------|");
    }

    public static boolean Ulangi() {
        System.out.print("\t\tUlangi (y/n) ?\t: ");
        char ulangi = sc.next().charAt(0);
        return ulangi == 'y';
    }
}