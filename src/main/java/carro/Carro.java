package carro;

public class Carro {

    // atributos da classe
    private String modelo;
    private String marca;
    private String cor;
    private double valor;
    private int quilometragem;
    private int ano;

    // metodos

    public void definirModelo(String mo){

        modelo = mo;

    }

    public String obterModelo(){

        return modelo;

    }

    public void definirMarca(String ma){

        marca = ma;

    }

    public String obterMarca(){

        return marca;

    }

    public void definirCor(String co){

        cor = co;

    }

    public String obterCor(){

        return cor;

    }

    public void definirValor(Double v){

        valor = v;

    }

    public Double obterValor(){

        return valor;

    }

    public void definirQuilimetragem(int q){

        quilometragem = q;

    }

    public int obterQuilometragem(){

        return quilometragem;

    }

    public void definirAno(int a){

        ano = a;

    }

    public int obterAno(){

        return ano;

    }

    public String imprimeInfo(){

        return obterModelo() + ", " + obterMarca() + ", " + obterCor() + ", R$" + obterValor() + ", " + obterQuilometragem() + "Km, " + obterAno();

    }

}