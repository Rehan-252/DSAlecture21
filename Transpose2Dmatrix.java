import java.util.Scanner;
class Transpose2Dmatrix{
    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void swap(int arry[][],int i, int j,int k){
        int temp = arry[i][j];
        arry[i][j] = arry[i][k];
        arry[i][k] = temp;
    }
    
    static void transpose(int arry[][]){
        int ans [][] = new int[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                ans[i][j] = arry[j][i];
            }
        }
        printarry(ans);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arry[][] = new int [4][3];
        System.out.println("Enter the elements of arry ");
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                arry[i][j] = in.nextInt();
            }
        }
        
        System.out.println();
        printarry(arry);
        transpose(arry);
        in.close();
    }
}