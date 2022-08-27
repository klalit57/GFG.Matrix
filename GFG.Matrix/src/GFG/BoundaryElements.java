package GFG;

import java.util.Scanner;

public class BoundaryElements {
    public static void printBoundary1(int [][] arr) {  //MyCode  1X4 or 4X1 Not Satisfied
        if (arr.length==1 || arr[0].length==1) {
            if(arr.length==1){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[0][j] + " ");
                }
                System.out.println();
            }
            if(arr[0].length==1){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][0] + " ");
                }
                System.out.println();
            }
        }
        else{
                int i = 0;
                int j = 0;
                if (i == 0) {
                    for (j = 0; j < arr[i].length - 1; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                if (j == arr[i].length - 1) {
                    for (i = 0; i < arr.length - 1; i++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                if (i == arr.length - 1) {
                    for (j = arr[i].length - 1; j > 0; j--) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                if (j == 0) {
                    for (i = arr.length - 1; i > 0; i--) {
                        System.out.print(arr[i][j] + " ");
                    }
                     System.out.println();
                }
            }
    }

    public static void printBoundary2(int [][] arr){  //GFG Code
        int r=arr.length;
        int c=arr[0].length;
            if(r==1){
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[0][j] + " ");
                }
                System.out.println();
            }
            else if(c==1){
                for (int j = 0; j < r; j++) {
                    System.out.print(arr[j][0] + " ");
                }
                System.out.println();
            }
            else{
                for(int i=0;i<c;i++){
                    System.out.print(arr[0][i]+" ");
                }
                for(int i=1;i<r;i++){
                    System.out.print(arr[i][c-1]+" ");
                }
                for(int i=c-2;i>=0;i--){
                    System.out.print(arr[r-1][i]+" ");
                }
                for(int i=r-2;i>0;i--){
                    System.out.print(arr[i][0]+" ");
                }
            }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr= new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        printBoundary1(arr);

        printBoundary2(arr);
    }
}
