package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_UNITS = 100;
    private static final String defaultColor = "WHITE";
    private static final int defaultRadius = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier(random);
    private final String [] array = {"square","rightTriangle","rectangle",
            "isoscelesTrapezoid","circle"};

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    private int getRandomNumber() {
        return random.nextInt(array.length);
    }

    public Figure getRandomFigure() {
        if ("square".equals(array[getRandomNumber()])) {
            return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE_UNITS));
        } else if ("rightTriangle".equals(array[getRandomNumber()])) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE_UNITS), random.nextInt(MAX_VALUE_UNITS));
        } else if ("rectangle".equals(array[getRandomNumber()])) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE_UNITS), random.nextInt(MAX_VALUE_UNITS));
        } else if ("isoscelesTrapezoid".equals(array[getRandomNumber()])) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE_UNITS), random.nextInt(MAX_VALUE_UNITS),
                    random.nextInt(MAX_VALUE_UNITS));
        }
        return new Circle(colorSupplier.getRandomColor(),random.nextInt(MAX_VALUE_UNITS));
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor,defaultRadius);
    }
}
