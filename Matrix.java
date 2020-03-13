import java.util.Random;
import java.util.Scanner;

public class Matrix{
    private static final short n = 5;

    public static void main(String[] args) {

        System.out.println("Андрій Аврамич ПІ-217");
        
        short arr[][] = new short[n][n];
        Random rand = new Random();

        ///////////////////////////////////////////////////

        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                arr[i][j] = (short) rand.nextInt(100);
            }
        }

        /////////////////////////////////////////////////////

        Disp(arr);//fgfgf

        /////////////////////////////////////////////////////
        System.out.println("За якм стовбцем сортувати?");

        Scanner in = new Scanner(System.in);

        short k = (short) in.nextInt();
        in.close();
        k--;
	    short[] temp;
	    for(int i = 0; i < n; i++) {
	        for(int j = i; j > 0; j--) {
	            if (arr[j][k] > arr[j-1][k]) {
	                temp = arr[j];
	                arr[j] = arr[j-1];
	                arr[j-1] = temp;
                }}}

        ///////////////////////////////////////////////////////
        Disp(arr);

    }
    public static void Disp(short[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6d ",arr[i][j]);
            }
        System.out.println();
        }}
}