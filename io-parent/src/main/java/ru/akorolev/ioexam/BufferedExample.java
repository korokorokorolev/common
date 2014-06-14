package ru.akorolev.ioexam;

import java.io.*;

/**
 * Created by akorolev on 6/14/14.
 */
public class BufferedExample {
    //Символьные буферизованый потоки. для произвольных файлов -BuﬀeredInputStream
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    BufferedWriter writer;
    private String path;

    public BufferedExample(String path) {
        this.path = path;
    }
    public void read() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(path));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    @Deprecated
    public void write(String str) throws FileNotFoundException {
        printStream = new PrintStream(path);
        printStream.print(str);
        printStream.close();
    }

    public void writeWithBuffer(String str) throws IOException {
        writer = new BufferedWriter(new FileWriter(path));
        writer.write(str);
        writer.close();
    }
}
