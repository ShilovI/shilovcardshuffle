import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MixerSetup {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int get = in.nextInt();
            if (get%2 == 1) {
                System.out.println("Incorrect value, value should be even");
            } else {
                for (int x = 2; x <= get; x = x + 2) {
                    try(FileWriter writer = new FileWriter("C:\\Users\\Davidoff244\\Desktop\\MixCounter.txt", true))
                    {
                        String text = "(" + Integer.toString(x) + ";" + Integer.toString(Mixer.counter(x)) + ") ";
                        writer.write(text);
                    }
                    catch(IOException ex){

                        System.out.println(ex.getMessage());
                    }
                }
                System.out.println("Success");
            }
        }
    }
}
