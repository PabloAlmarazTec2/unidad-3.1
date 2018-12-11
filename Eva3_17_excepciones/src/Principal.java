
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
     
         int iResu=0;
        try{
        //instrucciones que pueden generar excepcion{
              System.out.println("divisor");
        int divi = input.nextInt();
        System.out.println("divieiendo:");
        int dividendo = input.nextInt();
           
         iResu = dividendo / divi;
         
        }catch(ArithmeticException e)
        {
            System.out.println("el divisor es cero, no se puede realizar la división");
        }
        catch(InputMismatchException e){
            System.out.println("el valor capturado no es un numero valido");
        }
        //instrucciones a ejecutar en caso de rror
        System.out.println("Resultado "+iResu);
    }
    
}
