public class MassivdaBerilganSonlarniQoshishDAsturi{
    public static void main(String[] args) {
        int massiv[] = {1, 2, 3, 5};
        int jami = 0;
        for (int i = 0; i < massiv.length; i++) {
            jami+=massiv[i];
        }
        System.out.printf("Massiv elementlari yig'indisi %d ga teng.", jami);
    }
}
