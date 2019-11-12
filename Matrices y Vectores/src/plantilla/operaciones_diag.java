/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

import javax.swing.JOptionPane;

/**
 *
 * @author Guama Diego
 */
public class operaciones_diag {

    int matrizresult[][];

    public operaciones_diag() {
    }

   
    public int[][] matidentidad(int matriza[][]) {
        matrizresult = new int[matriza.length][matriza.length];
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                matrizresult[i][j] = matriza[i][j];
            }
        }
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                if (i == j) {
                    matrizresult[i][j] = 1;
                } else {
                    matrizresult[i][j] = 0;
                }

            }

        }
        return matrizresult;
        
    }
    

    public void idempotente(int matriza[][], int columna) {
        matrizresult = new int[matriza.length][matriza.length];

        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                for (int k = 0; k < columna; k++) {
                    matrizresult[i][j] += ((matriza[i][k] * matriza[k][j]));
                }

            }
        }
        //comparando las matrices para determinar si la matriz resultado es igual a la original(idempotente)
        int cont = 0;
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                if (matriza[i][j] == matrizresult[i][j]) {
                    cont = 0;
                } else {
                    cont = 1;
                }
            }
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "La matriz SI ES idempotente");
        } else {
            JOptionPane.showMessageDialog(null, "La matriz NO en idempotente");
        }

    }
}
