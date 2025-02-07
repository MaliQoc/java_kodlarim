import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\Ali\\Desktop\\IdeaProjects\\deneme.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\Ali\\Desktop\\IdeaProjects\\deneme.txt");
        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: " + file.canWrite());
        }
    }


    public static void readFile() {
        File file = new File("C:\\Users\\Ali\\Desktop\\IdeaProjects\\deneme.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ali\\Desktop\\IdeaProjects\\deneme.txt"));
            writer.newLine();
            writer.write("Ali");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}