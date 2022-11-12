package calculadoraexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws ExceptionDivisaoPorZero {
    float num1 = 0;
    float num2 = 0;
    float resultado;
    
        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a opção: ");
        String opcaoEscolha = teclado.nextLine();
        
            try {
                  System.out.println("Digite um número: "); 
                  num1 = teclado.nextFloat();
                  System.out.println("Digite outro número: ");
                  num2 = teclado.nextFloat();
            switch(opcaoEscolha){
            case "1":
          
            resultado = num1 + num2;

            case "2":

            resultado = num1 - num2;
            
           case "3":

            resultado = num1 * num2;
           
            case "4":

            resultado = num1 / num2;
            if(num2 == 0){
                throw new ExceptionDivisaoPorZero();
            }
            
            default:
                System.out.println("Opção inválida! Tente novamente...");
            }
                
            } catch(InputMismatchException e) {
                System.out.println(""
                        + "Caracter inválido");
            }
        }

}



