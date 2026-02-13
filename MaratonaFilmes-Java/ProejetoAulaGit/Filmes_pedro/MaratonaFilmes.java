import java.util.Scanner;


public class MaratonaFilmes {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Cabecalho();
        double tempoTotal = TempoFilmes(0, 0, 0);
        String resposta = RespostaMaratona(tempoTotal, "");
        System.out.println(resposta);
    
    }


    public static void Cabecalho(){
        System.out.println("================================");
        System.out.println("     Maratona de Filmes");
        System.out.println("================================");
    }

    public static double TempoFilmes(int totalFilme,double time, double totalTime){
        System.out.println("Quantos filmes tem na sua maratona ?");
        totalFilme = input.nextInt();
        System.out.println("Qual o tempo medio de cada filme?");
        time = input.nextDouble();
        return totalTime = totalFilme * time;
    }
    public static String RespostaMaratona(double tempoTotal,String resposta)
    {
        if (tempoTotal < 8) {
            resposta = "Total de horas: " + tempoTotal + " Maratona leve, aproveite!";
        } else if (tempoTotal >= 8 && tempoTotal < 16) {
            resposta = "Total de horas: " + tempoTotal + " Maratona moderada, prepare os lanches!";
        } else {
            resposta = "Total de horas: " + tempoTotal + " Maratona intensa, não esqueça de fazer pausas!";
        }
        return resposta;
    }

}
