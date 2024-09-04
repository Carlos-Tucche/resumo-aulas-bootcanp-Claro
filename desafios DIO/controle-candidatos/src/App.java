import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        // analisarCandidato (1900.0);
        // analisarCandidato (2200.0);
        // analisarCandidato (2000.0);

        String[] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu; 
            if (continuaTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso.");
            }
        }while(continuaTentando && tentativasRealizadas<3);
        
        if (atendeu) {
            System.out.println("Conseguimo contato com "+ candidato + " na "+ tentativasRealizadas + " tentativas");
        } else {
            System.out.println("Não conseguimos contato com "+ candidato + ", numero maximo de tentativas" + tentativasRealizadas);
        }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimir a lista de candidatos informando o indice do elemento");

        for(int indice =0; indice < candidatos.length; indice++){
            System.out.println("Ocandidato de n° "+ indice+1 + " e "+ candidatos[indice]);
        } 

        System.out.println("forma abreviada (for each)");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos(){

        String[] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA", "DANIELA","JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendito = valorPretendido();

            System.out.println("o candidato "+ candidato + "solicitou este valor de salario "+ salarioPretendito);

            if (salarioBase >= salarioPretendito) {
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendito){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendito) {
                System.out.println("Ligar para o candidato.");
        }else if (salarioBase == salarioPretendito) {
            System.out.println("Ligar para o candidato com contra proposta.");
        }else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}
