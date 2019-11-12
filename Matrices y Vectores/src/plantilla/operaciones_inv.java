/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

/**
 *
 * @author May
 */
public class operaciones_inv {

    int[][] matriza;
    double[][] matrizb;
    double[][] matrizc;

    public double[][] inversa(int[][] matriz) {

        matriza = matriz.clone();
        matrizb = new double[matriz.length][matriz.length];   //matriz de los términos independientes
        matrizc = new double[matriz.length][matriz.length];
//matriz unidad
        for (int i = 0; i < matriz.length; i++) {
            matrizb[i][i] = 1.0;
        }
//transformación de la matriz y de los términos independientes
        for (int k = 0; k < matriz.length - 1; k++) {
            for (int i = k + 1; i < matriz.length; i++) {
//términos independientes
                for (int s = 0; s < matriz.length; s++) {
                    matrizb[i][s] -= matriza[i][k] * matrizb[k][s] / matriza[k][k];
                }
//elementos de la matriz
                for (int j = k + 1; j < matriz.length; j++) {
                    matriza[i][j] -= matriza[i][k] * matriza[k][j] / matriza[k][k];
                }
            }
        }
//cálculo de las incógnitas, elementos de la matriz inversa
        for (int s = 0; s < matriz.length; s++) {
            matrizc[matriz.length - 1][s] = matrizb[matriz.length - 1][s] / matriza[matriz.length - 1][matriz.length - 1];
            for (int i = matriz.length - 2; i >= 0; i--) {
                matrizc[i][s] = matrizb[i][s] / matriza[i][i];
                for (int k = matriz.length - 1; k > i; k--) {
                    matrizc[i][s] -= matriza[i][k] * matrizc[k][s] / matriza[i][i];
                }
            }
        }
        return matrizc;
    }

}
