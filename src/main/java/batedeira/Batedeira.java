package batedeira;

public class Batedeira {

    private int velocidade;
    private String pa;
    private int pote;

    public boolean setVelocidade(int velo){

        if((velo <= 5)&&(velo >= 0)){
            velocidade = velo;
            return true;
        }
        return false;

    }

    public void setPa(String p){

        pa = p;

    }

    public void setPote(int po){

        pote = po;

    }

    public int getVelocidade(){

        return velocidade;

    }

    public String getPa(){

        return pa;

    }

    public int getPote(){

        return pote;

    }

    public String toString(){

        return "Velocidade: " + velocidade +", pote: " + pote + ", pa: " + pa;

    }

}