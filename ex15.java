import java.util.Scanner;
/**
  * 15) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos para coletar dados sobre o salário e número de
filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população
b) Média do número de filhos
c) Maior salário dos habitantes
d) Percentual de pessoas com salário menor que R$ 1.000,00
Obs.: O final da leituras dos dados se dará com a entrada de um salário negativo.
  */ 
public class ex15 
  {
    public static void main(String[] args) 
      {
        Scanner ler = new Scanner(System.in);
        float ms=0,s=1,mf=0,f=0,maior=0,per=0,tp=0,mss=0, mff=0, perx=0;
        while (s>0) 
          {
            System.out.println("Insira o salario");
            s= ler.nextFloat();
            if (s>0)
              {
                System.out.println("Insira o numero de filhos");
                f= ler.nextFloat();
                ms=ms+s;
                tp=tp+1;
                mf=mf+f;
                if (s>maior)
                  {
                    maior=s;
                  }
                if (s<1000)
                  {
                    per=per+1;
                  }
              }
          }
        mss=ms/tp;
        mff=mf/tp;
        perx=(100*per)/tp;
        System.out.printf ("Média de salario da população = %f\nMedia do numero de filhos = %f\nMaior salario dos habitantes = %f\nPercentual de pessoas com salario menor que R$ 1.000,00 = %f",mss,mff,maior,perx); 
      }
    
  }