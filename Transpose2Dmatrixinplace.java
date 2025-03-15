import java.util.Scanner;
public class Transpose2Dmatrixinplace {
    
    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void swap(int arry[][],int i, int j){
        int temp = arry[i][j];
        arry[i][j] = arry[j][i];
        arry[j][i] = temp;
    }
    
    static int[][] transpose(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = i; j < arry[i].length; j++){
                swap(arry, i, j);
            }
        }
        return arry;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arry[][] = new int [3][3];
        System.out.println("Enter the elements of arry ");
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                arry[i][j] = in.nextInt();
            }
        }
        
        System.out.println();

        printarry(arry);

        int ans [][] = transpose(arry);
        printarry(ans);

        in.close();
    }
}
