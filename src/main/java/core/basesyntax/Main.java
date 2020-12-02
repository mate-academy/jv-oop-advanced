package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_FIGURES_NUMBER = 20;

    public static void main(String[] args) {
        Random random = new Random();
        FigureGenerator figureGenerator = new FigureGenerator();
        Figure[] figures = new Figure[random.nextInt(MAX_FIGURES_NUMBER)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureGenerator.getFigure();
        }
        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
