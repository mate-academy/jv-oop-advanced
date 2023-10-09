package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure = new Circle(getRandomInt(100), colorSupplier.getRandomColor());
        FigureType randomFigureType = FigureType.values()[new Random().nextInt(4)];

        switch (randomFigureType) {
            case CIRCLE:
                figure = new Circle(getRandomInt(100), colorSupplier.getRandomColor());
                break;
            case SQUARE:
                figure = new Square(getRandomInt(100), colorSupplier.getRandomColor());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(getRandomInt(100),
                        getRandomInt(100),
                        colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = new Rectangle(getRandomInt(100),
                        getRandomInt(100),
                        colorSupplier.getRandomColor());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(getRandomInt(100),
                        getRandomInt(100),
                        getRandomInt(100),
                        colorSupplier.getRandomColor());
                break;
            default:
                figure = new Circle(getRandomInt(100),
                        colorSupplier.getRandomColor());
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }

    private int getRandomInt(int bound) {
        return new Random().nextInt(bound) + 1;
    }
}
