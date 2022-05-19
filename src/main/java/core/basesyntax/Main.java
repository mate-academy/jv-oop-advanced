package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random);
        Figure firstFigure = figureSupplier.getRandomFigure();
        Figure secondFigure = figureSupplier.getRandomFigure();
        Figure thirdFigure = figureSupplier.getRandomFigure();
        Figure fourthFigure = figureSupplier.getDefaultFigure();
        Figure fifthFigure = figureSupplier.getDefaultFigure();
        Figure sixthFigure = figureSupplier.getDefaultFigure();
        Figure[] figures = {firstFigure, secondFigure, thirdFigure,
                fourthFigure, fifthFigure, sixthFigure};
        for (Figure figure : figures) {
            figure.drawInfo();
        }
    }
}
