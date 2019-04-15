package robo;

public class Robo {

    private int x, y, area;
    private char frente;

    public Robo(int a, int iniciax, int iniciay, char f){
        area = a;
        x = iniciax;
        y = iniciay;
        frente = f;
    }

    public String movimenta(String plano) {

        for(int i = 0; i < plano.length(); i++){

            char p = plano.charAt(i);

            if(p == 'D'){

                switch (frente){

                    case 'N': frente = 'L';
                        break;
                    case 'L': frente = 'S';
                        break;
                    case 'S': frente = 'O';
                        break;
                    case 'O': frente = 'N';

                }

            }
            if(p == 'E'){

                switch (frente){

                    case 'N': frente = 'O';
                        break;
                    case 'L': frente = 'N';
                        break;
                    case 'S': frente = 'L';
                        break;
                    case 'O': frente = 'S';

                }

            }
            if(p == 'M'){

                switch (frente){

                    case 'N': y++;
                            break;
                    case 'L': x++;
                            break;
                    case 'S': y--;
                            break;
                    case 'O': x--;

                }

            }

        }

        return "Posoção (" + x + "," + y + "), frente para " + frente + ".";

    }

}
