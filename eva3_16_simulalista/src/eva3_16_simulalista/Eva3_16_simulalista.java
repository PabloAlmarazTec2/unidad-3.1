/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_16_simulalista;

/**
 *
 * @author Pablo Almaraz avalos 18550326
 */
public class Eva3_16_simulalista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Arreglos
        //Tipos de datos genericos
        //Simular una lista--> Crear un arreglo que almacene cualquier tipo de dato
       List[] aA = new List[10];
       aA[0]= new <Integer>List();
       aA[1]= new <Integer>List();
       aA[2]= new <Integer>List();
       aA[3]= new <Integer>List();
       aA[4]= new <Integer>List();
       aA[5]= new <Integer>List();
       aA[6]= new <Integer>List();
       aA[7]= new <Integer>List();
       aA[8]= new <Integer>List();
       aA[9]= new <Integer>List();
       aA[0].setApo(100);
        System.out.println(aA[0].getApo());
    }
    
}
class List <S> {
private S apo;
private String dato;

    public S getApo() {
        return apo;
    }

    public void setApo(S yolo) {
        this.apo = apo;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

}