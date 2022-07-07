package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i=0; i<= height-1; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<=height-1-i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = height; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
