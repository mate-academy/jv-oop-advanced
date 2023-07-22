package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumberOfFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomNumberOfFigure) {
            case 0:
                Square square = new Square();
                return square.getRandomFigure();
            case 1:
                Circle circle = new Circle();
                return circle.getRandomFigure();
            case 2:
                Rectangle rectangle = new Rectangle();
                return rectangle.getRandomFigure();
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                return rightTriangle.getRandomFigure();
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                return isoscelesTrapezoid.getRandomFigure();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10.0);
    }
}
