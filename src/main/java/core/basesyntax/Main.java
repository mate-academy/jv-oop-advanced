package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        Figure[] figuresArray = {figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure()};

        for (Figure figure : figuresArray) {
            System.out.println(figure.getInfo());
        }
    }
}
