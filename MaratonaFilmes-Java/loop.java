import java.util.Scanner;

public class loop {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Teste(0);
        
        String testeNome ;
        testeNome = Nome("");
        System.out.print(testeNome);
        int teste2 = Cont(0, 0, 0);
        System.out.println(teste2);
    }

    public static void Teste(int n)
    {
        
        while (n < 7) {
            n++;
            System.out.println(n);
        }
    }
    public static String Nome(String nome)
    {
        nome = input.next();
        return nome;
    }
    public static int Cont(int x , int y, int result)
    {
        x = input.nextInt();
        y = input.nextInt();
        result = x + y;

        // System.out.println(result);
        return result;
    }
    
}
