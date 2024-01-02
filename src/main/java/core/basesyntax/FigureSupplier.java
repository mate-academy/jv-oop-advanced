package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int UPPER_BOUND = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        switch (index) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 0:
                return getRandomCircle();
            default:
                System.out.println("Something went wrong");
                return getDefaultFigure();
        }
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(UPPER_BOUND),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(new Random().nextInt(UPPER_BOUND),
                random.nextInt(UPPER_BOUND),
                colorSupplier.getRandomColor());
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(UPPER_BOUND),
                colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(UPPER_BOUND),
                random.nextInt(UPPER_BOUND),
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(UPPER_BOUND),
                random.nextInt(UPPER_BOUND),
                random.nextInt(UPPER_BOUND),
                colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString());
    }
}
