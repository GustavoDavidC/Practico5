
package Entidades;


public class Arreglo {
    
    public static void sumarLista(int arr[]){
       int suma=0;
        for(int i:arr){
            suma+=i;
        }
        System.out.println("La suma es: "+suma+" y el promedio es: "+suma/arr.length);
    }
    
    public static int buscarMayor(int arr[][]){
        int mayor=arr[0][0]; //inicializo con un valor del arreglo
        for (int[] arr1 : arr) {
            for (int colum : arr1) {
                if(mayor<colum){
                    mayor=colum;
                }
            }
        }
        return(mayor);
    }
    
    public static int cuentaVocales(String vocales){
        int cantidad=0;
        
        for(int i=0; i<vocales.length(); i++){
            if(vocales.charAt(i)=='a'||vocales.charAt(i)=='e'||vocales.charAt(i)=='i'||vocales.charAt(i)=='o'
                    ||vocales.charAt(i)=='u'||vocales.charAt(i)=='A'||vocales.charAt(i)=='E'||vocales.charAt(i)=='I'
                    ||vocales.charAt(i)=='O'||vocales.charAt(i)=='U'){
                cantidad+=1;
            }
        }
        
        return(cantidad);
    }
    
    public static int cuentaCaracter(String cadena, char letra){
        int cantidad=0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==letra){
                cantidad+=1;
            }
        }
        return(cantidad);
       
    }
}

