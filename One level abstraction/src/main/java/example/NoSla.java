package example;

import java.util.Scanner;

public class NoSla {
    
    public static void runNoSla()
    {
        Scanner sc = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;

        System.out.print("Primer numero: ");
        primerNumero = Integer.parseInt(sc.nextLine());

        if(primerNumero < 0){
            System.out.println("Error: number must be positive");
            System.exit(1);
        }

        System.out.print("Segundo numero: ");
        segundoNumero = Integer.parseInt(sc.nextLine());

        if(segundoNumero < 0){
            System.out.println("Error: number must be positive");
            System.exit(1);
        }

        System.out.println("Resultado: " + (primerNumero + segundoNumero));
    }
}