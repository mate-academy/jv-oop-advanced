package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {

        Figure randomFigure;

        int randomType = random.nextInt(5 - 1 + 1) + 1;
        switch (randomType) {
            case 1 -> randomFigure = new Circle();
            case 2 -> randomFigure = new Rectangle();
            case 3 -> randomFigure = new Square();
            case 4 -> randomFigure = new IsoscelesTrapezoid();
            case 5 -> randomFigure = new RightTriangle();
            default -> throw new IllegalStateException();
        }
        randomFigure.generateRandomParameters();
        return randomFigure;
    }

    public Figure getDefaultFigure() {

        Figure defaultFigure;
        int randomType = random.nextInt(5 - 1 + 1) + 1;
        switch (randomType) {
            case 1 -> defaultFigure = new Circle();
            case 2 -> defaultFigure = new Rectangle();
            case 3 -> defaultFigure = new Square();
            case 4 -> defaultFigure = new IsoscelesTrapezoid();
            case 5 -> defaultFigure = new RightTriangle();
            default -> throw new IllegalStateException();
        }
        defaultFigure.generateDefaultParameters();
        return defaultFigure;

    }

}
