package example;

import java.util.Scanner;

public class Sla {
    Scanner sc = new Scanner(System.in);
    int primerNumero;
    int segundoNumero;

    void run(){
        getPrimerNumero();        
        getSegundoNumero();

        getSum(primerNumero, segundoNumero);
    }

    public void getPrimerNumero(){
        this.primerNumero = readNumber();
        validateNumer(this.primerNumero);
    }

    void getSegundoNumero(){
        this.segundoNumero = readNumber();
        validateNumer(this.segundoNumero);
    }

    int readNumber(){
        System.out.print("Numero: ");
        return Integer.parseInt(sc.nextLine());
    }

    void validateNumer(int number){
        if(number < 0){
            System.out.println("Error: number must be positive");
            System.exit(1);
        }
    }

    void getSum(int firstNum, int secondNum){
        System.out.println("Resultado: " + (firstNum + secondNum));
    }
    
}
