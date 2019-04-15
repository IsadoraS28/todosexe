package tempo;

public class Tempo {

    private int hora;
    private int minutos;
    private int segundos;

    public Tempo(int h, int m, int s){

        if((s >= 60) || (m >= 60) || (h >= 24)){

            hora = 00;
            minutos = 00;
            segundos = 00;

        } else{

            hora = h;
            minutos = m;
            segundos = s;

        }

    }

    public String toString(){

        return hora + ":" + minutos + ":" + segundos;

    }

    public boolean alteraTempo(int h, int m, int s){

        if(h != hora){
            try{
                hora = h;
            }catch (Exception e){
                return false;
            }
        }
        if(m != minutos){
            try{
                minutos = m;
            }catch (Exception e){
                return false;
            }
        }
        if(s != segundos){
            try{
                segundos = s;
            }catch (Exception e){
                return false;
            }
        }

        return true;

    }

    public long retSegundos(){

        Long ho = Long.valueOf(hora);
        Long mi = Long.valueOf(minutos);
        Long se = Long.valueOf(segundos);

        mi += ho*60;
        se += mi*60;

        return se;

    }

    public long diferença(Tempo t){

        return this.retSegundos() - t.retSegundos();

    }

}
