import java.util.Scanner;
import java.util.Random;
import java.io.*;

class SnakeCons {

    static int nilai = 0;
    static int a = 20;
    static int b = 20;
    static String[][] space = new String[a][b];
    static int tabrakan = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n  PRESS ANY KEY TO CONTINUE . . .  \n");
        String start = sc.nextLine();
        buatSpace();
    }

    static void buatSpace() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                space[i][j] = " ";
            }
        }
        int posKol = acakPosisi();
        int posBar = acakPosisi();
        space[posKol][posBar] = "" + nilai;

        for (int x = 0; x < 7; x++) {

            int makKol;
            int makBar;

            do {
                makKol = acakPosisi();
                makBar = acakPosisi();
            } while (space[makKol][makBar].equals("*") || space[makKol][makBar].equals("" + nilai));

            space[makKol][makBar] = "*";
        }
        tampil();
    }

    static int acakPosisi() {
        Random rn = new Random();
        int acak = rn.nextInt(20);
        return acak;
    }

    static void tampil() {
        System.out.println("++ ==================== ++");
        for (int i = 0; i < 20; i++) {
            System.out.print("|| ");
            for (int j = 0; j < 20; j++) {
                System.out.print(space[i][j]);
            }
            System.out.print(" ||");
            System.out.println();
        }
        System.out.print("++ ==================== ++\n\n");

        if (nilai == 7) {
            System.out.println(" \n\n\t=== GAME OVER === ");
            System.out.println(" === TERIMA KASIH TELAH BERMAIN ===");
            System.exit(0);
        }

        System.out.println("W = atas");
        System.out.println("A = kiri");
        System.out.println("D = kanan");
        System.out.println("S = bawah");
        System.out.println("TEKAN L UNTUK KELUAR PERMAINAN");

        cekPosisi();
    }

    static void cekPosisi() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (space[i][j].equals("" + nilai)) {
                    gerak(i, j);
                }
            }
        }
    }

    static void gerak(int i, int j) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan pilihan : ");
        String pilihan = sc.nextLine();
        clearScreen();
        switch (pilihan.toUpperCase()) {
        case "W":
            if (i > 0) {
                if (space[i - 1][j].equals("*")) {
                    nilai++;
                }
                space[i][j] = " ";
                space[i - 1][j] = "" + nilai;
                tampil();
            } else {
                hitungTabrak();
            }
            break;
        case "A":
            if (j > 0) {
                if (space[i][j - 1].equals("*")) {
                    nilai++;
                }
                space[i][j] = " ";
                space[i][j - 1] = "" + nilai;
                tampil();
            } else {
                hitungTabrak();
            }
            break;
        case "D":
            if (j < 19) {
                if (space[i][j + 1].equals("*")) {
                    nilai++;
                }
                space[i][j] = " ";
                space[i][j + 1] = "" + nilai;
                tampil();
            } else {
                hitungTabrak();
            }
            break;
        case "S":
            if (i < 19) {
                if (space[i + 1][j].equals("*")) {
                    nilai++;
                }
                space[i][j] = " ";
                space[i + 1][j] = "" + nilai;
                tampil();
            } else {
                hitungTabrak();
            }
            break;
        case "L":
            System.out.println(" \n\n======== TERIMA KASIH TELAH BERMAIN ========");
            System.exit(0);
            break;
        default:
            tampil();
            break;
        }
    }

    static void hitungTabrak() {
        tabrakan++;
        if (tabrakan == 3) {
            System.out.println(" \n\n\t=== GAME OVER === ");
            System.out.println(" === ANDA MENABRAK BATAS SPACE 3x ===");
            System.out.println(" === TERIMA KASIH TELAH BERMAIN ===");
            System.exit(0);
        } else {
            tampil();
        }
    }

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}