import java.io.Reader;
import java.io.FileReader;

class Main {
    public static void main(String[] args) {

        char[] array = new char[100];

        try {
            Reader input = new FileReader("input.txt");
            System.out.println("Is there data in the stream?  " + input.ready());
            input.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array);

            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}