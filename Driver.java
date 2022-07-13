import java.util.Arrays;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 49;
        int slots = 6;
        int[] lottery = new int[slots];
        boolean isRepeated;
        int randomNumber = 0;

        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
            do {
                isRepeated = false;
                randomNumber = random.nextInt(max + 1 - min) + min;
                for (int k = 0; k <= indexDrawn; k++) {
                    if (lottery[k] == randomNumber) {
                        isRepeated = true;
                        break;
                    }
                }
            } while(isRepeated);
            lottery[indexDrawn] = randomNumber;
        }
        Arrays.sort(lottery);
        System.out.println("The result of the lottery: ");
        for (int i = 0; i < slots; i++) {
            System.out.print(lottery[i] + " ");
        }
    }
}