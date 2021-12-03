
import java.util.Scanner;
/**
  * 5) Construa um algoritmo que seja capaz de calcular o valor total de uma compra, somando o preço de cada um dos produtos. O algoritmo deverá
solicitar o preço de cada produto e ir somando ao montante total, e deve entender que os produtos acabaram quando o preço informado for 0 (zero),
então mostrará o número de itens comprados e o total da compra, encerrando a execução. Caso seja informado algum valor menor do que zero, o programa
deve desconsiderá-lo e exibir uma mensagem de erro solicitando que o valor correto do produto seja digitado. O algoritmo deve ser criado utilizando a
estrutura de repetição com Pós-Teste.
  */ 
public class ex5 
	{    
    	public static void main(String[] args) 
    	{
      		Scanner ler = new Scanner(System.in);
      		float preco=0, total=0;
     		System.out.println("Calculo do total da compra. \nDigite 0 caso deseje encerrar a compra\n");
     		do 
     			{    
         			System.out.println("Digite o preco: ");
     				preco = ler.nextInt();
     				while (preco<0)
     					{
         					System.out.println("Digite o preco novamente: ");
           					preco = ler.nextInt();
     					}
      				total=total+preco;  
    			}  
			while (preco!=0);  
     		System.out.printf("Total=%f",total);        
    	}
    }
