import java.util.Scanner;
/**
  * 11) Ler o número de alunos existentes em uma turma e, após isto, ler as notas
destes alunos, calcular e escrever a média aritmética das sala.
  */ 
public class ex11 
	{
    	public static void main(String[] args) 
    		{
      				Scanner ler = new Scanner(System.in);
      				float soma=0, nota=0,r=0;
      				int x=0;
      				System.out.println("Digite a quantidade de alunos:");
      				x = ler.nextInt();
      				for (int i=1; i<=x; i++) 
                		{                    
                   			System.out.printf("Digite a nota do %d º aluno:", i);
                    		nota = ler.nextFloat();
                    		soma=soma+nota;
                		}
      				r=soma/x;
      				System.out.printf("Resultado = %f", r);
      
    		}
    }
