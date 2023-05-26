package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_VALUE = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = this.random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 1:
                return getCircle();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            case 4:
                return getIsoscelesTrapezoid();
            case 5:
                return getSquare();
            default:
                return getRightTriangle();
        }
    }

    private Figure getCircle() {
        int radius = random.nextInt(MAX_RANDOM_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Circle(radius,color);
    }

    private Figure getRectangle() {
        int firstLeg = random.nextInt(MAX_RANDOM_VALUE);
        int secondLeg = random.nextInt(MAX_RANDOM_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Rectangle(firstLeg,secondLeg,color);
    }

    private Figure getIsoscelesTrapezoid() {
        int firstBase = random.nextInt(MAX_RANDOM_VALUE);
        int secondBase = random.nextInt(MAX_RANDOM_VALUE);
        int height = random.nextInt(MAX_RANDOM_VALUE);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(firstBase,secondBase,height,color);
    }

    private Figure getRightTriangle() {
        int firstLeg = random.nextInt(MAX_RANDOM_VALUE);
        int secondLeg = random.nextInt(MAX_RANDOM_VALUE);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg,secondLeg,color);
    }

    private Figure getSquare() {
        int side = random.nextInt(MAX_RANDOM_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Square(side,color);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS,DEFAULT_COLOR);
    }
}
