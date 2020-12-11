package wk3.opdrachten;

public class Schaakbord {
    private final Schaakstuk[][] bord = new Schaakstuk[8][8];
    String[][] legenda = new String[8][8];

    public Schaakbord()
    {
        this.maakNieuwBordOp(this.bord);
        this.maakLegenda();
        this.printSchaakbord(this);
    }
    public void maakNieuwBordOp(Schaakstuk[][] bord)
    {
        String[] stukken = new String[] {"Toren", "Paard", "Loper", "Dame", "Koning", "Loper", "Paard", "Toren"};

        // Maak alle pionnen
        for(int i = 0; i < 8; i++)
        {
            bord[1][i] = new Schaakstuk("Pion", "Zwart");
            bord[6][i] = new Schaakstuk("Pion", "Witte");

            bord[0][i] = new Schaakstuk(stukken[i], "Zwart");
            bord[7][i] = new Schaakstuk(stukken[i], "Witte");
        }
    }

    public int[] getArrayPosities(String code)
    {
        int r = -1;
        int c = -1;
        for(int row = 0; row < 8; row++)
        {
            for(int column = 0; column < 8; column++)
            {
                if (legenda[row][column].equals(code))
                {
                    r = row;
                    c = column;
                }
            }
        }
        return new int[] {r, c};
    }

    public void printSchaakbord(Schaakbord schaakbord)
    {
        String text_bord = "";
        text_bord += "==================================================================================================================================================================================================\n";
        for (int row = 0; row < 8; row++)
        {
            for (int column = 0; column < 8; column++)
            {
                String spacer = "\t | ";
                String end_spacer = "";
                String code = legenda[row][column];
                String type;

                // isLeeg?
                if (schaakbord.bord[row][column] != null)
                {
                    type = String.format("%s(%s)", schaakbord.bord[row][column].getNaam(), schaakbord.bord[row][column].getKleur());
                }
                else {
                    type = "Leeg       ";
                }

                // spacer to end
                if (column == 0)
                {
                    spacer = "|  ";
                }
                if (column == 7)
                {
                    end_spacer = "\t | \n";
                }

                String text = String.format("%s %s: %s %s", spacer, code, type, end_spacer);
                text_bord += text;
            }
        }
        text_bord += "==================================================================================================================================================================================================\n";
        System.out.println(text_bord);
    }

    public void doeZet(Schaakbord schaakbord, String vanCode, String naarCode)
    {
        int[] vanPos = getArrayPosities(vanCode);
        int[] naarPos = getArrayPosities(naarCode);
        // Invalid code?
        if ((vanPos[0] == -1 && vanPos[1] == -1) && (naarPos[0] == -1 && naarPos[1] == -1))
        {
            System.out.println("De gegeven code is ongeldig");
        }
        else
        {
            if (schaakbord.bord[vanPos[0]][vanPos[1]] != null)
            {
                if (vanPos[0] == naarPos[0] && vanPos[1] == naarPos[1])
                {
                    System.out.println("Ongeldige zet.");
                }
                else
                {
                    schaakbord.bord[naarPos[0]][naarPos[1]] = bord[vanPos[0]][vanPos[1]];
                    schaakbord.bord[vanPos[0]][vanPos[1]] = null;
                    schaakbord.printSchaakbord(schaakbord);
                }
            }
            else
            {
                System.out.println("Kan zet niet uitvoeren omdat er geen geldige pion is selecteerd.");
            }
        }
    }

    public void maakLegenda() {
        legenda[0][0] = "A8";
        legenda[0][1] = "B8";
        legenda[0][2] = "C8";
        legenda[0][3] = "D8";
        legenda[0][4] = "E8";
        legenda[0][5] = "F8";
        legenda[0][6] = "G8";
        legenda[0][7] = "H8";
        legenda[1][0] = "A7";
        legenda[1][1] = "B7";
        legenda[1][2] = "C7";
        legenda[1][3] = "D7";
        legenda[1][4] = "E7";
        legenda[1][5] = "F7";
        legenda[1][6] = "G7";
        legenda[1][7] = "H7";
        legenda[2][0] = "A6";
        legenda[2][1] = "B6";
        legenda[2][2] = "C6";
        legenda[2][3] = "D6";
        legenda[2][4] = "E6";
        legenda[2][5] = "F6";
        legenda[2][6] = "G6";
        legenda[2][7] = "H6";
        legenda[3][0] = "A5";
        legenda[3][1] = "B5";
        legenda[3][2] = "C5";
        legenda[3][3] = "D5";
        legenda[3][4] = "E5";
        legenda[3][5] = "F5";
        legenda[3][6] = "G5";
        legenda[3][7] = "H5";
        legenda[4][0] = "A4";
        legenda[4][1] = "B4";
        legenda[4][2] = "C4";
        legenda[4][3] = "D4";
        legenda[4][4] = "E4";
        legenda[4][5] = "F4";
        legenda[4][6] = "G4";
        legenda[4][7] = "H4";
        legenda[5][0] = "A3";
        legenda[5][1] = "B3";
        legenda[5][2] = "C3";
        legenda[5][3] = "D3";
        legenda[5][4] = "E3";
        legenda[5][5] = "F3";
        legenda[5][6] = "G3";
        legenda[5][7] = "H3";
        legenda[6][0] = "A2";
        legenda[6][1] = "B2";
        legenda[6][2] = "C2";
        legenda[6][3] = "D2";
        legenda[6][4] = "E2";
        legenda[6][5] = "F2";
        legenda[6][6] = "G2";
        legenda[6][7] = "H2";
        legenda[7][0] = "A1";
        legenda[7][1] = "B1";
        legenda[7][2] = "C1";
        legenda[7][3] = "D1";
        legenda[7][4] = "E1";
        legenda[7][5] = "F1";
        legenda[7][6] = "G1";
        legenda[7][7] = "H1";
    }
}
