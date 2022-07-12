package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        double totalRow;
        if(height % 2 == 0)
            height += 1;
        totalRow = ( ((double)height) / 2) + 0.5;
        for(int r=(int)totalRow; r>0; r--){
            for(int c=(height/2)-r+1;c>0;c--)
                System.out.print(" ");
            for(int c=((2*r)-1);c>0;c--)
                System.out.print("*");
            System.out.println();
        }
        for(int r=1; r<(int)totalRow; r++){
            for(int c=(height/2)-r; c>0; c--)
                System.out.print(" ");
            for(int c=0; c<=((2*r)); c++)
                System.out.print("*");
            System.out.println();
        }
    }
}
