package GFG;

import java.util.Scanner;

public class RotateMatrix90CCW {
    public static void rotateMatrix90CCW1(int [][] arr){  //GFG Naive Method
        int r=arr.length;
        int c=arr[0].length;
        int n=r;
        if(r==c) {
            int[][] temp = new int[r][c];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[n-j-1][i]=arr[i][j]; //(0,0)=>(3,0) | (0,1)=>(2,0) | (0,2)=>(1,0) | (0,3)=>(0,0)
                                              //row=>column && 0th column=>last row | 1st column=>2nd Last row |...| last colum=>0th row
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j]=temp[i][j];
                }
            }
        }
    }

    public static void rotateMatrix90CCW2(int [][] arr){  //GFG Efficient
        transposeOfMatrix(arr);
        for(int i=0;i<arr.length;i++){
            int low=0;
            int high=arr.length-1;
            while(low<high){
                int temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;
                high--;
            }
        }
    }

    public static void transposeOfMatrix(int [][] arr) {  //MyCode
        int r = arr.length;
        int c = arr[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = i + 1; j < c; j++) {
                    swap(arr, i, j);
                }
            }
        } else {
            System.out.println("Transpose Not Possible");
        }
    }
    public static void swap(int [][]arr, int i, int j){
        int temp =arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public static void printArray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
        rotateMatrix90CCW1(arr);
        printArray(arr);
        rotateMatrix90CCW2(arr);
        printArray(arr);
    }
}
