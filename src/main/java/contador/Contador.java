package contador;

public class Contador {

    private int valorAtual;

    public void defineValor(int va){

        valorAtual = va;
    }

    public void incrementa(){

        valorAtual++;
    }

    public int obtemValor(){

        return valorAtual;
    }

}