class Denah {
    public static void main(String[] args) {
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
                System.out.print(nilai[i][j] + "|");
            }
            System.out.println("");
        }

    }
}