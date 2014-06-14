package ru.akorolev.ioexam;

import java.io.*;

/**
 * Created by akorolev on 6/14/14.
 */
public class InputOutputStreamExam {
    private InputStream inputStream;
    private OutputStream outputStream;
    private String path;

    public InputOutputStreamExam(String path) {
        this.path = path;
    }

    public void readFile() throws IOException {
        inputStream = new FileInputStream(path);
        int data = inputStream.read();
        char content;
        while (data != -1) {
            content = (char) data;
            System.out.print(content);
            data = inputStream.read();
        }
        inputStream.close();
    }

    public void writeToFile(String str) throws IOException {
        outputStream = new FileOutputStream(path);
        outputStream.write(str.getBytes());
        outputStream.close();
    }
}
