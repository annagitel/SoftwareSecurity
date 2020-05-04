import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class nullPointerDemo {
    /**
     * this function will demonstrate a NullPointerException because of a not existing file
     */
    public static void no_file(){
        File myFile = null;
        System.out.println(myFile.toPath());
    }

    /**
     * this function will demonstrate how to avid a NullPointerException when opening a non-existing file
     */
    public static void no_file_fixed(){
        File myFile = null;
        if (myFile == null)
            System.out.println("file does not exist");
        else
            System.out.println(myFile.toPath());
    }

    /**
     * this function will demonstrate a NullPointerException because of a not existing line in an existing file
     */
    public static void no_line_in_file() throws FileNotFoundException {
        File myFile = new File("example.txt");
        Scanner sc = new Scanner(myFile);
        for (int i=0; i<10; i++){
            System.out.println(sc.nextLine());
        }
    }

    /**
     * this function will demonstrate how to avid a NoSuchElementException when reading a non-existing line from an existing file
     */
    public static void no_line_in_file_fixed() throws FileNotFoundException {
        File myFile = new File("example.txt");
        Scanner sc = new Scanner(myFile);
        for (int i=0; i<10 && sc.hasNext(); i++){
            System.out.println(sc.nextLine());

        }
        System.out.println("No more lines");
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("1: Running function without existing file, should catch NullPointerException");
        try {
            no_file();
        } catch (NullPointerException e){
            System.out.println("NullPointerException catched: " + e.getMessage());
            System.out.println("");
        }

        System.out.println("2: Running function without existing file, null should be checked inside");
        no_file_fixed();
        System.out.println("");

        System.out.println("3: Running function without existing line in file, should catch NoSuchElementException");
        try{
            no_line_in_file();
        } catch (NoSuchElementException e){
            System.out.println("NoSuchElementException catched: "+ e.getMessage());
            System.out.println("");
        }

        System.out.println("4: Running function without existing line in file, null should be checked inside");
        no_line_in_file_fixed();
    }
}
