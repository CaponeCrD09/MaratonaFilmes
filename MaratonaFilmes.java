import java.util.Scanner;


public class MaratonaFilmes {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Cabecalho();
        double totalTime = TempoFilmes(0,0,0);
        System.err.println("");
        System.out.println("================================");
        System.out.println("Tempo total gasto: " + totalTime + " horas");
        System.err.println("");
        String resposta = RespostaMaratona(totalTime, "");
        System.out.printf(resposta);
    
    }


    public static void Cabecalho(){
        System.out.println("================================");
        System.out.println("     Maratona de Filmes");
        System.out.println("================================");
    }

    public static double TempoFilmes(int x,double time, double totalTime){
        System.out.println("Quantidade de filmes:");
        x = input.nextInt();
        System.out.println("Tempo medio de cada filme:");
        time = input.nextDouble();
        return totalTime = x * time;
    }
    public static String RespostaMaratona(double x,String resposta)
    {
  
        String teste;
        if(x <= 4)
        {
            teste = " Sua maratona e´ leve ";
            return teste;
        }
        else if(x > 4 && x <= 8)
        {
            teste = " Sua maratona e´ moderada ";
            return teste;
        }
        else if(x > 8 )
        {
            teste = " Sua maratona e´ pesada ";
            return teste;
        }
        else
        {
            teste = " Sua extremamente leve! ";
            return teste;
        }
    }

}
