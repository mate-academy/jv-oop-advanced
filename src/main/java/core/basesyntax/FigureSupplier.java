package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int FIGURES_COUNT = 3;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        FigureType randomFigureType = FigureType.values()[new Random().nextInt(FIGURES_COUNT)];

        switch (randomFigureType) {
            case SQUARE:
                figure = new Square(getRandomIn100to0Range(),
                        colorSupplier.getRandomColor());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(getRandomIn100to0Range(),
                        getRandomIn100to0Range(),
                        colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = new Rectangle(getRandomIn100to0Range(),
                        getRandomIn100to0Range(),
                        colorSupplier.getRandomColor());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(getRandomIn100to0Range(),
                        getRandomIn100to0Range(),
                        getRandomIn100to0Range(),
                        colorSupplier.getRandomColor());
                break;
            default:
                figure = new Circle(getRandomIn100to0Range(),
                        colorSupplier.getRandomColor());
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }

    private int getRandomIn100to0Range() {
        return new Random().nextInt(100) + 1;
    }
}
