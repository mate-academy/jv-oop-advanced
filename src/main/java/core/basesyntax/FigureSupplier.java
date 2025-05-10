package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final String DEFAULT_COLOR = Color.WHITE.name();
    static final int DEFAULT_RADIUS = 10;
    static final int RANGE = 100;
    static final int AMOUNT_OF_FIGURE = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(AMOUNT_OF_FIGURE);
        switch (randomFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomCircle();
            default:
                throw new IllegalStateException("Incorrect value: " + randomFigure);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int randomSize() {
        return random.nextInt(RANGE);
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        return new Square(color, randomSize());
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, randomSize(), randomSize());
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, randomSize(), randomSize());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(randomSize(), randomSize(), randomSize(), color);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        return new Circle(color, randomSize());
    }
}
