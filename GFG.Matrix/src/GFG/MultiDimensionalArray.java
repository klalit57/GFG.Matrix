package GFG;

public class MultiDimensionalArray {
    public static void main(String [] args){
      //First Method
        int [][] arr1= {{1,2,3},{4,5,6}};
        for(int i=0;i<arr1.length;i++){ //Number of rows- It represents Number of Objects
            for(int j=0;j<arr1[i].length;j++){  //Number of Column
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        //Second Method
        int [][] arr2= new int[4][5]; //4 is rows or objects
        for(int i=0;i<arr2.length;i++){ //Number of rows- It represents Number of Objects
            for(int j=0;j<arr2[i].length;j++){  //Number of Column
                arr2[i][j]=10;
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        //Third Method Jagged Array
        int m=3;
        int [][] arr3= new int[m][];
        for(int i=0;i<arr3.length;i++){ //Number of rows- It represents Number of Objects
            arr3[i]= new int[i+1];
            for(int j=0;j<arr3[i].length;j++){  //Number of Column
                arr3[i][j]=10;
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }


    }
}
