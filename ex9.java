import java.util.Scanner;
/**
  * 9) Acrescente uma mensagem 'NOVO CALCULO (S/N)?' ao final do exercício [6].
Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário
deverá encerrar o algoritmo.
  */ 
public class ex9 
	{
    	public static void main(String[] args) 
    	{
      		Scanner ler = new Scanner(System.in);
      		int n=0;
      		String s,xx = null;
      		do 
      			{
      				System.out.println ("Digite a quantidade de alunos");
      				n = ler.nextInt();
      				System.out.printf("Digite %d nomes:", n);
      				for (int i=0; i<=n; i++) 
                		{                    
                    	s = ler.nextLine();
                      System.out.printf("%s \n",s);                   
                    		
                		}
      				System.out.println ("NOVO CALCULO (S/N)?");
      				xx = ler.nextLine();
      			} 
      		while (("s".equals(xx))||("S".equals(xx)));
    	}
    }





