import java.util.Scanner;
/**8) Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno,
calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores
válidos durante a leitura (0 a 10) para cada nota.
  * 
  */ 
public class ex8 
  {
    public static void main(String[] args) 
      {
        Scanner ler = new Scanner(System.in);
        float n1=0,n2=0,r=0;
        System.out.println("Insira a primeira nota ");
        n1 = ler.nextFloat();
        while((n1<0)||(n1>10))
          {
            System.out.println("Por favor, insira um valor novamente");
            n1 = ler.nextFloat();
          }
        System.out.println("Insira a segunda nota ");
        n2 = ler.nextFloat();
        while((n2<0)||(n2>10))
          {
            System.out.println("Por favor, insira um valor novamente");
            n2= ler.nextFloat();
          }
        r=(n1+n2)/2;
        System.out.printf("Resultado = %f", r);
      }
  }





