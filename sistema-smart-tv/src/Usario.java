public class Usario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA: " + smartTv.ligada);
        System.out.println("CANAL ATUAL: " + smartTv.canal);
        System.out.println("VOLUME ATUAL: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("TV LIGADA: " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("CANAL ATUAL: " + smartTv.canal);

        smartTv.diminuirVolume();
        System.out.println("VOLUME ATUAL: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("TV LIGADA: " + smartTv.ligada);


    }

}
