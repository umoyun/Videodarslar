public class MassivKattaKichik {
    public static void main(String[] args) {
        int massiv [] = {-96, 5, 4, 9, 50, 18, 3};
        int engKattaQiymat= massiv[0];
        int engKichikQiymat= massiv[0];
        for (int i=0; i<massiv.length; i++){
            if(engKattaQiymat<massiv[i]){
                engKattaQiymat=massiv[i];
            }
        }
        for (int i=0; i<massiv.length; i++){
            if(engKichikQiymat>massiv[i]){
                engKichikQiymat=massiv[i];
            }
        }
        System.out.printf("Masssivning eng kichik qiymati: %d", engKichikQiymat);
        System.out.println(" ");
        System.out.printf("Massivning eng katta qiymati: %d", engKattaQiymat);
    }
}
