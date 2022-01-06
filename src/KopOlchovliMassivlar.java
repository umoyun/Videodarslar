public class KopOlchovliMassivlar {
    public static void main(String[] args) {
        int massiv[][] = {{1, 9, 5, 6}, {6, 1, 2, 7}, {9, 10, 11, 12}};
        int massiv1[][] = {{12, 21, 43, 23}, {64}, {43, 67, 41}};
        System.out.println("Bu massiv: ");
        korsatish(massiv);
        System.out.println("\n Bu massiv1");
        korsatish(massiv1);
    }
    public static void korsatish(int x[][]){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
        }
    }
}
