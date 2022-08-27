package GFG;

import java.util.Scanner;

public class SearchRowwiseAndColumnwiseSortedMatrix {
    static class point{
        int x;
        int y;
        point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public static point searchInColumnRowSortedMatrix1(int [][] arr, int x){ //GFG Naive
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              if(arr[i][j]==x){
                  return new point(i,j);
              }
          }
      }
        System.out.println("Not Found");
      return null;
    }

    public static void searchInColumnRowSortedMatrix2(int [][] arr, int x){
        int top=0;
        int right=arr[0].length-1;
        int r=arr.length-1;
        int c=arr[0].length-1;
        while(top<=r && right>=0){
            if(arr[top][right]==x){
                System.out.println(top+" "+right);
                return;
            }else if(arr[top][right]>x){
                right--;
            } else if(arr[top][right]<x) {
                top++;
            }
        }
        System.out.println("Not Found");
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
        point p=searchInColumnRowSortedMatrix1(arr,29);
        System.out.println(p.x+" "+p.y);

        searchInColumnRowSortedMatrix2(arr,29);


    }
}
