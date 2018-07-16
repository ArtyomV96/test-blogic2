import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {

    public static String inpString;
    public static String pathString;

    public static void main(String[] args) {
        inputDate();
        writeToFile(pathString, inpString);
    }

    public static void inputDate() {
        Scanner keyboard = new Scanner(in);
        System.out.println("Введите строку:");
        inpString = keyboard.nextLine();
        while (inpString.isEmpty()) {
            System.err.println("Пустая строка");
            System.out.println("Введите строку:");
            inpString = keyboard.nextLine();
        }

        System.out.println("Введите путь до файла:");
        pathString = keyboard.nextLine();
        while (pathString.isEmpty()) {
            System.err.println("Пустая строка");
            System.out.println("Введите путь до файла:");
            pathString = keyboard.nextLine();
        }
    }

    public static boolean writeToFile(String path, String text){
        try {
            FileReader reader = new FileReader(path);
            Scanner scan = new Scanner(reader);
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("\n"+text);
            bufferWriter.close();
            reader.close();
            scan.close();
            System.out.println("Строка " + text + " добавлена к файлу " + path);
            return true;
        } catch (IOException e) {
            System.err.println(e);
            return false;
        }
    }
}
