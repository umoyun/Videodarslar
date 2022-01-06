import java.util.Scanner;

public class MassivniIndexniAniqlash {
    public static void main(String[] args) {
        System.out.println("Massiv ichidagi sonlardan birini kiriting: ");
        Scanner scanner=new Scanner(System.in);
        int massiv[] = {3, 2, 8, 9, 4, 0};
        int index = -1;
        int qidiruvRaqami = scanner.nextInt();
        for(int i=0; i<massiv.length; i++){
            if(massiv[i]==qidiruvRaqami) index=i;
        }
        System.out.printf("%d massivning %d-indexida joylashgan.", qidiruvRaqami, index);
    }
}
