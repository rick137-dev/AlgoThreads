import java.util.Arrays;
import java.util.stream.Collectors;

public class RowMultiplicationThread extends Thread{
    int rowNumber;
    int[][] matrix1;
    int[][] matrix2;

    int operationCount =0;

    int id;
    public RowMultiplicationThread(int rowNumber, int[][] mat1, int[][] mat2){
        this.rowNumber=rowNumber;
        this.matrix1 = mat1;
        this.matrix2 = mat2;

    }


    public int getOperationCount(){
        return this.operationCount;
    }
    @Override
    public void run(){
        int length = matrix1[0].length;
        int[] resultVector = new int[length];
        int temp = 0;
        int column2=0;
        int element =0;

            for(column2=0;column2<length;column2++){
                for(element =0;element<length;element++){

                    temp = temp+ matrix1[rowNumber][element]*matrix2[element][column2];
                    operationCount++;
                }
                resultVector[column2] = temp;
                temp =0;


        }

       System.out.println(Arrays.toString(resultVector));

    }


}




//associamo un thread a ogni riga della prima matrice, quindi N thread