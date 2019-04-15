package buzz;

import java.util.Random;

public class Buzz {

    private boolean capaceteAberto;
    private boolean asaAberta;
    private String[] frases = {"frase1","frase2","frase3","frase4","frase5","frase6"};


    public boolean capaceteAbre() {

        capaceteAberto = !capaceteAberto;
        return capaceteAberto;

    }

    public boolean isAsaAberta() {

        asaAberta = !asaAberta;
        return asaAberta;

    }

    public String getFrase() {

        Random p = new Random();

        return frases[p.nextInt(6)+1];

    }

}