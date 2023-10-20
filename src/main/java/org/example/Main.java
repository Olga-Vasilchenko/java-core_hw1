package org.example;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        ReadNotes.writeNoteBook();
        System.out.println(Decorator.decorate());
    }
}