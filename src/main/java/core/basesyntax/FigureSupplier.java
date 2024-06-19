package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random number = new Random();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int lowerBound = 1;
    private final int upperBound = 101;

    public Circle getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        Figure[] figures = {new Circle(colorSupplier.getRandomColor(),
                                    number.nextInt((upperBound - lowerBound) + lowerBound)),
                            new Square(colorSupplier.getRandomColor(),
                                    number.nextInt((upperBound - lowerBound) + lowerBound)),
                            new Rectangle(colorSupplier.getRandomColor(),
                                    number.nextInt((upperBound - lowerBound) + lowerBound),
                                    number.nextInt((upperBound - lowerBound) + lowerBound)),
                            new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                    number.nextInt((upperBound - lowerBound) + lowerBound),
                                    number.nextInt((upperBound - lowerBound) + lowerBound),
                                    number.nextInt((upperBound - lowerBound) + lowerBound)),
                            new RightTriangle(colorSupplier.getRandomColor(),
                                    number.nextInt((upperBound - lowerBound) + lowerBound),
                                    number.nextInt((upperBound - lowerBound) + lowerBound))};
        return figures[random.nextInt(figures.length)];

    }

}
