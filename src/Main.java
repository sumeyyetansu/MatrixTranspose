
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int [][] matrix = new int[n][q];
        int [][] matrixTrans= new int[q][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
                matrixTrans [column] [row] =  matrix[row][column] ;
            }
        }


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 0; row < matrixTrans.length; row++) {
            for (int column = 0; column < matrixTrans[row].length; column++) {
                System.out.print(matrixTrans[row][column] + " ");
            }
            System.out.println();
        }
    }
}