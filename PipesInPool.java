import java.util.Scanner;


public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numV = Integer.parseInt(scanner.nextLine());
        int numP1 = Integer.parseInt(scanner.nextLine());
        int numP2 = Integer.parseInt(scanner.nextLine());
        double numHours = Double.parseDouble(scanner.nextLine());
        double pipe1 = numP1 * numHours;
        double pipe2 = numP2 * numHours;
        double full = pipe1 + pipe2;
        if (full <= numV) {
            double fullPercent = full/numV * 100;
            double percentPipe1 = (pipe1 / full) * 100;
            double percentPipe2 = (pipe2 / full) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", fullPercent, percentPipe1,percentPipe2);
        } else {
            double a = full - numV;
            System.out.printf("For "+numHours+ " hour the pool is overflows with %.2f liters.",a);
        }

        }
    }
