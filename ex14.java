import java.util.Scanner;
/**
  * 14) Faça um algoritmo para ler o código e o preço de 15 produtos, calcular e
escrever:
- o maior preço lido
- a média aritmética dos preços dos produtos
  */ 
public class ex14 
	{
    	public static void main(String[] args) 
    		{
      		Scanner ler = new Scanner(System.in);
      		float s=0, n=0,r=0, ma=0;
      		System.out.printf("Insira o 1º preco:");
            n = ler.nextFloat();
            s=n;
            ma=n;
      		for (int i=2; i<=15; i++) 
                {                    
                   System.out.printf("Insira o %dº preco:", i);
                    n = ler.nextFloat();
                    s=s+n;
                    if(n>ma)
                    	{
                        	ma=n;
                    	}
                }
      		r=s/15;
      		System.out.printf("Maior valor= %f\n", ma);
      		System.out.printf("Media  = %f\n", r);  
    		}
    }
