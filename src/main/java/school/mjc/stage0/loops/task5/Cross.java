package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i < sideLength; i++) {
            for (int j = 1; j < sideLength; j++) {
                if(i == 4 || j == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
