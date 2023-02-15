package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_BOUND = 4;
    private static final int EXAMPLE_BOUND = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.toString();
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_BOUND);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();

        }
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(EXAMPLE_BOUND);
        return new Square(color, number);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(EXAMPLE_BOUND);
        return new Circle(color, number);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int number1 = random.nextInt(EXAMPLE_BOUND);
        int number2 = random.nextInt(EXAMPLE_BOUND);
        int number3 = random.nextInt(EXAMPLE_BOUND);
        return new IsoscelesTrapezoid(color, number1, number2, number3);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int number1 = random.nextInt(EXAMPLE_BOUND);
        int number2 = random.nextInt(EXAMPLE_BOUND);
        return new RightTriangle(color, number1, number2);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int number1 = random.nextInt(EXAMPLE_BOUND);
        int number2 = random.nextInt(EXAMPLE_BOUND);
        return new Rectangle(color, number1, number2);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
