import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int puste = 9;
        boolean wygranaX = false;
        boolean wygranaO = false;
        int cord1;
        int cord2;
        int komorka = 0;
        boolean draw;
        boolean rysujX = true;

        StringBuilder napis = new StringBuilder("         ");

        //Rysowanie planszy
        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("---------");


        //Gra
        while (true) {

            draw=false;
            while (!draw) {

                System.out.print("Enter the coordinates: ");
                try {
                    cord1 = Integer.parseInt(scanner.next());
                    cord2 = Integer.parseInt(scanner.next());
                } catch (NumberFormatException e)
                {
                    System.out.println("You should enter numbers!");
                    continue;
                }





                switch (cord1) {
                    case 1:
                        switch (cord2) {
                            case 1:
                                if (napis.charAt(6) == ' ') {
                                    draw = true;
                                    komorka = 6;
                                }

                                break;
                            case 2:
                                if (napis.charAt(3) == ' ') {
                                    draw = true;
                                    komorka = 3;
                                }
                                break;
                            case 3:
                                if (napis.charAt(0) == ' ') {
                                    draw = true;
                                    komorka = 0;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (cord2) {
                            case 1:
                                if (napis.charAt(7) == ' ') {
                                    draw = true;
                                    komorka = 7;
                                }
                                break;
                            case 2:
                                if (napis.charAt(4) == ' ') {
                                    draw = true;
                                    komorka = 4;
                                }
                                break;
                            case 3:
                                if (napis.charAt(1) == ' ') {
                                    draw = true;
                                    komorka = 1;
                                }
                                break;

                        }
                        break;
                    case 3:
                        switch (cord2) {
                            case 1:
                                if (napis.charAt(8) == ' ') {
                                    draw = true;
                                    komorka = 8;
                                }
                                break;
                            case 2:
                                if (napis.charAt(5) == ' ') {
                                    draw = true;
                                    komorka = 5;
                                }
                                break;
                            case 3:
                                if (napis.charAt(2) == ' ') {
                                    draw = true;
                                    komorka = 2;
                                }
                                break;
                        }
                        break;

                    default:
                        System.out.println("Error");
                }
                if (!draw) {
                    System.out.println("This cell is occupied! Choose another one!");
                }


            }

            //rysowanie
            if (rysujX) {
                rysujX = false;
                puste--;
                napis.replace(komorka, komorka + 1, "X");

            } else {
                rysujX = true;
                puste--;
                napis.replace(komorka, komorka + 1, "O");
            }


            System.out.println("---------");
            System.out.println("| " + napis.charAt(0) + " " + napis.charAt(1) + " " + napis.charAt(2) + " |");
            System.out.println("| " + napis.charAt(3) + " " + napis.charAt(4) + " " + napis.charAt(5) + " |");
            System.out.println("| " + napis.charAt(6) + " " + napis.charAt(7) + " " + napis.charAt(8) + " |");
            System.out.println("---------");


            //Sprawdzanie wygranej X
            //Poziomo
            if (napis.charAt(0) == 'X' && napis.charAt(1) == 'X' && napis.charAt(2) == 'X')
                wygranaX = true;
            if (napis.charAt(3) == 'X' && napis.charAt(4) == 'X' && napis.charAt(5) == 'X')
                wygranaX = true;
            if (napis.charAt(6) == 'X' && napis.charAt(7) == 'X' && napis.charAt(8) == 'X')
                wygranaX = true;

            //Pionowo
            if (napis.charAt(0) == 'X' && napis.charAt(3) == 'X' && napis.charAt(6) == 'X')
                wygranaX = true;
            if (napis.charAt(1) == 'X' && napis.charAt(4) == 'X' && napis.charAt(7) == 'X')
                wygranaX = true;
            if (napis.charAt(2) == 'X' && napis.charAt(5) == 'X' && napis.charAt(8) == 'X')
                wygranaX = true;

            //Na ukos

            if (napis.charAt(0) == 'X' && napis.charAt(4) == 'X' && napis.charAt(8) == 'X')
                wygranaX = true;
            if (napis.charAt(2) == 'X' && napis.charAt(4) == 'X' && napis.charAt(6) == 'X')
                wygranaX = true;


            //Sprawdzanie wygranej O
            //Poziomo
            if (napis.charAt(0) == 'O' && napis.charAt(1) == 'O' && napis.charAt(2) == 'O')
                wygranaO = true;
            if (napis.charAt(3) == 'O' && napis.charAt(4) == 'O' && napis.charAt(5) == 'O')
                wygranaO = true;
            if (napis.charAt(6) == 'O' && napis.charAt(7) == 'O' && napis.charAt(8) == 'O')
                wygranaO = true;

            //Pionowo
            if (napis.charAt(0) == 'O' && napis.charAt(3) == 'O' && napis.charAt(6) == 'O')
                wygranaO = true;
            if (napis.charAt(1) == 'O' && napis.charAt(4) == 'O' && napis.charAt(7) == 'O')
                wygranaO = true;
            if (napis.charAt(2) == 'O' && napis.charAt(5) == 'O' && napis.charAt(8) == 'O')
                wygranaO = true;

            //Na ukos

            if (napis.charAt(0) == 'O' && napis.charAt(4) == 'O' && napis.charAt(8) == 'O')
                wygranaO = true;
            if (napis.charAt(2) == 'O' && napis.charAt(4) == 'O' && napis.charAt(6) == 'O')
                wygranaO = true;

            if(wygranaO && wygranaX)
                System.out.println("Impossible");
            else
            if(wygranaO) {
                System.out.println("O wins");
                break;
            }

            else
            if(wygranaX) {
                System.out.println("X wins");
                break;
            }
            else
            if (puste == 0) {
                System.out.println("Draw");
                break;
            }
            else
                System.out.println("Game not finished");
        }


    }
}

