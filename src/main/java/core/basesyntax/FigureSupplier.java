package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomCircle() {
        return new Circle(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(supplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getRandomSquare() {
        return new Square(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE);
        Figure randomFigure = null;
        switch (index) {
            case 1: randomFigure = getRandomRightTriangle();
                break;
            case 2: randomFigure = getRandomRectangle();
                break;
            case 3: randomFigure = getRandomIsoscelesTrapezoid();
                break;
            case 4: randomFigure = getRandomSquare();
                break;
            case 5: randomFigure = getRandomCircle();
                break;
            default: randomFigure = getDefaultFigure();
        }
        return randomFigure;
    }
}
