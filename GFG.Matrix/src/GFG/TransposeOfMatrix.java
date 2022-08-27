package GFG;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void transposeOfMatrix(int [][] arr){  //MyCode
        int r=arr.length;
        int c=arr[0].length;
        if(r==c){
            for(int i=0;i<r;i++){
                for(int j=i+1;j<c;j++){
                    swap(arr,i,j);
                }
            }
        }else{
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
        transposeOfMatrix(arr);
        printArray(arr);
    }
}
