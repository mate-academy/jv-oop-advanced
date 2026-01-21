package core.basesyntax;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    private static Figure [] figures = new Figure[5];
    private static Figure square = new Figure();

    public static void main(String[] args) {
        for (int i = 0; i <  figures.length; i++) {
            figures[i] = new Figure();
        }
    }
}

