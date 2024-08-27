public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Status inicial: "+smartTv.ligada);
        System.out.println("Canal inicial: "+smartTv.canal);
        System.out.println("Volume inicial: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status, TV ligada: "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentar volume: "+smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Aumentar volume: "+smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Aumentar volume: "+smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Trocar canal: "+smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Trocar canal: "+smartTv.canal);

        smartTv.diminuirVolume();
        System.out.println("Diminuir volume: "+smartTv.volume);  
        
        smartTv.buscarCanal(13);
        System.out.println("Novo canal: "+smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Trocar canal: "+smartTv.canal);
        
        smartTv.desligar();
        System.out.println("Novo status, TV ligada: "+smartTv.ligada);
    }
}
