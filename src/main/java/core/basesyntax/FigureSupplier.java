package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int radiusDefault = 10;
    public static final int figureCount = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(figureCount);
        String randomColor = getRandomColor();
        switch (randomInt) {
            case 0:
                return new Square(randomColor, random.nextInt(10));
            case 1:
                return new Rectangle(randomColor, random.nextInt(10), random.nextInt(10));
            case 2:
                return new RightTriangle(randomColor, random.nextInt(10), random.nextInt(10));
            case 3:
                return new Circle(randomColor, random.nextInt(10));
            default:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(10), random.nextInt(10),
                        random.nextInt(10));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), radiusDefault);
    }
}
