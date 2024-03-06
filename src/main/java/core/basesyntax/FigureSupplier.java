package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static Random randomGenerator = new Random();

    public static Figure getRandomFigure() {
        int figureChoice = randomGenerator.nextInt(6);
        switch (figureChoice) {
            case 1:
                return new Circle(ColorSupplier.getRandomColor(), randomGenerator.nextInt(100));
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        randomGenerator.nextInt(100),
                        randomGenerator.nextInt(100));
            case 3:
                return new Square(ColorSupplier.getRandomColor(), randomGenerator.nextInt(100));
            case 4:
                return new Rectangle(ColorSupplier.getRandomColor(), randomGenerator.nextInt(100),
                        randomGenerator.nextInt(100));
            case 5:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        randomGenerator.nextInt(100),
                        randomGenerator.nextInt(100), randomGenerator.nextInt(100));

            default:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        randomGenerator.nextInt(80),
                        randomGenerator.nextInt(100),randomGenerator.nextInt(50));
        }
    }
}







