import java.util.Random;

public class MultiShapeArrayExample {
    public static void main(String[] args) {
        int[][] ratings = new int [7][5];
        completeRatings(ratings);
        printRatings(ratings);

        int[] minRatings = {60, 70, 50, 50, 70};
        int[] result = checkRatings(ratings, minRatings);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d - moduldan o'tganlar soni %d ta.\n", i+1, result[i]);
        }
    }
    static int[] checkRatings(int[][] matrix, int[] minRatings){
        int[] result = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] >= minRatings[j]){
                    result[j]++;
                }
            }
        }
        return result;
    }


    static void completeRatings(int[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(101);
            }
        }
    }
    static void printRatings(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("i = " + i+" \t");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" \t");
            }
            System.out.println();
        }
    }
}
