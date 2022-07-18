package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figuresNumber = 5;
        int countFigure = random.nextInt(figuresNumber);
        switch (countFigure) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomDouble());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt(),getRandomDouble(),getRandomDouble());
            case 4:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomInt() {
        int maxRandomNamber = 25;
        return new Random().nextInt(maxRandomNamber);
    }

    private double getRandomDouble() {
        return new Random().nextInt();
    }

    public static Figure getDefaultFigure() {
        final Color defaultColor = Color.WHITE;
        int defaultRadius = 10;
        return new Circle(defaultColor.toString(), defaultRadius);
    }
}
