/**
  * 13) Faça um algoritmo para ler uma quantidade e a seguir ler esta quantidade de números. Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média dos números lidos.
  */ 
import java.util.Scanner;
public class ex13 
	{
    	public static void main(String[] args) 
    		{
      			Scanner ler = new Scanner(System.in);
      			float s=0, n=0,r=0, ma=0;
      			int x=0;
      			System.out.println("Digite a quantidade de numeros a serem lidos:");
      			x = ler.nextInt();
      			System.out.printf("Digite o 1º número:");
                n = ler.nextFloat();
                s=n;
                ma=n;
      			for (int i=2; i<=x; i++) 
                	{                    
                   		System.out.printf("Digite o %dº numero:", i);
                    	n = ler.nextFloat();
                    	s=s+n;
                    	if(n>ma)
                    		{
                        		ma=n;
                    		}
                	}
      			r=s/x;
      			System.out.printf("Maior valor= %f\n", ma);
      			System.out.printf("Media  = %f\n", r);
    		}
    }

