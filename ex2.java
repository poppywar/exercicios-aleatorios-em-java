import java.util.Scanner;
public class ex2 
  {
    /**
    * 2) Escreva um algoritmo que calcule e imprima a tabuada de N (1 a 10).
    */    
    public static void main(String[] args) 
    {
      Scanner ler = new Scanner(System.in);
      int i, n;
      System.out.println("Informe o numero para a tabuada:\n");
      n = ler.nextInt();
      for (i=1; i<=10; i++) 
        {
          System.out.printf("%2d X %d = %2d \n", i, n, (i*n));
        }
    }
}    