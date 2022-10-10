package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        final int figureParameter = 10;
        final String color = Color.WHITE.name().toLowerCase();
        Figure figure = new Circle(figureParameter);
        figure.setColor(color);
        return figure;
    }

    public Figure getRandomFigure() {
        Figure figure = getFigure(random.nextInt(FIGURE_COUNT));
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getFigure(int figureNumber) {
        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomIsoscelesRightTriangle();
        }
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(MAX_VALUE + 1));
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(MAX_VALUE + 1));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_VALUE + 1), random.nextInt(MAX_VALUE + 1));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE + 1), random.nextInt(MAX_VALUE + 1),
                random.nextInt(MAX_VALUE + 1));
    }

    private Figure getRandomIsoscelesRightTriangle() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE + 1), random.nextInt(MAX_VALUE + 1),
                random.nextInt(MAX_VALUE + 1));
    }
}
