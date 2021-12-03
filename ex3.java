
/**
  * 3) Escreva um algoritmo que imprima a sequencia de Fibonacci dos 100
primeiros números.
  */ 
public class ex3 
{
    public static void main(String[] args) 
    {
    	float x = 0;
    	float y = 1; 
    	float z = 0; 
    	System.out.println("Sequencia de Fibonacci");      
    	for (int i=1;i<=100;i++)
        	{
                z = x+y;
                System.out.println(z);                         
                y=x;
                x=z;
    		}
    }
}
