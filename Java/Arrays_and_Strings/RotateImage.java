package Arrays_and_Strings;
/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.
*/
public class RotateImage {
    public static void rotate(int[][] matrix) {
        
        int size =  matrix[0].length;
        for(int i = 0; i < (size+1)/2; i++){
            for(int j = 0; j < size/(2); j++){
                
                int temp = matrix[size - 1 -j][i];
                matrix[size - 1 - j][i] = matrix[size -1 -i][size -1 -j];
                matrix[size - 1 - i][size - 1 - j] = matrix[j][size -1 -i];
                matrix[j][size - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;

                
            }
            
            
            
        }
        printNxNMatrix(matrix,size-1);
        
    }

    public static void printNxNMatrix(int[][] matrix, int size){
        
        for(int i = 0; i <= size; i++){
            for(int j = 0; j <= size; j++){
                System.out.printf("|\t%d\t|",matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }
}
