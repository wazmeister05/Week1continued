import java.util.Scanner;

public class DangerHighVoltage {

    private int unitsUsed;
    private double total;

    public static void main(String[] args){
        run();
    }

    private double total() {
        if (unitsUsed <= 100){
            total = unitsUsed * 26.7;
        }
        else if (unitsUsed > 100){
            int unitsOver = unitsUsed - 100;
            total = (100 * 26.7) + (unitsOver * 15.6);
        }
        return total;
    }

    public DangerHighVoltage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many units have been used so far: ");
        unitsUsed = scanner.nextInt();
    }

    public static void run(){
        DangerHighVoltage dhv = new DangerHighVoltage();
        System.out.println(dhv.total() + "p used.");

    }
}
