import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
        //Finds the file location
        Path path = Paths.get("Exercise12_15.txt");
        String fileLocation = path.toString();
        File file = new File(fileLocation);
        Scanner input = new Scanner(file);

        //Writes the 100 randomly generated numbers
        PrintWriter output = new PrintWriter(file);
        for (int i = 0; i < 100; i++) {
            output.print((int)(Math.random() * 100) + " ");
        }

        output.close();

        //Organizes the numbers
        int[] organize = new int[100];
        organize[0] = 20;
        int smallestNum = 100;
        int currentNum = -1;
        for (int h = 0; h < 100; h++) {
            for (int i = 0; i < 100; i++) {
                currentNum = input.nextInt();
                if (smallestNum > currentNum) {
                    smallestNum = currentNum;
            }

        }
            System.out.println(smallestNum);
            
    }
}
}
