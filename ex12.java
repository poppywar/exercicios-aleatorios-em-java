import java.util.Scanner;
/**
  * 12) Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada das seguintes
informações:
a) o número total de mercadorias no estoque;
b) o valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
  */ 
public class ex12 
	{
    	public static void main(String[] args) 
    		{
      				Scanner ler = new Scanner(System.in);
      				float s=0, n=0,r=0;
      				int x=0;
      				System.out.println("Insira a quantidade de mercadorias:");
      				x = ler.nextInt();
      				for (int i=1; i<=x; i++) 
                		{                    
                   				System.out.printf("Insira o valor da %dª mercadoria:", i);
                    			n = ler.nextFloat();
                    			s=s+n;
                		}
      				r=s/x;
      				System.out.printf("O valor total em estoque= %f\n", s);
      				System.out.printf("Media de valor das mercadorias = %f\n", r);
    		}
    }

