package ru.akorolev.ioexam;

import java.io.IOException;

/**
 * Created by akorolev on 6/14/14.
 */
public class Main {
    private static final String PATH = "src/main/resources/input.txt";
    private static InputOutputStreamExam inputOutputStreamExam;
    private static BufferedExample bufferedExample;

    public static void main(String[] args) throws IOException {
        inputOutputStreamExam = new InputOutputStreamExam(PATH);
        inputOutputStreamExam.readFile();
        inputOutputStreamExam.writeToFile("Hello");

        bufferedExample = new BufferedExample(PATH);
        bufferedExample.read();
        bufferedExample.write("LOL");

    }
}
