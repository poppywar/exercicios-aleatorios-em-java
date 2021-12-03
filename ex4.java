
/**
  * 4) Crie um algoritmo que solicite ao usuário um nome e um número inteiro, que
representará a quantidade de vezes que o nome informado deverá ser escrito
na tela.
  */ 
import java.util.Scanner;
public class ex4 
	{
    	public static void main(String[] args) 
    		{
        		String nome;
        		Scanner ler = new Scanner(System.in);
        		int n;
        		System.out.println("Insira um nome:");
        		nome = ler.nextLine();
        		System.out.println("Digite a quantidade de vezes que deve-se imprimir este nome:");
        		n = ler.nextInt();
        		System.out.println("Imprimindo o nome");
        		for (int i=1;i<=n;i++)
            		{
                		System.out.printf("%s \n", nome);
            		}
    		}
	}