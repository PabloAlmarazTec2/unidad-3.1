/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_15_listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo Almaraz avalos #18550326
 */
public class Eva3_15_listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     List <Integer>lsMiLista = new ArrayList();
        lsMiLista.add(50);
        lsMiLista.add(100);
        lsMiLista.add(200);
        lsMiLista.add(300);
        lsMiLista.add(90);
        System.out.println(lsMiLista);
        System.out.println("");
        for (int i = 0; i < lsMiLista.size(); i++) {
            System.out.println(lsMiLista.get(i));
        }
    }
    
}
