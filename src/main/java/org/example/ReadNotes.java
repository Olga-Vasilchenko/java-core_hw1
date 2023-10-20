package org.example;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadNotes {
    public static void writeNoteBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла для записи данных: ");
        String fileName = scanner.nextLine();
        FileWriter writer = new FileWriter(fileName, true);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите данные для записи: ");
        String stringTxt = scanner1.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy");
        String times = dateFormat.format(new Date());

        writer.write(stringTxt + " -> " + times);
        writer.close();
    }
}