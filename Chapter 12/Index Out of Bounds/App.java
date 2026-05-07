import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int[] genNum = new int[100];

        for (int i = 0; i < genNum.length; i++) {
            genNum[i] = (int)(Math.random() * 100);
        }

        System.out.println("Please select an array index (0-99): ");
        int x = input.nextInt();

        try {
            System.out.println(genNum[x]);
        } catch (Exception e) {
            System.err.println("Out of Bounds");
        }
    }

    
}
