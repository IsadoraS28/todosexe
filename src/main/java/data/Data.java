package data;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int di, int me, int an){

        this.dia = di;
        this.mes = me;
        this.ano = an;

    }

    public String toString(){

        return dia + "/" + mes + "/" + ano;

    }

    public int difEntreData(Data d){

        return this.convParaDias() - d.convParaDias();

    }

    public int convParaDias(){

        return -1;

    }

}
