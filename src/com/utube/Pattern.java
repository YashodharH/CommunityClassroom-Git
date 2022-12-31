package com.utube;

public class Pattern {
    public static void main(String[] args) {
        int[][] a;
        a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        for (int k = 0; k <a.length ; k++) {
            for (int l = 0; l <a.length ; l++) {
                System.out.print(a[k][l]+10+" ");
            }
            System.out.println();

        }
        for (int m = 0; m <a.length ; m++) {
            for (int n = 0; n <a.length ; n++) {
                System.out.print(a[m][n]+10+" ");
            }
            System.out.println();

        }
    }
}
