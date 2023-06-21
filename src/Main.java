import java.util.Scanner;

public class Main {

    public int[][] Multiply(int[][] matrix1, int[][] matrix2){


        return null;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to our program!\n");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of arrays N\n");

        Integer N = Integer.parseInt(scanner.nextLine());
        int n = N.intValue();
        int i,j;
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        System.out.println("Enter values of array 1\n");
        Integer temp;


        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
                temp = Integer.parseInt(scanner.nextLine());
                matrix1[i][j] = temp.intValue();
            }
            }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
               System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Enter values of array 2\n");



        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
                temp = Integer.parseInt(scanner.nextLine());
                matrix2[i][j] = temp.intValue();
            }
        }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print("\n");
        }

        int[][] finalMat = new int[n][n];


        System.out.print("\n");
        System.out.print("The multiplication of the first Matrix with the Second is:\n");

        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
                System.out.print(finalMat[i][j] + " ");
            }
            System.out.print("\n");
        }


        }










    }





