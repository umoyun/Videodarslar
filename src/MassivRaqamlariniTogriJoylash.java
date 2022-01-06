public class MassivRaqamlariniTogriJoylash {
    public static void main(String[] args) {
        int massiv[] = {2, 6, 9, 7, 0, 5, 1};
        for(int i = 0; i < massiv.length; i++)
            System.out.printf("%d, ", massiv[i]);
        System.out.println();
        int a;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < i; j++) {
                if (massiv[i] < massiv[j]) {
                    a = massiv[i];
                    massiv[i] = massiv[j];
                    massiv[j] = a;
                }
            }
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.printf("%d, ", massiv[i]);
        }
    }
}
