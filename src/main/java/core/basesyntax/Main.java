package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int maxSize = new Random().nextInt(100);
        Figure[] figures = new Figure[maxSize];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getFigure();
        }
        
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
