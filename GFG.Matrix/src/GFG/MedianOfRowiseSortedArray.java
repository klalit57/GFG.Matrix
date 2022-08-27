package GFG;
import java.util.*;

public class MedianOfRowiseSortedArray {
    public static int medianOfRowiseSortedArray1(int [][] arr){ //GFG Naive
        int r=arr.length-1;
        int c=arr[0].length-1;
        int n=(r+1)*(c+1);
        int [] temp= new int[n];
        int x=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               temp[x]=arr[i][j];
               x++;
            }
        }
        Arrays.sort(temp);
        int mid=(n-1)/2;
        if(n%2==0){
            return (temp[mid]+temp[mid+1])/2;
        }else{
            return temp[mid];
        }
    }

//    public static int medianOfRowiseSortedArray2(int [][] arr){  //GFG Efficient
//
//    }
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
        System.out.println(medianOfRowiseSortedArray1(arr));
    }
}
