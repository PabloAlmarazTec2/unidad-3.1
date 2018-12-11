
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
        //usando excepciones y ciclos, pregutar hasta
        //uq ese capturen valores validos y el divisor
        //no sea cero
            
          int  iResu=0;
        while (true) {            
            
        Scanner input = new Scanner(System.in);
    try{
        System.out.println("divisor");
        int divi = input.nextInt();
        System.out.println("dividendo");
        int dividendo = input.nextInt();
        iResu = dividendo / divi;
        break;
    }catch(ArithmeticException e)
    {
        System.out.println("el divisor es 0");
    
    }
    catch(InputMismatchException e)
    {
        System.out.println("tienen que ser valores numericos");
    
    }
    System.out.println("= "+iResu);
         }
       
        //mostrar el resultado de la división
         
        
    }
    
}
