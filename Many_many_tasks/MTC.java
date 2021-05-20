import java.io.*;

public class MTC {
    public static void main(String[] args){
        String pathIn = "D:\\Java_Projects\\Many_many_tasks\\46980249b74048838629d39be9278bb7.tar";
        String pathOut = "D:\\Java_Projects\\Many_many_tasks\\Test.txt";

        try(FileInputStream reader = new FileInputStream(pathIn);
            FileOutputStream writer = new FileOutputStream(pathOut))
        {
            while (reader.available() > 0){
                writer.write(reader.read());
            }
        } catch (IOException e){
        }

    }
}
