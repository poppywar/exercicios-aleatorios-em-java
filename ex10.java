import java.util.Scanner;
/**
  * 10) Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.
  */ 
public class ex10 
	{
    	public static void main(String[] args) 
    		{
      			Scanner ler = new Scanner(System.in);
      			float soma=0, n=0,r=0;
      			System.out.println("Insira 10 numeros para calcular a media deles");
      			for (int i=1; i<=10; i++) 
                	{                    
                    	n = ler.nextFloat();
                    	soma=soma+n;                                       
                	}
      			r=soma/10;
      			System.out.printf("Resultado = %f", r);
    		}
    }
