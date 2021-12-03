import java.util.Scanner;
/**
  * 7) Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser
aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.*/ 
public class ex7 
  {
    public static void main(String[] args) 
      {
        Scanner ler = new Scanner(System.in);
        float x=0,y=1,r=0;
        System.out.println("Insira o dividendo ");
        x = ler.nextFloat();
        System.out.println("Insira o divisor");
        y = ler.nextFloat();
        while (y==0)
          {
            System.out.println("ERRO. NÃO É POSSIVEL REALIZAR UMA DIVISÃO POR ZERO. \nPor favor, insira o divisor novamente");
            y = ler.nextFloat();
          }
        r=x/y;
        System.out.printf("Resultado = %f", r);  
    }
  }


