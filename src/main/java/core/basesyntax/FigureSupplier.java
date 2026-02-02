package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_SIZE = 10;
    public static final int NUMBER_OF_FIGURE = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Random rand = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    public Figure getRandomFigure() {
        int type = random.nextInt(Color.values().length);
        int index = random.nextInt(NUMBER_OF_FIGURE);

        switch (index) {
            case 0:
                return createRandomCircle(colorSupplier.getRandomColor());
            case 1:
                return createRandomRightTriangle(colorSupplier.getRandomColor());
            case 2:
                return createRandomRectangle(colorSupplier.getRandomColor());
            case 3:
                return createRandomSquare(colorSupplier.getRandomColor());
            case 4:
                return createRandomIsoscelesTrapezoid(colorSupplier.getRandomColor());

            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }
    }

    public Circle createRandomCircle(String color) {
        return new Circle(random.nextInt(MAX_SIZE),color);
    }

    public RightTriangle createRandomRightTriangle(String color) {
        return new RightTriangle(color,random.nextDouble(MAX_SIZE),random.nextDouble(MAX_SIZE));
    }

    public Rectangle createRandomRectangle(String color) {
        return new Rectangle(color, random.nextDouble(MAX_SIZE),random.nextDouble(MAX_SIZE));
    }

    public Square createRandomSquare(String color) {
        return new Square(color,random.nextDouble(MAX_SIZE));
    }

    public IsoscelesTrapezoid createRandomIsoscelesTrapezoid(String color) {
        double base1 = random.nextDouble(MAX_SIZE);
        double base2 = random.nextDouble(MAX_SIZE);
        return new IsoscelesTrapezoid(color,random.nextDouble(MAX_SIZE),base1,base2);
    }
}


