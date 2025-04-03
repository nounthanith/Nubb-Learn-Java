public class Array2D {
    public static void main(String[] args){
        int[][] numbers = {
                {1,2,3},
                {3,4,5},
                {6,7,8}
        };
        for (int i = 0; i < numbers.length; i++) {  // Rows
            for (int j = 0; j < numbers[i].length; j++) { // Columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
