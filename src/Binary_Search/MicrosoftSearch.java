package Binary_Search;
import java.io.*;
import java.net.URI;
import java.awt.Desktop;

public class MicrosoftSearch {
    public static void main(String[] args) throws Exception {
        // File path is passed as parameter
        File file = new File(
                "D:\\Download\\urls.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {
            // Print the string
            System.out.println(st);

            Desktop desk = Desktop.getDesktop();
            // now we enter our URL that we want to open in our
            // default browser
            desk.browse(new URI(st));
        }
    }
}

