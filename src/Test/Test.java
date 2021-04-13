
package Test;
import Entidades.Arreglo;

public class Test {

    public static void main(String[] args) {
       
        int arr1[]={1,2,3,4,5,6,7,8,9};
        
        int arr2[][]={{1,2,3},{4,5,6},{71,8,9},{1},{15,11}};
        
        String vocales="y? arraca o no arranca?";
        
         Arreglo.sumarLista(arr1);
       
         Arreglo.buscarMayor(arr2);
        
         Arreglo.cuentaVocales(vocales);
         
         Arreglo.cuentaCaracter(vocales, 'a');
    }
    
}
