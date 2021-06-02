package main2;

import behavior.Figure;
import behavior.FigureSupplier;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = FigureSupplier.getRandomFigureArray();
        FigureSupplier.printFiguresArray(figures);
    }
}
