package ru.akorolev.ioexam;

import java.io.*;

/**
 * Created by akorolev on 6/14/14.
 */
public class BufferedExample {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
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

    public void write(String str) throws FileNotFoundException {
        printStream = new PrintStream(path);
        printStream.print(str);
        printStream.close();
    }

    public void printWithBuffer(String str) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File(path));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write(str);
        writer.close();
    }
}
