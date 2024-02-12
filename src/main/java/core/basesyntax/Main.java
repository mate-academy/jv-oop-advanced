package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int RANDOM_NUMBER_OF_FIGURES = 50;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresPool = new Figure[random.nextInt(RANDOM_NUMBER_OF_FIGURES)];
        int splitIndex = figuresPool.length / 2;
        initializePoolOfFigures(figuresPool, splitIndex, figureSupplier);
        printInfo(figuresPool);
    }

    private static void printInfo(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }

    private static void initializePoolOfFigures(
            Figure[] figuresPool,
            int splitIndex,
            FigureSupplier figureSupplier) {
        for (int i = 0; i < figuresPool.length; i++) {
            if (i < splitIndex) {
                figuresPool[i] = figureSupplier.getRandomFigure();
            } else {
                figuresPool[i] = figureSupplier.getDefaultFigure();
            }
        }
    }
}
