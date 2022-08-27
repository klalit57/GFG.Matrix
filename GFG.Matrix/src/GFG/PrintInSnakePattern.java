package GFG;

import java.util.Scanner;

public class PrintInSnakePattern {
    public static void printSnakePattern(int [][]arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }else{
                for (int j =arr[i].length-1 ; j >=0 ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
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
        printSnakePattern(arr);
    }
}
