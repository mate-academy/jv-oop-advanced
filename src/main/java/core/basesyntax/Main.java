package core.basesyntax;

import core.basesyntax.generator.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int figureCount = random.nextInt(); // You can change it if you want
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = figureSupplier.generateFigure(figureCount);
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
