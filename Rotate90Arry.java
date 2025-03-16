public class Rotate90Arry {
    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void swap1(int arry[], int i, int j){
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }
    
    static void swap(int arry[][],int i, int j){
        int temp = arry[i][j];
        arry[i][j] = arry[j][i];
        arry[j][i] = temp;
    }
    
    static void transpose(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = i; j < arry[i].length; j++){
                swap(arry,i,j);
            }
        }
    }

    static void rotate(int arry[]){
        int i =0, j = arry.length-1;

        while(i < j){
            swap1(arry, i, j);
            i++;j--;
        }
    }
    static void revers(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            rotate(arry[i]);
        }
    }


    public static void main(String[] args) {
        int i = 1;
        int arry[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printarry(arry);
        while(i>0){
        transpose(arry);
        revers(arry);
        i--;
        }
        printarry(arry);
        

    }
}
