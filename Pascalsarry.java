import java.util.Scanner;
public class Pascalsarry {

    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pascal(int num){
        int arry[][] = new int[num][];
        for(int i = 0; i < num; i++){
            arry[i] = new int[i+1];
            arry[i][0] = arry[i][i] = 1;

            for(int j = 1; j < i; j++){
                arry[i][j] = arry[i-1][j] + arry[i-1][j-1];
            }
        }

        printarry(arry);
    }
    
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("ENTER YOUR NUMBER ");
            int num = in.nextInt();
            pascal(num);
            in.close();
        }
        
    }
}
