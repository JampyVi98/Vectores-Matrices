/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

/**
 *
 * @author Usuario
 */
public class Operaciones_buscar_vec {

    public int busquedaBinaria(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }
    
    public int busquedaSecuencial(int vector[], int dato) {
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==dato) {
                posicion=i;
                break;
            }
        }
        return posicion;
    }
    
    public int busquedaHash(int vector[], int dato) {
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==dato) {
                posicion=i;
                break;
            }
        }
        return posicion;
    }

}
