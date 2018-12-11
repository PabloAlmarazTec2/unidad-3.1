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
        Persona[] apTodos = new Persona[10];
        apTodos[0] = new Alumno();
        apTodos[1] = new Alumno();
        apTodos[2] = new Alumno();
        apTodos[3] = new Alumno();
        apTodos[4] = new Alumno();
        apTodos[5] = new Empleado();
        apTodos[6] = new Empleado();
        apTodos[7] = new Empleado();
        apTodos[8] = new Empleado();
        apTodos[9] = new Empleado();
        for (int i = 0; i < 10; i++) {
            //si es alumno llenarlo con juan eperez y 0011
            //si es mepleado llenarlo con pedro  paramo y 1000
            if(apTodos[i] instanceof Alumno){
            Alumno aObjt = (Alumno)apTodos[i];
            aObjt.nombre = "juan";
            aObjt.apellido = "juan";
            aObjt.noControl = "0011";
            
            
            } else {
            Empleado aObjt2 = (Empleado)apTodos[i];
             aObjt2.nombre = "juan";
            aObjt2.apellido = "paramo";
            aObjt2.claveEmpleado = 100;
            
            }
            System.out.println(apTodos);
        }
        
    }
    
}
class Empleado extends Persona{
 int claveEmpleado;

}
class Alumno extends Persona
{
String noControl;

}
class Persona
{
String nombre;
String apellido;

}