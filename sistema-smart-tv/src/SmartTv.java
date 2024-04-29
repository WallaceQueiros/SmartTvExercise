public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void passarCanal(){
        canal++;
    }

    public void voltarCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++; //volume = volume + 1
    }

    public void diminuirVolume(){
        volume--;
    }
}
