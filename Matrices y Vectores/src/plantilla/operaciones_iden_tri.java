/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

import javax.swing.JOptionPane;

/**
 *
 * @author May
 */
public class operaciones_iden_tri {

    int matrizresult[][];

    public operaciones_iden_tri() {
    }

    public int[][] matriztriangularinferior(int matriza[][]) {
        matrizresult = new int[matriza.length][matriza.length];
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                matrizresult[i][j] = matriza[i][j];
            }
        }

        for (int j = 1; j < matriza.length; j++) {
            for (int i = 0; i < matriza.length; i++) {
                if (i < j) {
                    if (matriza[i][j] != 0) {
                        matrizresult[i][j] = 0;
                        //  System.out.println("matrizponemoscero "+matrizresult[i][j]);
                    } else if (matriza[i][j] == 0) {
                        matrizresult[i][j] = matriza[i][j];
                        // System.out.println("matriz "+matrizresult[i][j]);
                    }
                }
            }
        }

        return matrizresult;
    }

    public int[][] matriztriangularsuperior(int matriza[][]) {
        matrizresult = new int[matriza.length][matriza.length];
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                matrizresult[i][j] = matriza[i][j];
            }
        }

        for (int i = 1; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                if (j < i) {
                    if (matriza[i][j] != 0) {
                        matrizresult[i][j] = 0;
                    } else if (matriza[i][j] == 0) {
                        matrizresult[i][j] = matriza[i][j];
                    }
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
        //comparacion
        int cont = 0;
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                if (matriza[i][j] != matrizresult[i][j]) {
                    cont++;
                    break;
                }
            }
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "La matriz SI es idempotente");
        } else {
            JOptionPane.showMessageDialog(null, "La matriz NO es idempotente");
        }

    }
}
