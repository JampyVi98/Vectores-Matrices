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
public class Operaciones_basicas {

   int matrizresult[][];

    public Operaciones_basicas() {
    }

    public int[][] suma(int matriza[][], int matrizb[][], int fil, int col) {
        matrizresult = new int[fil][col];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matrizresult[i][j] = ((matriza[i][j] + matrizb[i][j])) ;
                // System.out.println("marerer "+(matrizresult[i][j]));
            }
        }
        return matrizresult;
    }

    public int[][] resta(int matriza[][], int matrizb[][], int fil, int col) {
        matrizresult = new int[matriza.length][matriza.length];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matrizresult[i][j] = ((matriza[i][j] - matrizb[i][j])) ;
                //System.out.println("marerer "+(matrizresult[i][j]));
            }
        }
        return matrizresult;
    }

    
    public int[][] multiplicacion(int matriza[][], int matrizb[][], int Afil, int Bfil, int columna) {
        matrizresult = new int[matriza.length][matriza.length];

        for (int i = 0; i < Afil; i++) {
            for (int j = 0; j < Bfil; j++) {
                for (int k = 0; k < columna; k++) {
                 matrizresult[i][j] += ((matriza[i][k] * matrizb[k][j]));
              //  System.out.println("marerer " + (matrizresult[i][j]));   
                }
                
            }
        }
        return matrizresult;
    }
    
      public int[][] productoescalar(int matriza[][],  int escalar, int fil, int col) {
        matrizresult = new int[fil][col];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {               
                 matrizresult[i][j] = (escalar*(matriza[i][j]));             
               
            }
        }
        return matrizresult;
    }
//        public int[][] productoescalarB( int matrizb[][], int escalar) {
//        matrizresult = new int[matrizb.length][matrizb.length];
//
//        for (int i = 0; i < matrizb.length; i++) {
//            for (int j = 0; j < matrizb.length; j++) {
//               
//                 matrizresult[i][j] += (escalar*(matrizb[i][j]));              
//                
//            }
//        }
//        return matrizresult;
//    }
}
