/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_pasoporvalorswap;

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Eva3_12_pasoporvalorswap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Valor vObj1 = new Valor();
        vObj1.iX=100;
        Valor vObj2 = new Valor();
        vObj2.iX=500;
        intercambiar(vObj1, vObj2);
        System.out.println("Objeto 1 = "+vObj1.iX+" Objeto 2 = "+ vObj2.iX);
        Valor vTemp = vObj1;
    vObj1=vObj2;
    vObj2=vTemp;
    }
    public static void intercambiar(Valor v1, Valor v2)
    {
    Valor vTemp = v1;
    v1=v2;
    v2=vTemp;
    
    }
}
class Valor{
int iX;

}