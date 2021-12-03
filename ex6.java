import java.util.Scanner;
public class ex6 
  {
    public static void main(String[] args) 
      {
        Scanner ler = new Scanner(System.in);
        int quantidade=0;
        String x;
        System.out.println ("Digite a quantidade de alunos");
        quantidade = ler.nextInt();
        System.out.printf("Digite %d nomes:", quantidade);
        for (int i=0; i<=quantidade; i++) 
          {                    
            x = ler.nextLine();
            System.out.printf("%s \n",x);                   
          }                   
      }
    
  }
