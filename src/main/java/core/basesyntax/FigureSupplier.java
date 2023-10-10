package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figuresCount = FigureType.values().length;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        FigureType randomFigureType = FigureType.values()[random.nextInt(figuresCount)];

        switch (randomFigureType) {
            case SQUARE:
                figure = new Square(getRandomIn100to1Range(),
                        colorSupplier.getRandomColor());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(getRandomIn100to1Range(),
                        getRandomIn100to1Range(),
                        colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = new Rectangle(getRandomIn100to1Range(),
                        getRandomIn100to1Range(),
                        colorSupplier.getRandomColor());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(getRandomIn100to1Range(),
                        getRandomIn100to1Range(),
                        getRandomIn100to1Range(),
                        colorSupplier.getRandomColor());
                break;
            default:
                figure = new Circle(getRandomIn100to1Range(),
                        colorSupplier.getRandomColor());
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }

    private int getRandomIn100to1Range() {
        return random.nextInt(100) + 1;
    }
}
