package edu.carlos.primeirasemana;
public class MinhaClasse {
    
     public static void main(String[] args) {
        String prinmeiroNome = "Carlos";
        String segundoNome = "Dias";
        String nomerCompleto = nomerCompleto(prinmeiroNome, segundoNome);

        System.out.println(nomerCompleto);
        
     }

     public static String nomerCompleto(String prinmeiroNome, String segundoNome){
        return "Resultado do método: "+ prinmeiroNome.concat(" ").concat(segundoNome);

     }
}
