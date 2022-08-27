package GFG;

public class Passing2DArray {
    public static void print(int [][] arr){
        for(int i=0;i<arr.length;i++){ //Number of rows- It represents Number of Objects
            for(int j=0;j<arr[i].length;j++){  //Number of Column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int [][] arr= {{1,2,3},{4,5,6}};
        print(arr);
    }
}
