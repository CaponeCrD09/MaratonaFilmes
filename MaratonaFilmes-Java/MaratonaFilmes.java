import java.util.Scanner;
import java.net.CacheRequest;
import java.util.ArrayList;

public class MaratonaFilmes {


    public static String nomeUser;
    public static int numFilmes;
    public static double time;
    //public static double timeTotal;
    public static double retorno;
    public static int tipoMaratona;

    public static Scanner inputs = new Scanner(System.in);
    public static void main(String[] args) {


        Cabecalho();
        System.out.println("");
        CalcularTempoTotal(retorno);
        System.out.println("");
        Classificacao(tipoMaratona);
        

        
    }
    public static void Cabecalho()
    {

        System.out.println("============================================");
        System.out.println("");
        System.out.println("--------------MaratonaFilmes----------------");
        System.out.println("");
        System.out.println("============================================5");
    }

    public static double CalcularTempoTotal(double timeTotal)
    {
        System.out.println("Quantidade de filmes :");
        numFilmes = inputs.nextInt();
        System.out.println("Durecao media por filme :");
        time = inputs.nextDouble();
        System.out.println("Tempo total da maratona :");
        return timeTotal = numFilmes * time;
        //System.err.println(timeTotal);
    }
    public static double Classificacao(double valor)
    {
        double teste = CalcularTempoTotal(retorno);
        
        if (CalcularTempoTotal(retorno) <= 4) {
            
            return valor = teste;
        
        }
        else if(CalcularTempoTotal(retorno) > 4 && CalcularTempoTotal(retorno) < 8)
        {
            //return valor = "Maratona Moderada";
        }
        else if(CalcularTempoTotal(retorno) > 8 )
        {
            //return valor ="Maratona Épica!";
        }
    }
    
}
