package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return generateCircle();
            case 1:
                return generateIsoscelesTrapezoid();
            case 2:
                return generateRectangle();
            case 3:
                return generateRightTriangle();
            case 4:
                return generateSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getProperty() {
        return random.nextInt(20);
    }

    private Circle generateCircle() {
        return new Circle(colorSupplier.getRandomColor(), getProperty());
    }

    private IsoscelesTrapezoid generateIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getProperty(),
                getProperty(), getProperty());
    }

    private Rectangle generateRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getProperty(), getProperty());
    }

    private RightTriangle generateRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getProperty(), getProperty());
    }

    private Square generateSquare() {
        return new Square(colorSupplier.getRandomColor(), getProperty());
    }
}
