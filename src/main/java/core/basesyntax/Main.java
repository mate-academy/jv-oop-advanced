package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (Figure test : figures) {
            test = figureSupplier.getRandomFigure();
            System.out.println(test.getInformation());
        }
    }
}
