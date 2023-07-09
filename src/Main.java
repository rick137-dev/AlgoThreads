import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {




    public static void main(String[] args) throws InterruptedException {




        int max =100;
        System.out.println("Welcome to our program!\n");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Matrices N\n");

        Integer N = Integer.parseInt(scanner.nextLine());
        int n = N.intValue();
        int i,j;
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        System.out.println("Creating Matrices\n");



        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {

                matrix1[i][j] = (int) Math.floor(Math.random()*max);
                matrix2[i][j] = (int) Math.floor(Math.random()*max);
            }
            }
        System.out.println("Matrix 1 is:\n");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
               System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.println("Matrix 2 is:\n");
        System.out.print("\n");

        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
              System.out.print(matrix2[i][j] + " ");
            }
            System.out.print("\n");
        }

        int[][] finalMat = new int[n][n];
        int temp =0;

        int row1 =0;
        int column2 =0;
        int element =0;

       long operationCounter = 0;
       long startTime = System.nanoTime();
        for(row1=0;row1<n;row1++){
            for(column2=0;column2<n;column2++){
            for(element =0;element<n;element++){

                temp = temp+ matrix1[row1][element]*matrix2[element][column2];
                operationCounter++;
            }
           finalMat[row1][column2] = temp;
            temp =0;
            }

        }
       long endTime = System.nanoTime();

        System.out.print("\n");
        System.out.print("The multiplication of the first matrix with the second is:\n");







        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
              System.out.print(finalMat[i][j] + " ");
            }
           System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("Number of operations are: "+operationCounter);
        System.out.print("\n");
        long totalTime = endTime-startTime;
        System.out.print("The time for multiplication is: "+ totalTime*0.001 + " micro-seconds");

        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("The multiplication with MultiThreading is:\n");


        ArrayList<RowMultiplicationThread> RowThreads = new ArrayList<>();


        for(i=0;i<n;i++){
            RowMultiplicationThread RowThread= new RowMultiplicationThread(i,matrix1,matrix2);
            RowThreads.add(RowThread);

        }

       long newStartTime = System.nanoTime();
        for(i=0;i<n;i++){
            RowThreads.get(i).start();

        }
        for(i=0;i<n;i++){
            RowThreads.get(i).join();

        }
        long newEndTime = System.nanoTime();


        long newTotalTime = newEndTime-newStartTime;
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("The time taken is: " + newTotalTime*0.001+" micro-seconds");

        long newOperationsCount=0;

        for(i=0;i<n;i++){
           newOperationsCount= newOperationsCount+ RowThreads.get(i).getOperationCount();


        }


        System.out.print("\n");
        System.out.print("The number of operations with Multithreadinng is: "+ newOperationsCount);



    }








    }





