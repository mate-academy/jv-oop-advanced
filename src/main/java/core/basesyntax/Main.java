package core.basesyntax;

import core.basesyntax.generator.FigureSupplier;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = FigureSupplier.generateFigure(50);
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
